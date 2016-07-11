package com.patterns.visitor;

public class Milk implements Visitable {
	
	private double price;
	
	

	public Milk(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double accept(Visitor visitor) {
		
		return visitor.visit(this);
	}
	
	

}
