package org.gemoc.monilog.instrument;

import java.util.List;

import org.gemoc.instrument.IInstrument;
import org.gemoc.monilog.instrument.internal.MoniLogInstrument;

public class MoniLogInstrumentProvider {

	public IInstrument getMoniLogInstrument(List<String> moniLogFilePaths) {
		return new MoniLogInstrument(moniLogFilePaths);
	}
}
