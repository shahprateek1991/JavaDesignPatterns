package com.patterns.template;

public abstract class McDonalds {
	
	public final void makeBurger() {
		
		cutBun();
		
		if(isVeggiesRequired()) {
			addVeggies();
		}
		
		if(isCheeseRequired()) {
			addCheese();
			
		}
		
		if(isChickenRequired()) {
			addChicken();
		}
		
		wrapBurger();
		
	}
	
	public final void cutBun() {
		
		System.out.println("Bun is cut");
	}
	
	public final void wrapBurger() {
		System.out.println("Burger is wrapped");
	}
	
	public abstract void addVeggies();
	
	public abstract void addChicken();
	
	public abstract void addCheese();
	
	public boolean isVeggiesRequired() {
		return true;
	}
	
	public boolean isChickenRequired() {
		return false;
	}
	
	public boolean isCheeseRequired() {
		return false;
	}

}
