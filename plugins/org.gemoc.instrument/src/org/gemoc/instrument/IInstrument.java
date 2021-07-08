package org.gemoc.instrument;

import java.util.function.Supplier;

public interface IInstrument {

	public void notifyBefore(String rule, String element, Supplier<IContextWrapper> contextSupplier);
	
	public void notifyAfter(String rule, String element, Object result, Supplier<IContextWrapper> contextSupplier);
	
}
