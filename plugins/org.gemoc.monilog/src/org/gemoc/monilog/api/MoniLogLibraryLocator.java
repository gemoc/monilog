package org.gemoc.monilog.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;

public class MoniLogLibraryLocator {

	private static final String APPENDER_EXTENSION = "org.gemoc.monilog.appender";

	private static final String LAYOUT_EXTENSION = "org.gemoc.monilog.layout";

	public static Map<IConfigurationElement, String> locate() {

		final IExtensionPoint appenderExtensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint(APPENDER_EXTENSION);
		final IExtensionPoint layoutExtensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint(LAYOUT_EXTENSION);

		final List<IConfigurationElement> configurationElements = new ArrayList<>(
				Arrays.asList(appenderExtensionPoint.getConfigurationElements()));
		configurationElements.addAll(Arrays.asList(layoutExtensionPoint.getConfigurationElements()));

		final Map<IConfigurationElement, String> result = new HashMap<>();

		configurationElements.stream().forEach(elt -> result.put(elt, elt.getAttribute("specificationFile")));

		return result;
	}

}
