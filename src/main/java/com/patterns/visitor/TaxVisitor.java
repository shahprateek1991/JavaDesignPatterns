package com.patterns.visitor;

public class TaxVisitor implements Visitor{

	@Override
	public double visit(Milk milk) {
		
		return (milk.getPrice()*0.10)+milk.getPrice();
		
	}

	@Override
	public double visit(Liquor liquor) {
		
		return (liquor.getPrice()*0.20)+liquor.getPrice();
		
	}

	@Override
	public double visit(Cigar cigar) {
		
		return (cigar.getPrice()*0.23)+cigar.getPrice();
		
	}

}
