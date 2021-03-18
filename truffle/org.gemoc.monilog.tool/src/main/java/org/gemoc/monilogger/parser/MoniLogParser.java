package org.gemoc.monilogger.parser;

import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.gemoc.monilog.moniLog.Document;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class MoniLogParser {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private ParseHelper<Document> moniLogParseHelper;
	
	public MoniLogParser() {
		MoniLogInjectorProvider inj = new MoniLogInjectorProvider();
		inj.getInjector().injectMembers(this);
	}
	
	public ResourceSet parse(List<String> specifications) {
		final ResourceSet rs = resourceSetProvider.get();
		specifications.forEach(s -> {
			try {
				moniLogParseHelper.parse(s, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return rs;
	}
	
}
