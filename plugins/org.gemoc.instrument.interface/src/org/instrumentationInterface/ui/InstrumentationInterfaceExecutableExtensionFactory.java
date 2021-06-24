package org.instrumentationInterface.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import com.google.inject.Injector;

public class InstrumentationInterfaceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	
	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return Activator.getDefault().getInjector();
	}
}