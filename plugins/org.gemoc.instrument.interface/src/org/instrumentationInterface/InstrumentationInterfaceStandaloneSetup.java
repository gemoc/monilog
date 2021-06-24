package org.instrumentationInterface;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import instrumentationInterface.InstrumentationInterfacePackage;

import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;

public class InstrumentationInterfaceStandaloneSetup implements ISetup {
	
	@Inject
	private FileExtensionProvider fileExtensionProvider;

	@Inject
	private IResourceServiceProvider resourceServiceProvider;

	@Inject
	private IResourceServiceProvider.Registry registry;
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		final Injector injector = Guice.createInjector(new InstrumentationInterfaceRuntimeModule());
		injector.injectMembers(this);
		fileExtensionProvider.getFileExtensions().forEach(f -> registry.getExtensionToFactoryMap().put(f, resourceServiceProvider));
		
		final InstrumentationInterfacePackage intrumentationInterfacePackage = InstrumentationInterfacePackage.eINSTANCE;
		
		return injector;
	}
}