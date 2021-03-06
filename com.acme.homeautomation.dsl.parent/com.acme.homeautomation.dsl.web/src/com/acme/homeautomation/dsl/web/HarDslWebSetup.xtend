/*
 * generated by Xtext 2.14.0
 */
package com.acme.homeautomation.dsl.web

import com.acme.homeautomation.dsl.HarDslRuntimeModule
import com.acme.homeautomation.dsl.HarDslStandaloneSetup
import com.acme.homeautomation.dsl.ide.HarDslIdeModule
import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages in web applications.
 */
class HarDslWebSetup extends HarDslStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new HarDslRuntimeModule, new HarDslIdeModule, new HarDslWebModule))
	}
	
}
