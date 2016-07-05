package com.patterns.bridge;

public class Rectangle  extends Shape {

	public Rectangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("Rectangle drawn");
		color.applyColor();
		
	}

}

