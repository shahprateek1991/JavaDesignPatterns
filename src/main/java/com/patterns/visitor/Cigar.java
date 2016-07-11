package com.patterns.visitor;

public class Cigar implements Visitable {
	
	private double price;
	
	public Cigar(double price) {
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

