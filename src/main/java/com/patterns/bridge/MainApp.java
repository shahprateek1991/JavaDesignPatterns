package com.patterns.bridge;

public class MainApp {

	public static void main(String[] args) {
		
		Shape redTriangle = new Triangle(new RedColor());
		
		redTriangle.applyColor();
		
		Shape blueTriangle = new Triangle(new BlueColor());
		
		blueTriangle.applyColor();
		
		Shape redRectangle = new Rectangle(new RedColor());
		
		redRectangle.applyColor();
		
		Shape blueRectangle = new Rectangle(new BlueColor());
		
		blueRectangle.applyColor();

	}

}
