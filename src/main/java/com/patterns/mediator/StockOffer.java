package com.patterns.mediator;

public class StockOffer {
	
	private int numberOfShares = 0;
	private String stockSymbole = "";
	private int colleagueCode = 0;
	
	public StockOffer(int numberOfShares, String stockSymbole, int colleagueCode) {
		super();
		this.numberOfShares = numberOfShares;
		this.stockSymbole = stockSymbole;
		this.colleagueCode = colleagueCode;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public String getStockSymbole() {
		return stockSymbole;
	}

	public void setStockSymbole(String stockSymbole) {
		this.stockSymbole = stockSymbole;
	}

	public int getColleagueCode() {
		return colleagueCode;
	}

	public void setColleagueCode(int colleagueCode) {
		this.colleagueCode = colleagueCode;
	}
	
	
	
	

}
