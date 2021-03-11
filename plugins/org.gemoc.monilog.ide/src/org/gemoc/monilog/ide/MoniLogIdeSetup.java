/*
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.gemoc.monilog.MoniLogRuntimeModule;
import org.gemoc.monilog.MoniLogStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MoniLogIdeSetup extends MoniLogStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MoniLogRuntimeModule(), new MoniLogIdeModule()));
	}
	
}