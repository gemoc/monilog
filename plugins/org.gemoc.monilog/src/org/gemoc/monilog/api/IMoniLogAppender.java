package org.gemoc.monilog.api;

public interface IMoniLogAppender {

	void call(String message, Object... args);

	int getNbMinArgs();

	int getNbMaxArgs();

	Class<?> getArgType(int argIndex);
}
