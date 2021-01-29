package org.gemoc.instrument;

public interface IInstrument {

	public void notifyBefore(String name, IContextWrapper context);
	
	public void notifyAfter(String name, Object result, IContextWrapper context);
	
}
