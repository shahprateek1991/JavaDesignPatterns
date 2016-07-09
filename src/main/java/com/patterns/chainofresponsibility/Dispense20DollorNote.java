package com.patterns.chainofresponsibility;

public class Dispense20DollorNote implements Chain {
	
	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;

	}

	@Override
	public void dispenseCash(int amount) {
		
		if(amount >= 20) {
			int numberOfNotes = amount/20;
			int remainder = amount%20;
			System.out.println(numberOfNotes+" of 20 dollor notes dispensed");
			if(remainder !=0) {
				this.nextChain.dispenseCash(remainder);
			}
		} else {
			this.nextChain.dispenseCash(amount);
		}

	}

}

