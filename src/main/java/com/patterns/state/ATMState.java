package com.patterns.state;

public interface ATMState {
	
	public void insertCard();
	public void ejectCard();
	public void enterPIN(int pin);
	public void requestCash(int amount);

}
