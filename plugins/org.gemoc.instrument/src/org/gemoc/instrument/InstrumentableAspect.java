package org.gemoc.instrument;

import java.util.Collection;

import org.osgi.framework.ServiceReference;

public abstract class InstrumentableAspect<C> {

	private final Collection<IInstrument> registeredInstruments;
	
	protected InstrumentableAspect() {
		final ServiceReference<InstrumentRegistry> serviceReference = Activator.getContext().getServiceReference(InstrumentRegistry.class);
		final InstrumentRegistry instrumentRegistry = Activator.getContext().getService(serviceReference);
		registeredInstruments = instrumentRegistry.getRegisteredInstruments();
	}
	
	protected void notifyBefore(String eventName, C context) {
		registeredInstruments.forEach(i -> i.notifyBefore(eventName, getContextWrapper(context)));
	}
	
	protected void notifyAfter(String eventName, Object result, C context) {
		registeredInstruments.forEach(i -> i.notifyAfter(eventName, result, getContextWrapper(context)));
	}
	
	protected abstract IContextWrapper getContextWrapper(C context);
}
