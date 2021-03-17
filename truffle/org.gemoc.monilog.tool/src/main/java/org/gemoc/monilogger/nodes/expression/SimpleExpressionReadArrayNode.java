package org.gemoc.monilogger.nodes.expression;

import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;

@NodeChild("receiverNode")
@NodeChild("nameNode")
public abstract class SimpleExpressionReadArrayNode extends SimpleExpressionNode {

	static final int LIBRARY_LIMIT = 3;

	@Specialization(guards = "receiver.hasArrayElements()", limit = "LIBRARY_LIMIT")
	protected Object readArray(Value receiver, Object index, @CachedLibrary("index") InteropLibrary numbers) {
		try {
			final Object result = receiver.getArrayElement(numbers.asLong(index));
			return result;
		} catch (UnsupportedMessageException e) {
			throw SimpleExpressionUndefinedNameException.undefinedProperty(this, index);
		}
	}
	
	@Specialization(guards = "arrays.hasArrayElements(array)", limit = "LIBRARY_LIMIT")
	protected Object readArray(Object array, Object index,//
			@CachedLibrary("array") InteropLibrary arrays,//
			@CachedLibrary("index") InteropLibrary indexes) {
		try {
			final Object result = arrays.readArrayElement(array, indexes.asLong(index));
			return result;
		} catch (UnsupportedMessageException | InvalidArrayIndexException e) {
			throw SimpleExpressionUndefinedNameException.undefinedProperty(this, index);
		}
	}
}
