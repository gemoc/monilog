package org.gemoc.instrument;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public abstract class InstrumentableAspect<C> {

	private final Collection<IInstrument> registeredInstruments = new ArrayList<>();
	
	protected InstrumentableAspect() {
		final BundleContext context = Activator.getContext();
		if (context != null) {
			final ServiceReference<InstrumentRegistry> serviceReference = context.getServiceReference(InstrumentRegistry.class);
			final InstrumentRegistry instrumentRegistry = Activator.getContext().getService(serviceReference);
			registeredInstruments.addAll(instrumentRegistry.getRegisteredInstruments());
		} else {
			final InstrumentRegistry instrumentRegistry = InstrumentRegistry.getInstance();
			registeredInstruments.addAll(instrumentRegistry.getRegisteredInstruments());
		}
	}
	
	protected void notifyBefore(String eventName, C context) {
		registeredInstruments.forEach(i -> i.notifyBefore(eventName, getContextWrapper(context)));
	}
	
	protected void notifyAfter(String eventName, Object result, C context) {
		registeredInstruments.forEach(i -> i.notifyAfter(eventName, result, getContextWrapper(context)));
	}
	
	protected abstract IContextWrapper getContextWrapper(C context);
}
