package org.gemoc.instrumentationInterface;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

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
		
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.gemoc.org/instrument/InstrumentationInterface")) {
			EPackage.Registry.INSTANCE.put("http://www.gemoc.org/instrument/InstrumentationInterface", InstrumentationInterfacePackage.eINSTANCE);
		}
		
		fileExtensionProvider.getFileExtensions().forEach(f -> registry.getExtensionToFactoryMap().put(f, resourceServiceProvider));
		
		return injector;
	}
}