package com.patterns.template;

public class VeggieBurger extends McDonalds {

	@Override
	public boolean isVeggiesRequired() {
		return true;
	}
	
	@Override
	public boolean isChickenRequired() {
		return false;
	}
	
	@Override
	public boolean isCheeseRequired() {
		return true;
	}
	
	@Override
	public void addVeggies() {
		
		System.out.println("Veggies added");
		
	}

	@Override
	public void addChicken() {
		// Not required for Veggie Burger
		
	}

	@Override
	public void addCheese() {
		
		System.out.println("Cheese added");
		
	}

}
