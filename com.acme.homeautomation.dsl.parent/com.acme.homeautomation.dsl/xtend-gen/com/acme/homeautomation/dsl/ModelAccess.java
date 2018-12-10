package com.acme.homeautomation.dsl;

import com.acme.homeautomation.dsl.harDsl.Device;
import com.acme.homeautomation.dsl.harDsl.Rule;
import com.acme.homeautomation.dsl.harDsl.State;
import com.google.common.collect.Iterables;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelAccess {
  public static Device declaringDevice(final State state) {
    EObject _eContainer = state.eContainer();
    return ((Device) _eContainer);
  }
  
  public static Set<Device> devicesUsed(final Iterable<Rule> rules) {
    final Function1<Rule, HashSet<Device>> _function = (Rule r) -> {
      return ModelAccess.devicesUsed(r);
    };
    return IterableExtensions.<Device>toSet(Iterables.<Device>concat(IterableExtensions.<Rule, HashSet<Device>>map(rules, _function)));
  }
  
  public static HashSet<Device> devicesUsed(final Rule rule) {
    HashSet<Device> _xblockexpression = null;
    {
      final HashSet<Device> result = new HashSet<Device>();
      CollectionExtensions.<Device>addAll(result, ModelAccess.declaringDevice(rule.getWhen()));
      CollectionExtensions.<Device>addAll(result, ModelAccess.declaringDevice(rule.getThen()));
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static List<Device> inDeterministicOrder(final Iterable<Device> devices) {
    final Function1<Device, String> _function = (Device d) -> {
      return d.getName();
    };
    return IterableExtensions.<Device, String>sortBy(IterableExtensions.<Device>toList(IterableExtensions.<Device>toSet(devices)), _function);
  }
}
