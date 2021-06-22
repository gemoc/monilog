package org.gemoc.monilogger.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;

public abstract class MoniLoggerNode extends MoniLoggerExecutableNode {
	
	private final ConditionProfile conditionProfile = ConditionProfile.createCountingProfile();

	@Child
	protected MoniLoggerExecutableNode prolog;
	@Child
	protected MoniLoggerExecutableNode condition;
	@Child
	protected MoniLoggerExecutableNode thenAction;
	@Child
	protected MoniLoggerExecutableNode elseAction;
	
	protected MoniLoggerNode(MoniLoggerExecutableNode prolog, MoniLoggerExecutableNode condition,
			MoniLoggerExecutableNode thenAction, MoniLoggerExecutableNode elseAction) {
		this.prolog = prolog;
		this.condition = condition;
		this.thenAction = thenAction;
		this.elseAction = elseAction;
	}

	@Specialization
	public Object doDefault(VirtualFrame frame) {
		if (prolog != null) {
			prolog.execute(frame);
		}
		if (conditionProfile.profile(CompilerDirectives.castExact(condition.execute(frame), Boolean.class))) {
			thenAction.execute(frame);
			return true;
		} else {
			elseAction.execute(frame);
			return false;
		}
	}
}
