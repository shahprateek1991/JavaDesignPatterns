package com.patterns.template;

public class ChickenBurger extends McDonalds {

	@Override
	public boolean isVeggiesRequired() {
		return false;
	}
	
	@Override
	public boolean isChickenRequired() {
		return true;
	}
	
	@Override
	public boolean isCheeseRequired() {
		return false;
	}
	
	@Override
	public void addVeggies() {
		
		// Not required for Chicken Burger
		
	}

	@Override
	public void addChicken() {
		
		System.out.println("Chicken added");
	}

	@Override
	public void addCheese() {
		
		// Not required for Chicken Burger
		
	}

}

