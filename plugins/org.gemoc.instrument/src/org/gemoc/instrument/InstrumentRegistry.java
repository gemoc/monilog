package org.gemoc.instrument;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentRegistry {

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
	
}
