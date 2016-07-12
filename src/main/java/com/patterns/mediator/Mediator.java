package com.patterns.mediator;

public interface Mediator {
	
	public void sellOffer(int numberOfShares, int colleagueCode, String stockSymbole);
	public void buyOffer(int numberOfShares, int colleagueCode, String stockSymbole);
	public void addColleague(Colleague colleague);

}
