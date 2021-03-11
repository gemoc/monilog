package org.gemoc.monilogger.temporalpatterns;

import java.util.List;

import org.gemoc.monilog.moniLog.Absence;
import org.gemoc.monilog.moniLog.After;
import org.gemoc.monilog.moniLog.AfterUntil;
import org.gemoc.monilog.moniLog.Before;
import org.gemoc.monilog.moniLog.Between;
import org.gemoc.monilog.moniLog.ComplexEvent;
import org.gemoc.monilog.moniLog.EmptyOrPropertyValue;
import org.gemoc.monilog.moniLog.Event;
import org.gemoc.monilog.moniLog.Existence;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.Pattern;
import org.gemoc.monilog.moniLog.Precedence;
import org.gemoc.monilog.moniLog.PropertyValue;
import org.gemoc.monilog.moniLog.Response;
import org.gemoc.monilog.moniLog.Scope;
import org.gemoc.monilog.moniLog.StreamEvent;
import org.gemoc.monilog.moniLog.TemporalPattern;
import org.gemoc.monilog.moniLog.Universality;

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
		case MoniLogPackage.COMPLEX_EVENT: {
			final ComplexEvent event = ((ComplexEvent) e);
			final TemporalPattern temporalPattern = event.getPattern();
			final Pattern pattern = temporalPattern.getPattern();
			final Scope scope = temporalPattern.getScope();
			final int propertyType = pattern.eClass().getClassifierID();
			final int scopeType = scope.eClass().getClassifierID();
			switch (propertyType) {
			case MoniLogPackage.UNIVERSALITY: {
				final Universality p = (Universality) pattern;
				switch (scopeType) {
				case MoniLogPackage.GLOBALLY: {
					return new AlwaysPGlobally(event, p);
				}
				case MoniLogPackage.BEFORE: {
					final Before s = (Before) scope;
					return new AlwaysPBeforeQ(event, p, s);
				}
				case MoniLogPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new AlwaysPBetweenQAndR(event, p, s);
				}
				case MoniLogPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new AlwaysPAfterQUntilR(event, p, s);
				}
				case MoniLogPackage.AFTER: {
					final After s = (After) scope;
					return new AlwaysPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLogPackage.EXISTENCE: {
				final Existence p = (Existence) pattern;
				switch (scopeType) {
				case MoniLogPackage.GLOBALLY: {
					return new ExistsPGlobally(event, p);
				}
				case MoniLogPackage.BEFORE: {
					final Before s = (Before) scope;
					return new ExistsPBeforeQ(event, p,
							s);
				}
				case MoniLogPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new ExistsPBetweenQAndR(event, p, s);
				}
				case MoniLogPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new ExistsPAfterQUntilR(event, p, s);
				}
				case MoniLogPackage.AFTER: {
					final After s = (After) scope;
					return new ExistsPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLogPackage.ABSENCE: {
				final Absence p = (Absence) pattern;
				switch (scopeType) {
				case MoniLogPackage.GLOBALLY: {
					return new NeverPGlobally(event, p);
				}
				case MoniLogPackage.BEFORE: {
					final Before s = (Before) scope;
					return new NeverPBeforeQ(event, p, s);
				}
				case MoniLogPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new NeverPBetweenQAndR(event, p, s);
				}
				case MoniLogPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new NeverPAfterQUntilR(event, p, s);
				}
				case MoniLogPackage.AFTER: {
					final After s = (After) scope;
					return new NeverPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLogPackage.RESPONSE: {
				final Response p = (Response) pattern;
				switch (scopeType) {
				case MoniLogPackage.GLOBALLY: {
					return new SRespondsToPGlobally(event, p);
				}
				case MoniLogPackage.BEFORE: {
					final Before s = (Before) scope;
					return new SRespondsToPBeforeQ(event, p, s);
				}
				case MoniLogPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new SRespondsToPBetweenQAndR(event, p, s);
				}
				case MoniLogPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new SRespondsToPAfterQUntilR(event, p, s);
				}
				case MoniLogPackage.AFTER: {
					final After s = (After) scope;
					return new SRespondsToPAfterQ(event, p, s);
				}
				default:
					throw new IllegalStateException();
				}
			}
			case MoniLogPackage.PRECEDENCE: {
				final Precedence p = (Precedence) pattern;
				switch (scopeType) {
				case MoniLogPackage.GLOBALLY: {
					return new SPrecedesPGlobally(event, p);
				}
				case MoniLogPackage.BEFORE: {
					final Before s = (Before) scope;
					return new SPrecedesPBeforeQ(event, p, s);
				}
				case MoniLogPackage.BETWEEN: {
					final Between s = (Between) scope;
					return new SPrecedesPBetweenQAndR(event, p, s);
				}
				case MoniLogPackage.AFTER_UNTIL: {
					final AfterUntil s = (AfterUntil) scope;
					return new SPrecedesPAfterQUntilR(event, p, s);
				}
				case MoniLogPackage.AFTER: {
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
		case MoniLogPackage.USER_EVENT: {
			return new UserEventProperty(streamEvent);
		}
		default:
			throw new IllegalArgumentException();
		}
	}
}
