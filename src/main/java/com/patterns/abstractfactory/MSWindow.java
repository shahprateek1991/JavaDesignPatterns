package com.patterns.abstractfactory;

/**
 * 
 * @author prateekshah
 * MS OS dependent concrete implementation of the product 
 */
public class MSWindow implements Window {

	@Override
	public void setTitle(String name) {
		System.out.println("MS Window's window drawn with name "+name);

	}

}
