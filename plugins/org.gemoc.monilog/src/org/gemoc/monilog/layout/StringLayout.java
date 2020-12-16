package org.gemoc.monilog.layout;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.gemoc.monilog.api.IMoniLogLayout;

public class StringLayout implements IMoniLogLayout {

	@Override
	public String call(Object[] args) {
		final LogRecord record = new LogRecord(Level.INFO, args[0].toString());
		record.setParameters(Arrays.copyOfRange(args, 1, args.length));
		return record.toString();
	}

	@Override
	public int getNbMinArgs() {
		return 1;
	}

	@Override
	public int getNbMaxArgs() {
		return -1;
	}

	@Override
	public Class<?> getArgType(int argIndex) {
		if (argIndex == 0) {
			return String.class;
		}
		return Object.class;
	}

}
