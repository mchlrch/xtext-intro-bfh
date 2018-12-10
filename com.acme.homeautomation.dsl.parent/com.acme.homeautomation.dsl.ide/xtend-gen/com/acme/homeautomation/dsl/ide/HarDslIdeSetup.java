/**
 * generated by Xtext 2.14.0
 */
package com.acme.homeautomation.dsl.ide;

import com.acme.homeautomation.dsl.HarDslRuntimeModule;
import com.acme.homeautomation.dsl.HarDslStandaloneSetup;
import com.acme.homeautomation.dsl.ide.HarDslIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class HarDslIdeSetup extends HarDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    HarDslRuntimeModule _harDslRuntimeModule = new HarDslRuntimeModule();
    HarDslIdeModule _harDslIdeModule = new HarDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_harDslRuntimeModule, _harDslIdeModule));
  }
}