package org.gemoc.instrument;

import java.util.List;

public interface IContextWrapper {

	Object getVariableValue(String variableName);
	
	void setVariableValue(String variableName, Object value);
	
	List<String> getVariableNames();
	
}
