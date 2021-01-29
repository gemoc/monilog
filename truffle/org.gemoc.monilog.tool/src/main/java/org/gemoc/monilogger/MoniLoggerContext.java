package org.gemoc.monilogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.graalvm.options.OptionCategory;
import org.graalvm.options.OptionKey;
import org.graalvm.options.OptionStability;
import org.graalvm.options.OptionType;

import com.oracle.truffle.api.Option;

@Option.Group(MoniLoggerInstrument.ID)
public class MoniLoggerContext {
	
	static final OptionType<List<String>> STRING_LIST_TYPE = new OptionType<>("String List",
			o -> Arrays.stream(o.split(",")).map(s -> s.trim()).collect(Collectors.toList()));

	@Option(name = "files", help = "Monilogger specification files.", category = OptionCategory.USER, stability = OptionStability.STABLE)
	public static final OptionKey<List<String>> FILES = new OptionKey<>(new ArrayList<>(), STRING_LIST_TYPE);
}
