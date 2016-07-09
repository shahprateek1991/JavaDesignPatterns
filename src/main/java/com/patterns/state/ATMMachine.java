package com.patterns.state;

public class ATMMachine implements ATMState {
	
	private ATMState hasCard;
	private ATMState noCard;
	private ATMState hasCorrectPIN;
	private ATMState atmOutOfMoney;
	
	private ATMState currentState;
	
	private int cashInATM = 20000;
	private int correctPIN = 12345;
	
	public ATMMachine() {
		
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPIN = new HasCorrectPIN(this);
		atmOutOfMoney = new AtmOutOfMoney(this);
		
		currentState = noCard;
		
		if(cashInATM <=0){
			currentState = atmOutOfMoney;
		}
	}
	
	public void setCurrentState(ATMState atmState) {
		this.currentState = atmState;
	}
	
	

	@Override
	public void insertCard() {
		currentState.insertCard();
		
	}

	@Override
	public void ejectCard() {
		currentState.ejectCard();
		
	}

	@Override
	public void enterPIN(int pin) {
		currentState.enterPIN(pin);
		
	}

	@Override
	public void requestCash(int amount) {
		currentState.requestCash(amount);
		
	}

	public ATMState getHasCard() {
		return hasCard;
	}

	public ATMState getNoCard() {
		return noCard;
	}

	public ATMState getHasCorrectPIN() {
		return hasCorrectPIN;
	}

	public ATMState getAtmOutOfMoney() {
		return atmOutOfMoney;
	}

	public ATMState getCurrentState() {
		return currentState;
	}

	public int getCashInATM() {
		return cashInATM;
	}
	
	public void setCashInATM(int cashInATM) {
		this.cashInATM = cashInATM;
	}

	public int getCorrectPIN() {
		return correctPIN;
	}
	
	

}
