package com.patterns.decorator;

public class Mozzarella extends PizzaDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription()+", Mozzarella";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 15.00;
	}

}
