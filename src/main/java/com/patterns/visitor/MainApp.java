package com.patterns.visitor;

public class MainApp {

	public static void main(String[] args) {
		
		TaxVisitor taxVisitor = new TaxVisitor();
		Milk milk = new Milk(20.00);
		Liquor liquor = new Liquor(70.50);
		Cigar cigar = new Cigar(150.50);
		
		System.out.println("Milk price after taxes is: "+milk.accept(taxVisitor));
		System.out.println("Liquor price after taxes is: "+liquor.accept(taxVisitor));
		System.out.println("Cigar price after taxes is: "+cigar.accept(taxVisitor));
		
		System.out.println();
		SubsidizeTaxVisitor subsidizeTaxVisitor = new SubsidizeTaxVisitor();
		
		System.out.println("Milk price after subsidize taxes is: "+milk.accept(subsidizeTaxVisitor));
		System.out.println("Liquor price after subsidize taxes is: "+liquor.accept(subsidizeTaxVisitor));
		System.out.println("Cigar price after subsidize taxes is: "+cigar.accept(subsidizeTaxVisitor));

	}

}
