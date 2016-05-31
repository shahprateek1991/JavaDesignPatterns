package com.patterns.decorator;

public class BasePizza implements Pizza {

	@Override
	public String getDescription() {
		return "Plain Dough";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 25.00;
	}

}
