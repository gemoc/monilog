package org.gemoc.monilogger.nodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.NodeLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.Node;

public abstract class MoniLoggerCopyVariablesFromScopeNode extends MoniLoggerExecutableNode {

	@Child
	private InteropLibrary variables;

	protected final boolean onEnter;

	private final boolean doPolyglot;

	protected final String bindingsName;

	protected final Node localNode;

	private final MoniLoggerInstrument instrument;

	public abstract Object execute(VirtualFrame frame);

	@CompilationFinal(dimensions = 1)
	private String[] localMembersArray;

	@CompilationFinal(dimensions = 1)
	private String[] languageMembersArray;
	
	private static final String[] EMPTY_ARRAY = new String[0];

	protected MoniLoggerCopyVariablesFromScopeNode(String bindingsName, Node localNode, boolean onEnter,
			boolean doPolyglot) {
		this.bindingsName = bindingsName;
		this.localNode = localNode;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
		this.onEnter = onEnter;
		this.doPolyglot = doPolyglot;
	}

	@ExplodeLoop
	@Specialization
	protected Object doRead(VirtualFrame frame, //
			@Cached("getBindings()") Value bindings, //
			@CachedLibrary("localNode") NodeLibrary localNodeLibrary, //
			@Cached("getLocalScope(localNodeLibrary, frame)") Object localScope, //
			@CachedLibrary("localScope") InteropLibrary localScopeLibrary, //
//			@Cached("getMembers(localScopeLibrary, localScope)") Object localMembers, //
//			@CachedLibrary("localMembers") InteropLibrary localMembersLibrary, //
			@Cached("getLanguageScope()") Object languageScope, //
			@CachedLibrary("languageScope") InteropLibrary languageScopeLibrary//, //
//			@Cached("getMembers(languageScopeLibrary, languageScope)") Object languageMembers, //
//			@CachedLibrary("languageMembers") InteropLibrary languageMembersLibrary
			) {
		try {
			if (localMembersArray == null && languageMembersArray == null) {
				CompilerDirectives.transferToInterpreterAndInvalidate();
				final Object localMembers = getMembers(localScopeLibrary, localScope);
				final Object languageMembers = getMembers(languageScopeLibrary, languageScope);
				final InteropLibrary localMembersLibrary = InteropLibrary.getUncached();
				final InteropLibrary languageMembersLibrary = InteropLibrary.getUncached();
				final InteropLibrary memberNameLibrary = InteropLibrary.getFactory().getUncached();
				final Set<String> writtenMembers = new HashSet<>();
				final List<String> localMembersList = new ArrayList<>();
				final List<String> languageMembersList = new ArrayList<>();
				for (int i = 0; i < localMembersLibrary.getArraySize(localMembers); i++) {
					final Object memberNameObject = localMembersLibrary.readArrayElement(localMembers, i);
					final String memberName = memberNameLibrary.asString(memberNameObject);
					final Object value = localScopeLibrary.readMember(localScope, memberName);
					if (!writtenMembers.contains(memberName)) {
						bindings.putMember(memberName, value);
						writtenMembers.add(memberName);
						localMembersList.add(memberName);
					}
				}
				for (int i = 0; i < languageMembersLibrary.getArraySize(languageMembers); i++) {
					final Object memberNameObject = languageMembersLibrary.readArrayElement(languageMembers, i);
					final String memberName = memberNameLibrary.asString(memberNameObject);
					final Object value = languageScopeLibrary.readMember(languageScope, memberName);
					if (!writtenMembers.contains(memberName)) {
						bindings.putMember(memberName, value);
						writtenMembers.add(memberName);
						languageMembersList.add(memberName);
					}
				}
				localMembersArray = localMembersList.toArray(EMPTY_ARRAY);
				languageMembersArray = languageMembersList.toArray(EMPTY_ARRAY);
			} else {
				for (int i = 0; i < localMembersArray.length; i++) {
					final String memberName = localMembersArray[i];
					final Object value = localScopeLibrary.readMember(localScope, memberName);
					bindings.putMember(memberName, value);
				}
				for (int i = 0; i < languageMembersArray.length; i++) {
					final String memberName = languageMembersArray[i];
					final Object value = languageScopeLibrary.readMember(languageScope, memberName);
					bindings.putMember(memberName, value);
				}
			}
			return true;
		} catch (UnsupportedMessageException | InvalidArrayIndexException | UnknownIdentifierException e) {
			return CompilerDirectives.shouldNotReachHere(e);
		}
	}

	protected Object getLocalScope(NodeLibrary nodes, VirtualFrame frame) {
		try {
			return nodes.getScope(localNode, frame, onEnter);
		} catch (UnsupportedMessageException e) {
			throw new IllegalArgumentException(e);
		}
	}

	protected Object getMembers(InteropLibrary scopeLibrary, Object scope) {
		try {
			return scopeLibrary.getMembers(scope);
		} catch (UnsupportedMessageException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	protected Object getLanguageScope() {
		return instrument.getEnv().getScope(localNode.getRootNode().getLanguageInfo());
	}

	protected Value getBindings() {
		if (doPolyglot) {
			return Context.getCurrent().getPolyglotBindings();
		}
		return Context.getCurrent().getBindings(bindingsName);
	}

//	private void copyVariables(Object vars, Value bindings) {
//		try {
//			final InteropLibrary varsLibrary = InteropLibrary.getFactory().create(vars);
//			insert(varsLibrary);
//			variables = varsLibrary;
//			final Object members = variables.getMembers(vars);
//			final InteropLibrary membersLibrary = InteropLibrary.getFactory().create(members);
//			for (int i = 0; i < membersLibrary.getArraySize(members); i++) {
//				final String memberName = (String) membersLibrary.readArrayElement(members, i);
//				final Object value = variables.readMember(vars, memberName);
//				if (!writtenMembers.contains(memberName)) {
//					bindings.putMember(memberName, value);
//					writtenMembers.add(memberName);
//				}
//			}
//		} catch (UnsupportedMessageException | UnknownIdentifierException | InvalidArrayIndexException e) {
//			e.printStackTrace();
//		}
//	}
}
