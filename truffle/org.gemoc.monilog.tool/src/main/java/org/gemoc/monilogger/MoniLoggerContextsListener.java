package org.gemoc.monilogger;

import com.oracle.truffle.api.TruffleContext;
import com.oracle.truffle.api.instrumentation.ContextsListener;
import com.oracle.truffle.api.instrumentation.EventBinding;
import com.oracle.truffle.api.nodes.LanguageInfo;

public abstract class MoniLoggerContextsListener implements ContextsListener {

	private EventBinding<MoniLoggerContextsListener> binding;
	
	public void setBinding(EventBinding<MoniLoggerContextsListener> binding) {
		this.binding = binding;
	}
	
	@Override
	public void onContextCreated(TruffleContext context) {}
	
	public abstract void execute();

	@Override
	public void onLanguageContextCreated(TruffleContext context, LanguageInfo language) {}

	@Override
	public void onLanguageContextInitialized(TruffleContext context, LanguageInfo language) {
		execute();
		binding.dispose();
	}

	@Override
	public void onLanguageContextFinalized(TruffleContext context, LanguageInfo language) {}

	@Override
	public void onLanguageContextDisposed(TruffleContext context, LanguageInfo language) {}

	@Override
	public void onContextClosed(TruffleContext context) {}

}
