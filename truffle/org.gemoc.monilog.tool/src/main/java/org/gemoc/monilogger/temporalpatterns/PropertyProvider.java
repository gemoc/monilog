package org.gemoc.monilogger.temporalpatterns;

import java.util.List;

import org.gemoc.monilog.moniLog4DSL.Absence;
import org.gemoc.monilog.moniLog4DSL.After;
import org.gemoc.monilog.moniLog4DSL.AfterUntil;
import org.gemoc.monilog.moniLog4DSL.Before;
import org.gemoc.monilog.moniLog4DSL.Between;
import org.gemoc.monilog.moniLog4DSL.ComplexEvent;
import org.gemoc.monilog.moniLog4DSL.EmptyOrPropertyValue;
import org.gemoc.monilog.moniLog4DSL.Event;
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
		return event.getEvent().getName() + (values.isEmpty() ? "" : values.stream().map(v -> {
			if (v instanceof PropertyValue) {
				return ((PropertyValue) v).getId();
			} else {
				return " ";
			}
		}).reduce((s1, s2) -> s1 + "," + s2).get());
	}
	
	public static AbstractTemporalProperty compileProperty(StreamEvent streamEvent) {
		final Event e = streamEvent.getEvent();
		switch (e.eClass().getClassifierID()) {
		case MoniLog4DSLPackage.COMPLEX_EVENT: {
			final ComplexEvent event = ((ComplexEvent) e);
			final TemporalPattern temporalPattern = event.getPattern();
			final Pattern pattern = temporalPattern.getPattern();
			final Scope scope = temporalPattern.getScope();
			final int propertyType = pattern.eClass().getClassifierID();
			final int scopeType = scope.eClass().getClassifierID();
			switch (propertyType) {
			case MoniLog4DSLPackage.UNIVERSALITY: {
				final Universality p = (Universality) pattern;
				switch (scopeType) {
				case MoniLog4DSLPackage.GLOBALLY: {
					return new AlwaysPGlobally(event, p);
				}
				case MoniLog4DSLPackage.BEFORE: {
					final Before s = (Before) scope;
					return new AlwaysPBeforeQ(event, p, s);
				}
				case MoniLog4DSLPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new AlwaysPBetweenQAndR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new AlwaysPAfterQUntilR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER: {
					final After s = (After) scope;
					return new AlwaysPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLog4DSLPackage.EXISTENCE: {
				final Existence p = (Existence) pattern;
				switch (scopeType) {
				case MoniLog4DSLPackage.GLOBALLY: {
					return new ExistsPGlobally(event, p);
				}
				case MoniLog4DSLPackage.BEFORE: {
					final Before s = (Before) scope;
					return new ExistsPBeforeQ(event, p,
							s);
				}
				case MoniLog4DSLPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new ExistsPBetweenQAndR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new ExistsPAfterQUntilR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER: {
					final After s = (After) scope;
					return new ExistsPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLog4DSLPackage.ABSENCE: {
				final Absence p = (Absence) pattern;
				switch (scopeType) {
				case MoniLog4DSLPackage.GLOBALLY: {
					return new NeverPGlobally(event, p);
				}
				case MoniLog4DSLPackage.BEFORE: {
					final Before s = (Before) scope;
					return new NeverPBeforeQ(event, p, s);
				}
				case MoniLog4DSLPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new NeverPBetweenQAndR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new NeverPAfterQUntilR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER: {
					final After s = (After) scope;
					return new NeverPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLog4DSLPackage.RESPONSE: {
				final Response p = (Response) pattern;
				switch (scopeType) {
				case MoniLog4DSLPackage.GLOBALLY: {
					return new SRespondsToPGlobally(event, p);
				}
				case MoniLog4DSLPackage.BEFORE: {
					final Before s = (Before) scope;
					return new SRespondsToPBeforeQ(event, p, s);
				}
				case MoniLog4DSLPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new SRespondsToPBetweenQAndR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new SRespondsToPAfterQUntilR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER: {
					final After s = (After) scope;
					return new SRespondsToPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLog4DSLPackage.PRECEDENCE: {
				final Precedence p = (Precedence) pattern;
				switch (scopeType) {
				case MoniLog4DSLPackage.GLOBALLY: {
					return new SPrecedesPGlobally(event, p);
				}
				case MoniLog4DSLPackage.BEFORE: {
					final Before s = (Before) scope;
					return new SPrecedesPBeforeQ(event, p, s);
				}
				case MoniLog4DSLPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new SPrecedesPBetweenQAndR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new SPrecedesPAfterQUntilR(event, p, s);
				}
				case MoniLog4DSLPackage.AFTER: {
					final After s = (After) scope;
					return new SPrecedesPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			default:
				throw new IllegalStateException();
			}
		}
		case MoniLog4DSLPackage.USER_EVENT: {
			return new UserEventProperty(streamEvent);
		}
		default:
			throw new IllegalArgumentException();
		}
	}
}
