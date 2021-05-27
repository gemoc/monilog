package org.gemoc.instrument;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentRegistry {
	
	private static InstrumentRegistry instance;

	final Set<IInstrument> registeredInstruments = new HashSet<>();
	
	public Collection<IInstrument> getRegisteredInstruments() {
		return registeredInstruments;
	}
	
	public void registerInstrument(IInstrument instrument) {
		registeredInstruments.add(instrument);
	}
	
	public void unregisterInstrument(IInstrument instrument) {
		registeredInstruments.remove(instrument);
	}
	
	public void clearRegisteredInstruments() {
		registeredInstruments.clear();
	}
	
	public static InstrumentRegistry getInstance() {
		if (instance == null) {
			instance = new InstrumentRegistry();
		}
		return instance;
	}
}
