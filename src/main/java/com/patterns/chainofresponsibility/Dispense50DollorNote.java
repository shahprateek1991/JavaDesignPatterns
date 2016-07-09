package com.patterns.chainofresponsibility;

public class Dispense50DollorNote implements Chain {
	
	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;

	}

	@Override
	public void dispenseCash(int amount) {
		
		if(amount >= 50) {
			int numberOfNotes = amount/50;
			int remainder = amount%50;
			System.out.println(numberOfNotes+" of 50 dollor notes dispensed");
			if(remainder !=0) {
				this.nextChain.dispenseCash(remainder);
			}
		} else {
			this.nextChain.dispenseCash(amount);
		}

	}

}
