package com.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator {
	
	private List<StockOffer> buyOffer = new ArrayList<>();
	private List<StockOffer> sellOffer = new ArrayList<>();
	private List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void sellOffer(int numberOfShares, int colleagueCode, String stockSymbole) {
		
		boolean found = false;
		for(StockOffer stockOffer : buyOffer) {
			
			if(stockOffer.getStockSymbole().equals(stockSymbole) 
					&& stockOffer.getNumberOfShares() == numberOfShares) {
				
				System.out.println(numberOfShares + " shares of "+ stockSymbole 
						+"sold by colleague "+colleagueCode+
						" to colleague "+ stockOffer.getColleagueCode());
				found = true;
			}
			
		}
		
		if(!found) {
			
			sellOffer.add(new StockOffer(numberOfShares, stockSymbole, colleagueCode));
			
			System.out.println("No offer found for stock offer (Number of shares-"+numberOfShares
					+" Stock Symbole-"+stockSymbole+" Colleague Code-"+colleagueCode+"\n");
			System.out.println("Adding it to the inventory");
			
		}
		
	}

	@Override
	public void buyOffer(int numberOfShares, int colleagueCode, String stockSymbole) {
		
		boolean found = false;
		for(StockOffer stockOffer : sellOffer) {
			
			if(stockOffer.getStockSymbole().equals(stockSymbole) 
					&& stockOffer.getNumberOfShares() == numberOfShares) {
				
				System.out.println(numberOfShares + " shares of "+ stockSymbole 
						+"bought by colleague "+colleagueCode+
						" from colleague "+ stockOffer.getColleagueCode());
				found = true;
			}
			
		}
		
		if(!found) {
			
			buyOffer.add(new StockOffer(numberOfShares, stockSymbole, colleagueCode));
			
			System.out.println("No offer found for stock offer (Number of shares-"+numberOfShares
					+" Stock Symbole-"+stockSymbole+" Colleague Code-"+colleagueCode+"\n");
			System.out.println("Adding it to the inventory");
			
		}
		
	}

	@Override
	public void addColleague(Colleague colleague) {
		
		colleagues.add(colleague);
		
	}

}
