package org.gemoc.monilogger;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.oracle.truffle.api.utilities.CyclicAssumption;

public class MoniLoggerContext {

	final Set<String> variableNames = new HashSet<>();
	final Map<String, CyclicAssumption> variableNameToVariableStableAssumption = new ConcurrentHashMap<>();
	final Map<String, CyclicAssumption> variableNameToVariableNotReadAssumption = new ConcurrentHashMap<>();
	
}
