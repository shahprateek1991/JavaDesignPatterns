package com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveObjectFactory {
	
	private static final Map<String, ExpensiveObject> expensiveObjectMap = new HashMap<>();
	
	public static ExpensiveObject getInstance(String intrinsicProperty) {
		
		ExpensiveObject expensiveObject = expensiveObjectMap.get(intrinsicProperty);
		
		if(expensiveObject == null) {
			
			expensiveObject = new ExpensiveObject(intrinsicProperty);
			expensiveObjectMap.put(intrinsicProperty, expensiveObject);
		}
		
		return expensiveObject;
		
	}

}
