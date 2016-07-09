package com.patterns.state;

public class NoCard implements ATMState {
	
	private ATMMachine atmMachine;
	
	public NoCard(ATMMachine atmMachine) {
		
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		
		System.out.println("Card Entered");
		atmMachine.setCurrentState(atmMachine.getHasCard());

	}

	@Override
	public void ejectCard() {
		System.out.println("No card to eject");
	}

	@Override
	public void enterPIN(int pin) {
		
		System.out.println("Please enter a card first");

	}

	@Override
	public void requestCash(int amount) {
		
		System.out.println("Please enter a card first");

	}

}

