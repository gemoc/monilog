package org.gemoc.instrument;

public interface IInstrument {

	public void notifyBefore(String rule, String element, IContextWrapper context);
	
	public void notifyAfter(String rule, String element, Object result, IContextWrapper context);
	
}
