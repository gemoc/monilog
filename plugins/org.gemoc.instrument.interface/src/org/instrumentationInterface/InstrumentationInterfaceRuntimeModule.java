package org.instrumentationInterface;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

public class InstrumentationInterfaceRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	@Override
	protected String getFileExtensions() {
		return "instritf";
	}
	
	@Override
	protected String getLanguageName() {
		return "org.gemoc.instrument.interface.InstrumentationInterface";
	}
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return DefaultDeclarativeQualifiedNameProvider.class;
	}
}