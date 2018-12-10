package com.acme.homeautomation.dsl

import com.acme.homeautomation.dsl.harDsl.Device
import com.acme.homeautomation.dsl.harDsl.Rule
import com.acme.homeautomation.dsl.harDsl.State
import java.util.HashSet

class ModelAccess {

	def static declaringDevice(State state) {
		return state.eContainer as Device
	}
	
	def static devicesUsed(Iterable<Rule> rules) {
		rules.map[r | r.devicesUsed].flatten.toSet;
	}
	
	def static devicesUsed(Rule rule) {
		val result = new HashSet();
		result.addAll(rule.when.declaringDevice);
		result.addAll(rule.then.declaringDevice);
		result
	}
	
	def static inDeterministicOrder(Iterable<Device> devices) {
		devices.toSet.toList.sortBy[d | d.name];
	}

}
