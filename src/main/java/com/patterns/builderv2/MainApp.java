package com.patterns.builderv2;

public class MainApp {

	public static void main(String[] args) {
		Product product = new Product("Product XYZ",100,50).new NutritionInfo().setCarbs(10)
				.setFats(3).setProtein(12).setVitamines(8).buildProduct();
		System.out.println(product);

	}

}
