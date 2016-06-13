package com.patterns.facade;

public class FundTransactions {
	
	private double cashInAccount = 10000;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void increaseMoney(double funds) {
		cashInAccount += funds;
	}
	
	public void decreaseMoney(double funds) {
		cashInAccount -= funds;
	}
	
	public boolean hasEnoughFunds(double funds) {
		return (cashInAccount > funds);
		
	}

}
