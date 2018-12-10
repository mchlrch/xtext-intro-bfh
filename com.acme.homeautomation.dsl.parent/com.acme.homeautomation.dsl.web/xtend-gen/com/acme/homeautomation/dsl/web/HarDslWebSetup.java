/**
 * generated by Xtext 2.14.0
 */
package com.acme.homeautomation.dsl.web;

import com.acme.homeautomation.dsl.HarDslRuntimeModule;
import com.acme.homeautomation.dsl.HarDslStandaloneSetup;
import com.acme.homeautomation.dsl.ide.HarDslIdeModule;
import com.acme.homeautomation.dsl.web.HarDslWebModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class HarDslWebSetup extends HarDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    HarDslRuntimeModule _harDslRuntimeModule = new HarDslRuntimeModule();
    HarDslIdeModule _harDslIdeModule = new HarDslIdeModule();
    HarDslWebModule _harDslWebModule = new HarDslWebModule();
    return Guice.createInjector(Modules2.mixin(_harDslRuntimeModule, _harDslIdeModule, _harDslWebModule));
  }
}
