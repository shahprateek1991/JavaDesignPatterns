package com.patterns.visitor;

public class SubsidizeTaxVisitor implements Visitor{

	@Override
	public double visit(Milk milk) {
		
		return (milk.getPrice()*0.05)+milk.getPrice();
		
	}

	@Override
	public double visit(Liquor liquor) {
		
		return (liquor.getPrice()*0.11)+liquor.getPrice();
		
	}

	@Override
	public double visit(Cigar cigar) {
		
		return (cigar.getPrice()*0.16)+cigar.getPrice();
		
	}

}
