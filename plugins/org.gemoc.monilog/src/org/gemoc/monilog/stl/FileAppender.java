package org.gemoc.monilog.stl;

import java.io.FileOutputStream;
import java.io.IOException;

import org.gemoc.monilog.api.IMoniLogAppender;

public class FileAppender implements IMoniLogAppender {

	@Override
	public void call(Object... args) {
		final String fileName = args[1].toString();
		Boolean append = true;
		if (args.length > 2) {
			append = (Boolean) args[2];
		}
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(fileName, append);
			fos.write((args[0] + "\n").getBytes());
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getNbMinArgs() {
		return 2;
	}

	@Override
	public int getNbMaxArgs() {
		return 3;
	}

	@Override
	public Class<?> getArgType(int argIndex) {
		if (argIndex == 0 || argIndex == 1) {
			return String.class;
		}
		if (argIndex == 2) {
			return Boolean.class;
		}
		return null;
	}
}
