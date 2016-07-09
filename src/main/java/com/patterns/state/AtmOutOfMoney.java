package com.patterns.state;

public class AtmOutOfMoney implements ATMState {
	
	private ATMMachine atmMachine;
	
	public AtmOutOfMoney(ATMMachine atmMachine) {
		
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		
		System.out.println("We don't have enough money to dispense");

	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		atmMachine.setCurrentState(atmMachine.getNoCard());

	}

	@Override
	public void enterPIN(int pin) {
		
		System.out.println("We don't have enough money to dispense");

	}

	@Override
	public void requestCash(int amount) {
		
		System.out.println("We don't have enough money to dispense");

	}

}

