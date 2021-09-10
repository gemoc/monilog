package org.gemoc.monilogger.nodes.action;

import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilogger.MoniLoggerInstrument;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Context;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

public abstract class MoniLoggerSetMoniLoggerStatus extends MoniLoggerExecutableNode {

	private final MoniLoggerInstrument instrument;
	
	private final MoniLogger monilogger;
	
	private final boolean status;

	protected MoniLoggerSetMoniLoggerStatus(MoniLogger monilogger, boolean status) {
		this.monilogger = monilogger;
		this.status = status;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
	}

	@Specialization
	protected Object doDefault(VirtualFrame frame) {
		if (instrument.isMoniloggerActive(monilogger) != status) {
			instrument.setMoniloggerStatus(monilogger, status);
			instrument.getMoniloggerStatusStable(monilogger).invalidate("status changed");
		}
		return true;
	}

}
