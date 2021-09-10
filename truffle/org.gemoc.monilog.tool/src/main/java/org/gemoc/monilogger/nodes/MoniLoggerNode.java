package org.gemoc.monilogger.nodes;

import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilogger.MoniLoggerInstrument;
import org.graalvm.polyglot.Context;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;

public abstract class MoniLoggerNode extends MoniLoggerExecutableNode {

	private final ConditionProfile conditionProfile = ConditionProfile.createCountingProfile();
	
	protected final MoniLoggerInstrument instrument;

	@Child
	protected MoniLoggerExecutableNode prolog;
	@Child
	protected MoniLoggerExecutableNode condition;
	@Child
	protected MoniLoggerExecutableNode thenAction;
	@Child
	protected MoniLoggerExecutableNode elseAction;
	
	protected final MoniLogger monilogger;

	protected MoniLoggerNode(MoniLogger monilogger, MoniLoggerExecutableNode prolog, MoniLoggerExecutableNode condition,
			MoniLoggerExecutableNode thenAction, MoniLoggerExecutableNode elseAction) {
		this.monilogger = monilogger;
		this.prolog = prolog;
		this.condition = condition;
		this.thenAction = thenAction;
		this.elseAction = elseAction;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
	}

	@Specialization(assumptions = "instrument.getMoniloggerStatusStable(monilogger).getAssumption()")
	public Object doDefault(VirtualFrame frame, //
			@Cached("instrument.isMoniloggerActive(monilogger)") boolean active) {
		if (active) {
			if (prolog != null) {
				prolog.execute(frame);
			}
			if (condition != null) {
				if (conditionProfile.profile(CompilerDirectives.castExact(condition.execute(frame), Boolean.class))) {
					if (thenAction != null) {
						thenAction.execute(frame);
					}
					return true;
				} else {
					if (elseAction != null) {
						elseAction.execute(frame);
					}
					return false;
				}
			} else {
				if (thenAction != null) {
					thenAction.execute(frame);
				}
				return true;
			}
		} else {
			return true;
		}
	}
}
