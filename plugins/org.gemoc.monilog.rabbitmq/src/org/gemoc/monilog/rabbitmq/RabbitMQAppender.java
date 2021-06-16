package org.gemoc.monilog.rabbitmq;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

import org.gemoc.monilog.api.IMoniLogAppender;

import com.google.gson.Gson;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQAppender implements IMoniLogAppender {

	final Gson gson = new Gson();
	final ConnectionFactory factory = new ConnectionFactory();
	
	public RabbitMQAppender() {
		
	}
	
	@Override
	public void call(Object... args) {
		if (args.length == 3) {
			factory.setHost(args[2].toString());
		} else {
			factory.setHost("localhost");
		}
		try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
			channel.queueDeclare(args[1].toString(), false, false, false, null);
			channel.basicPublish("", args[1].toString(), null, args[0].toString().getBytes(StandardCharsets.UTF_8));
//			channel.basicPublish("", args[1].toString(), null, gson.toJson(args[0]).getBytes(StandardCharsets.UTF_8));
		} catch (IOException | TimeoutException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getNbMinArgs() {
		return 2;
	}

	@Override
	public int getNbMaxArgs() {
		return 3;
	}

	@Override
	public Class<?> getArgType(int argIndex) {
		switch (argIndex) {
		case 0: return Object.class;
		case 1: return String.class;
		case 2: return String.class;
		}
		return null;
	}

}
