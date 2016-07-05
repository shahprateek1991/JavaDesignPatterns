package com.patterns.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle drawn");
		color.applyColor();
		
	}

}
