package com.patterns.decorator;

public abstract class PizzaDecorator implements Pizza {
	
	protected Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

}
