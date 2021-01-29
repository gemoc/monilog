package org.gemoc.instrument;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		context.registerService(InstrumentRegistry.class, new InstrumentRegistry(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
