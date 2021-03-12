package org.gemoc.monilog.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;

public class MoniLogLibraryLocator {

	private static final String APPENDER_EXTENSION = "org.gemoc.monilog.appender";

	private static final String LAYOUT_EXTENSION = "org.gemoc.monilog.layout";

	public static List<String> locate() {

		final IExtensionPoint appenderExtensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint(APPENDER_EXTENSION);
		final IExtensionPoint layoutExtensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint(LAYOUT_EXTENSION);

		final List<IConfigurationElement> configurationElements = new ArrayList<>(
				Arrays.asList(appenderExtensionPoint.getConfigurationElements()));
		configurationElements.addAll(Arrays.asList(layoutExtensionPoint.getConfigurationElements()));

		return configurationElements.stream().map(elt -> elt.getAttribute("specificationFile")).collect(Collectors.toList());
	}

}
