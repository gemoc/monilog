/*******************************************************************************
 * Copyright (c) 2020 CEA
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 * Contributors: see AUTHORS file
 *******************************************************************************/
package org.gemoc.monilog.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.gemoc.monilog.moniLog.MoniLogPackage

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MoniLogScopeProvider extends AbstractMoniLogScopeProvider
{

	override IScope getScope(EObject context, EReference r)
	{
		switch (r) {
//			case MoniLogPackage.Literals.CALLABLE_ELEMENT_OBJECT_REFERENCE__TARGET: {
//				println("TODO: Access callable provider.")
//				return super.getScope(context, r)
//			}
//			case MoniLogPackage.Literals.CALLABLE_ELEMENT_OBJECT_REFERENCE__REF: {
//				println("TODO: Access callable provider.")
//				return super.getScope(context, r)
//			}
			default: super.getScope(context, r)
		}
	}
}
