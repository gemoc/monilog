
package org.gemoc.monilogger.nodes.expression;

import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;

@NodeChild("receiverNode")
public abstract class SimpleExpressionArraySizeNode extends SimpleExpressionNode {

	static final int LIBRARY_LIMIT = 3;

	@Specialization(guards = "receiver.hasArrayElements()")
	protected Object getArraySize(Value receiver) {
		return receiver.getArraySize();
	}

	@Specialization(guards = "arrays.hasArrayElements(array)", limit = "LIBRARY_LIMIT")
	protected Object getArraySize(Object array, @CachedLibrary("array") InteropLibrary arrays) {
		try {
			return arrays.getArraySize(array);
		} catch (UnsupportedMessageException e) {
			return 0;
		}
	}
}
