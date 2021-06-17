package org.gemoc.monilog.rabbitmq;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.gemoc.monilog.api.IMoniLogAppender;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQAppender implements IMoniLogAppender {

	private final ConnectionFactory factory = new ConnectionFactory();
	private final BlockingQueue<Object[]> toSend = new LinkedBlockingQueue<>();
	
	private Thread currentSenderThread = null;
	
	public RabbitMQAppender() {
		factory.setHost("localhost");
	}
	
	@Override
	public void call(Object... args) {
		if (getCurrentSenderThread() == null) {
			startSending();
		}
		toSend.add(args);
	}
	
	private synchronized void startSending() {
		final Thread t = new Thread(() -> {
			try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
				Object[] current = toSend.poll(1000, TimeUnit.MILLISECONDS);
				while (current != null) {
					channel.queueDeclare(current[1].toString(), false, false, false, null);
					channel.basicPublish("", current[1].toString(), null, current[0].toString().getBytes(StandardCharsets.UTF_8));
					current = toSend.poll(1000, TimeUnit.MILLISECONDS);
				}
			} catch (IOException | TimeoutException | InterruptedException e) {
				e.printStackTrace();
			}
			setCurrentSenderThread(null);
		});
		this.currentSenderThread = t;
		t.start();
	}
	
	private synchronized void setCurrentSenderThread(Thread currentSenderThread) {
		this.currentSenderThread = currentSenderThread;
	}
	
	private synchronized Thread getCurrentSenderThread() {
		return this.currentSenderThread;
	}

	@Override
	public int getNbMinArgs() {
		return 2;
	}

	@Override
	public int getNbMaxArgs() {
		return 2;
	}

	@Override
	public Class<?> getArgType(int argIndex) {
		switch (argIndex) {
		case 0: return Object.class;
		case 1: return String.class;
		}
		return null;
	}

}
