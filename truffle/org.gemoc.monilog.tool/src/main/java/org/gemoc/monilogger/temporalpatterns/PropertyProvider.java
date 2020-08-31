package org.gemoc.monilogger.temporalpatterns;

import java.util.List;

import org.gemoc.monilog.moniLog4DSL.Absence;
import org.gemoc.monilog.moniLog4DSL.After;
import org.gemoc.monilog.moniLog4DSL.AfterUntil;
import org.gemoc.monilog.moniLog4DSL.Before;
import org.gemoc.monilog.moniLog4DSL.Between;
import org.gemoc.monilog.moniLog4DSL.EmptyOrPropertyValue;
import org.gemoc.monilog.moniLog4DSL.Existence;
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.Pattern;
import org.gemoc.monilog.moniLog4DSL.Precedence;
import org.gemoc.monilog.moniLog4DSL.PropertyValue;
import org.gemoc.monilog.moniLog4DSL.Response;
import org.gemoc.monilog.moniLog4DSL.Scope;
import org.gemoc.monilog.moniLog4DSL.StreamEvent;
import org.gemoc.monilog.moniLog4DSL.TemporalPattern;
import org.gemoc.monilog.moniLog4DSL.Universality;

public class PropertyProvider {

	private static String getEventString(StreamEvent event) {
		final List<EmptyOrPropertyValue> values = event.getValues();
		return event.getEventId() + (values.isEmpty() ? "" : values.stream().map(v -> {
			if (v instanceof PropertyValue) {
				return ((PropertyValue) v).getId();
			} else {
				return " ";
			}
		}).reduce((s1, s2) -> s1 + "," + s2).get());
	}

	public static AbstractTemporalProperty compileProperty(TemporalPattern temporalPattern) {
		final Pattern pattern = temporalPattern.getPattern();
		final Scope scope = temporalPattern.getScope();
		final int propertyType = pattern.eClass().getClassifierID();
		final int scopeType = scope.eClass().getClassifierID();
		switch (propertyType) {
		case MoniLog4DSLPackage.UNIVERSALITY: {
			final Universality p = (Universality) pattern;
			switch (scopeType) {
			case MoniLog4DSLPackage.GLOBALLY: {
				return new AlwaysPGlobally("Always " + getEventString(p.getEvent()) + " Globally", p);
			}
			case MoniLog4DSLPackage.BEFORE: {
				final Before s = (Before) scope;
				return new AlwaysPBeforeQ(
						"Always " + getEventString(p.getEvent()) + " Before " + getEventString(s.getUpperBound()), p,
						s);
			}
			case MoniLog4DSLPackage.BETWEEN: {
				final Between s = (Between) scope;
				return new AlwaysPBetweenQAndR("Always " + getEventString(p.getEvent()) + " Between "
						+ getEventString(s.getLowerBound()) + " And " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.AFTER_UNTIL: {
				final AfterUntil s = (AfterUntil) scope;
				return new AlwaysPAfterQUntilR("Always " + getEventString(p.getEvent()) + " After "
						+ getEventString(s.getLowerBound()) + " Until " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.AFTER: {
				final After s = (After) scope;
				return new AlwaysPAfterQ(
						"Always " + getEventString(p.getEvent()) + " After " + getEventString(s.getLowerBound()), p, s);
			}
			default:
				throw new IllegalStateException();
			}
		}
		case MoniLog4DSLPackage.EXISTENCE: {
			final Existence p = (Existence) pattern;
			switch (scopeType) {
			case MoniLog4DSLPackage.GLOBALLY: {
				return new ExistsPGlobally("Exists " + getEventString(p.getEvent()) + " Globally", p);
			}
			case MoniLog4DSLPackage.BEFORE: {
				final Before s = (Before) scope;
				return new ExistsPBeforeQ(
						"Exists " + getEventString(p.getEvent()) + " Before " + getEventString(s.getUpperBound()), p,
						s);
			}
			case MoniLog4DSLPackage.BETWEEN: {
				final Between s = (Between) scope;
				return new ExistsPBetweenQAndR("Exists " + getEventString(p.getEvent()) + " Between "
						+ getEventString(s.getLowerBound()) + " And " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.AFTER_UNTIL: {
				final AfterUntil s = (AfterUntil) scope;
				return new ExistsPAfterQUntilR("Exists " + getEventString(p.getEvent()) + " After "
						+ getEventString(s.getLowerBound()) + " Until " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.AFTER: {
				final After s = (After) scope;
				return new ExistsPAfterQ(
						"Exists " + getEventString(p.getEvent()) + " After " + getEventString(s.getLowerBound()), p, s);
			}
			default:
				throw new IllegalStateException();
			}
		}
		case MoniLog4DSLPackage.ABSENCE: {
			final Absence p = (Absence) pattern;
			switch (scopeType) {
			case MoniLog4DSLPackage.GLOBALLY: {
				return new NeverPGlobally("Never " + getEventString(p.getEvent()) + " Globally", p);
			}
			case MoniLog4DSLPackage.BEFORE: {
				final Before s = (Before) scope;
				return new NeverPBeforeQ(
						"Never " + getEventString(p.getEvent()) + " Before " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.BETWEEN: {
				final Between s = (Between) scope;
				return new NeverPBetweenQAndR("Never " + getEventString(p.getEvent()) + " Between "
						+ getEventString(s.getLowerBound()) + " And " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.AFTER_UNTIL: {
				final AfterUntil s = (AfterUntil) scope;
				return new NeverPAfterQUntilR("Never " + getEventString(p.getEvent()) + " After "
						+ getEventString(s.getLowerBound()) + " Until " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.AFTER: {
				final After s = (After) scope;
				return new NeverPAfterQ(
						"Never " + getEventString(p.getEvent()) + " After " + getEventString(s.getLowerBound()), p, s);
			}
			default:
				throw new IllegalStateException();
			}
		}
		case MoniLog4DSLPackage.RESPONSE: {
			final Response p = (Response) pattern;
			switch (scopeType) {
			case MoniLog4DSLPackage.GLOBALLY: {
				return new SRespondsToPGlobally(
						getEventString(p.getEvent()) + " RespondsTo " + getEventString(p.getTrigger()) + " Globally",
						p);
			}
			case MoniLog4DSLPackage.BEFORE: {
				final Before s = (Before) scope;
				return new SRespondsToPBeforeQ(getEventString(p.getEvent()) + " RespondsTo "
						+ getEventString(p.getTrigger()) + " Before " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.BETWEEN: {
				final Between s = (Between) scope;
				return new SRespondsToPBetweenQAndR(
						getEventString(p.getEvent()) + " RespondsTo " + getEventString(p.getTrigger()) + " Between "
								+ getEventString(s.getLowerBound()) + " And " + getEventString(s.getUpperBound()),
						p, s);
			}
			case MoniLog4DSLPackage.AFTER_UNTIL: {
				final AfterUntil s = (AfterUntil) scope;
				return new SRespondsToPAfterQUntilR(
						getEventString(p.getEvent()) + " RespondsTo " + getEventString(p.getTrigger()) + " After "
								+ getEventString(s.getLowerBound()) + " Until " + getEventString(s.getUpperBound()),
						p, s);
			}
			case MoniLog4DSLPackage.AFTER: {
				final After s = (After) scope;
				return new SRespondsToPAfterQ(getEventString(p.getEvent()) + " RespondsTo "
						+ getEventString(p.getTrigger()) + " After " + getEventString(s.getLowerBound()), p, s);
			}
			default:
				throw new IllegalStateException();
			}
		}
		case MoniLog4DSLPackage.PRECEDENCE: {
			final Precedence p = (Precedence) pattern;
			switch (scopeType) {
			case MoniLog4DSLPackage.GLOBALLY: {
				return new SPrecedesPGlobally(getEventString(p.getPredecessor()) + " Precedes "
						+ getEventString(p.getSuccessor()) + " Globally", p);
			}
			case MoniLog4DSLPackage.BEFORE: {
				final Before s = (Before) scope;
				return new SPrecedesPBeforeQ(getEventString(p.getPredecessor()) + " Precedes "
						+ getEventString(p.getSuccessor()) + " Before " + getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.BETWEEN: {
				final Between s = (Between) scope;
				return new SPrecedesPBetweenQAndR(getEventString(p.getPredecessor()) + " Precedes "
						+ getEventString(p.getSuccessor()) + " Between " + getEventString(s.getLowerBound()) + " And "
						+ getEventString(s.getUpperBound()), p, s);
			}
			case MoniLog4DSLPackage.AFTER_UNTIL: {
				final AfterUntil s = (AfterUntil) scope;
				return new SPrecedesPAfterQUntilR(
						getEventString(p.getPredecessor()) + " Precedes " + getEventString(p.getSuccessor()) + " After "
								+ getEventString(s.getLowerBound()) + " Until " + getEventString(s.getUpperBound()),
						p, s);
			}
			case MoniLog4DSLPackage.AFTER: {
				final After s = (After) scope;
				return new SPrecedesPAfterQ(getEventString(p.getPredecessor()) + " Precedes "
						+ getEventString(p.getSuccessor()) + " After " + getEventString(s.getLowerBound()), p, s);
			}
			default:
				throw new IllegalStateException();
			}
		}
		default:
			throw new IllegalStateException();
		}
	}
}
