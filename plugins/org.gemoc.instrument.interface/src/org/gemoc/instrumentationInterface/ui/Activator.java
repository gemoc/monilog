package org.gemoc.instrumentationInterface.ui;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.gemoc.instrumentationInterface.InstrumentationInterfaceRuntimeModule;
import org.osgi.framework.BundleContext;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gemoc.instrument.interface";

	// The shared instance
	private static Activator plugin;

	private Injector injector;

	public Activator() {
	}

	public Injector getInjector() {
		return injector;
	}

	private void initializeInjector() {
		injector = Guice.createInjector(Modules
				.override(Modules.override(new InstrumentationInterfaceRuntimeModule()).with(new EmfUiModule(plugin)))
				.with(new SharedStateModule()));
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		try {
			initializeInjector();
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		injector = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}