package org.gemoc.monilog.api;

public interface IMoniLogLayout {

	String call(Object[] args);

	int getNbMinArgs();

	int getNbMaxArgs();
	
	Class<?> getArgType(int argIndex);
}
