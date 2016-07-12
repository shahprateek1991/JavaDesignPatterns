package com.patterns.mediator;

public class MainApp {

	public static void main(String[] args) {
	
		Mediator mediator = new StockMediator();
		Colleague goldmanSachs = new GoldmanSachs(mediator);
		goldmanSachs.setColleagueCode(1);
		
		Colleague jPMorgan = new JPMorgan(mediator);
		jPMorgan.setColleagueCode(2);
		
		goldmanSachs.sellOffer(50, "APPL");
		jPMorgan.sellOffer(10, "GOOGL");
		
		goldmanSachs.buyOffer(10, "GOOGL");
		jPMorgan.buyOffer(50, "APPL");

	}

}
