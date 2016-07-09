package com.patterns.state;

public class HasCorrectPIN implements ATMState {
	
	private ATMMachine atmMachine;
	
	public HasCorrectPIN(ATMMachine atmMachine) {
		
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		
		System.out.println("Card already inserted");

	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		atmMachine.setCurrentState(atmMachine.getNoCard());

	}

	@Override
	public void enterPIN(int pin) {
		
		System.out.println("PIN entered is correct");

	}

	@Override
	public void requestCash(int amount) {
		
		if(atmMachine.getCashInATM() >= amount) {
			System.out.println("Amount dispensed "+amount);
			atmMachine.setCashInATM(atmMachine.getCashInATM()-amount);
		} else {
			System.out.println("Not enough cash to dispense");
			atmMachine.setCurrentState(atmMachine.getAtmOutOfMoney());
		}

	}

}

