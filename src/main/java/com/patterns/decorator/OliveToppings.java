package com.patterns.decorator;

public class OliveToppings extends PizzaDecorator {

	public OliveToppings(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription()+", OliveToppings";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 10.00;
	}

}

