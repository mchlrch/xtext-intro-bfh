/*
 * generated by Xtext 2.14.0
 */
package com.acme.homeautomation.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractHarDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.acme.homeautomation.dsl.harDsl.HarDslPackage.eINSTANCE);
		return result;
	}
}
