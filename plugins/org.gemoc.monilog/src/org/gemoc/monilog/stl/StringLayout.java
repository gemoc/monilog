package org.gemoc.monilog.stl;

import java.text.MessageFormat;
import java.util.Arrays;

import org.gemoc.monilog.api.IMoniLogLayout;

public class StringLayout implements IMoniLogLayout {

	@Override
	public String call(Object... args) {
		if (args.length == 1) {
			return args.toString();
		}
		return MessageFormat.format(args[0].toString(), Arrays.copyOfRange(args, 1, args.length));
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
