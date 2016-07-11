package com.patterns.visitor;

public interface Visitor {
	
	public double visit(Milk milk);
	
	public double visit(Liquor liquor);
	
	public double visit(Cigar cigar);

}
