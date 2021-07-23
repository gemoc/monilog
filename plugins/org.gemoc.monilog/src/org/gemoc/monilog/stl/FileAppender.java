package org.gemoc.monilog.stl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.gemoc.monilog.api.IMoniLogAppender;

public class FileAppender implements IMoniLogAppender {

	private String actualFilePath = null;

	private Thread currentSenderThread = null;
	
	private final BlockingQueue<String> toSend = new LinkedBlockingQueue<>();
	
	@Override
	public void call(Object... args) {
		if (actualFilePath == null) {
			final String filePath = args[1].toString();
			actualFilePath = Arrays.stream(filePath.split("/"))
					.map(segment -> segment.startsWith("$") ? System.getenv(segment.substring(1)) : segment)
					.reduce((s1, s2) -> s1 + "/" + s2).orElse("");
		}
		
		toSend.add(args[0] + "\n");
		
		if (getCurrentSenderThread() == null) {
			startSending();
		}
	}
	
	public void startSending() {
		final Thread t = new Thread(() -> {
			try (FileOutputStream  fos = new FileOutputStream(actualFilePath, true)) {
				String current = toSend.poll(1000, TimeUnit.MILLISECONDS);
				while (current != null) {
					fos.write(current.getBytes());
					current = toSend.poll(1000, TimeUnit.MILLISECONDS);
				}
				
				setCurrentSenderThread(null);
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
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
		if (argIndex == 0 || argIndex == 1) {
			return String.class;
		}
		return null;
	}
}
