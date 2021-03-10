package org.gemoc.monilog.stl;

import java.util.function.Consumer;

import org.gemoc.monilog.api.IMoniLogAppender;

public class ConsoleAppender implements IMoniLogAppender {

	/* TODO
	 * Find a non-ad-hoc way of directing the output of this appender to the correct console.
	 * Maybe a NabLabConsole-specific appender?
	 */
	public Consumer<String> messageConsumer;
	
	@Override
	public void call(String message, Object... args) {
		messageConsumer.accept(message);
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
