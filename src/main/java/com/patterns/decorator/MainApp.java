package com.patterns.decorator;

public class MainApp {

	public static void main(String[] args) {
		
		Pizza pizza = new OliveToppings(new Mozzarella(new BasePizza()));
		
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());

	}

}
