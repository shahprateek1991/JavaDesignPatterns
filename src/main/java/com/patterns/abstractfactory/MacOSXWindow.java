package com.patterns.abstractfactory;

/**
 * 
 * @author prateekshah
 * Mac OS dependent concrete implementation of the product 
 */
public class MacOSXWindow implements Window {

	@Override
	public void setTitle(String name) {
		System.out.println("Mac OSX Window's window drawn with name "+name);

	}

}
