package org.gemoc.instrument;

import java.util.function.Supplier;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public abstract class InstrumentableAspect<C> {

	
	private final InstrumentRegistry registry;
	
	protected InstrumentableAspect() {
		final BundleContext context = Activator.getContext();
		if (context != null) {
			final ServiceReference<InstrumentRegistry> serviceReference = context.getServiceReference(InstrumentRegistry.class);
			registry = Activator.getContext().getService(serviceReference);
		} else {
			registry = InstrumentRegistry.getInstance();
		}
	}
	
	protected void notifyBefore(String rule, String element, C context) {
		registry.getRegisteredInstruments().forEach(i -> i.notifyBefore(rule, element, getContextSupplier(context)));
	}
	
	protected void notifyAfter(String rule, String element, Object result, C context) {
		registry.getRegisteredInstruments().forEach(i -> i.notifyAfter(rule, element, result, getContextSupplier(context)));
	}
	
	private Supplier<IContextWrapper> getContextSupplier(C context) {
		return new Supplier<IContextWrapper>() {
			private IContextWrapper cached = null;
			@Override
			public IContextWrapper get() {
				if (cached != null) {
					return cached;
				}
				cached = getContextWrapper(context);
				return cached;
			}
		};
	}
	
	protected abstract IContextWrapper getContextWrapper(C context);
}
