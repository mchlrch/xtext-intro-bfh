/*
 * generated by Xtext 2.14.0
 */
package com.acme.homeautomation.dsl.validation

import com.acme.homeautomation.dsl.harDsl.HarDslPackage
import com.acme.homeautomation.dsl.harDsl.Rule
import java.util.Objects
import org.eclipse.xtext.validation.Check

import static extension com.acme.homeautomation.dsl.ModelAccess.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class HarDslValidator extends AbstractHarDslValidator {
	
	@Check
	def checkConditionAndActionFromDifferentDevices(Rule rule) {
		if (Objects.equals(rule.when.declaringDevice,
						   rule.then.declaringDevice)) {		
		
			warning('Condition (when) and action (then) should refer to different devices.', 
					HarDslPackage.Literals.RULE__WHEN)
		}
	}
	
}
