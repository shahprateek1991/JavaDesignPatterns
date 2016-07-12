package com.patterns.chainofresponsibility;

public class Dispense10DollorNote implements Chain {
	
	//private Chain nextChain;  //no need of next Chain

	@Override
	public void setNextChain(Chain nextChain) {
		//this.nextChain = nextChain;  //no need of next chain

	}

	@Override
	public void dispenseCash(int amount) {
		
		int numberOfNotes = amount/10;
		System.out.println(numberOfNotes+" of 10 dollor notes dispensed");

	}

}


