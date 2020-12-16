package org.gemoc.monilog.appender;

import org.gemoc.monilog.api.IMoniLogAppender;

public class ConsoleAppender implements IMoniLogAppender {

	@Override
	public void call(String message, Object[] args) {
		System.out.println(message);
	}

	@Override
	public int getNbMinArgs() {
		return 0;
	}

	@Override
	public int getNbMaxArgs() {
		return 0;
	}

	@Override
	public Class<?> getArgType(int argIndex) {
		return null;
	}
}
