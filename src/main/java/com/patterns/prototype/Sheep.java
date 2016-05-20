package com.patterns.prototype;

public class Sheep implements Animal {

	@Override
	//Many examples return Animal object but we can use sub class as return type while overriding 
	public Sheep makeCopy() throws CloneNotSupportedException {
		Sheep sheep = null;
		sheep = (Sheep)super.clone();
		
		return sheep;
		
		
	}

}
