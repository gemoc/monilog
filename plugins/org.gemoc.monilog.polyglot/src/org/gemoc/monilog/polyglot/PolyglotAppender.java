package org.gemoc.monilog.polyglot;

import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;

import org.gemoc.monilog.api.IMoniLogAppender;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class PolyglotAppender implements IMoniLogAppender {

	@Override
	public void call(Object... args) {
		final Object toAppend = args[0];
		final String destination = args[1].toString();
		final Value polyglotBindings = Context.getCurrent().getPolyglotBindings();
		final Value member = polyglotBindings.getMember(destination);
		if (member == null) {
			final Collection<Object> queue = new LinkedBlockingQueue<>();
			queue.add(toAppend);
			polyglotBindings.putMember(destination, queue);
		} else {
			Collection<Object> queue = member.asHostObject();
			queue.add(toAppend);
		}
	}

	@Override
	public int getNbMinArgs() {
		return 2;
	}

	@Override
	public int getNbMaxArgs() {
		return 2;
	}

	@Override
	public Class<?> getArgType(int argIndex) {
		if (argIndex == 0) {
			return Object.class;
		}
		if (argIndex == 1) {
			return String.class;
		}
		return null;
	}
}
