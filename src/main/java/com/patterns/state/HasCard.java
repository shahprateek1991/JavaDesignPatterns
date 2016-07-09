package com.patterns.state;

public class HasCard implements ATMState {
	
	private ATMMachine atmMachine;
	
	public HasCard(ATMMachine atmMachine) {
		
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		
		System.out.println("You can not enter more than one card");

	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		atmMachine.setCurrentState(atmMachine.getNoCard());

	}

	@Override
	public void enterPIN(int pin) {
		
		if(atmMachine.getCorrectPIN() == pin) {
			atmMachine.setCurrentState(atmMachine.getHasCorrectPIN());
		} else {
			System.out.println("The PIN entered is not correct");
		}

	}

	@Override
	public void requestCash(int amount) {
		
		System.out.println("Please enter a PIN");

	}

}
