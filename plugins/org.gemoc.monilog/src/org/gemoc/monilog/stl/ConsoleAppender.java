package org.gemoc.monilog.stl;

import org.gemoc.monilog.api.IMoniLogAppender;

public class ConsoleAppender implements IMoniLogAppender {

	@Override
	public void call(Object... args) {
		System.out.println(args[0]);
	}

	@Override
	public int getNbMinArgs() {
		return 1;
	}

	@Override
	public int getNbMaxArgs() {
		return 1;
	}

	@Override
	public Class<?> getArgType(int argIndex) {
		if (argIndex == 0) {
			return String.class;
		}
		return null;
	}
}
