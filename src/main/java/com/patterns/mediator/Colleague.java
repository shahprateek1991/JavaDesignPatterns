package com.patterns.mediator;

public abstract class Colleague {
	
	private Mediator mediator;
	private int colleagueCode;
	
	public Colleague(Mediator mediator) {
		
		this.mediator = mediator;
	}

	public int getColleagueCode() {
		return colleagueCode;
	}

	public void setColleagueCode(int colleagueCode) {
		this.colleagueCode = colleagueCode;
	}
	
	public void buyOffer(int numberOfShares, String stockSymbole) {
		
		mediator.buyOffer(numberOfShares, this.getColleagueCode(), stockSymbole);
	}
	
	public void sellOffer(int numberOfShares, String stockSymbole) {
		
		mediator.sellOffer(numberOfShares, this.getColleagueCode(), stockSymbole);
	}

}
