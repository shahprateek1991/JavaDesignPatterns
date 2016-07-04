package com.patterns.template;

public class MainApp {

	public static void main(String[] args) {
		
		McDonalds veggieBurger = new VeggieBurger();
		
		System.out.println("Veggie Burger: ");
		veggieBurger.makeBurger();
		
		McDonalds chickenBurger = new ChickenBurger();
		
		System.out.println("\nChicken Burger: ");
		chickenBurger.makeBurger();

	}

}
