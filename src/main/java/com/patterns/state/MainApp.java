package com.patterns.state;

public class MainApp {

	public static void main(String[] args) {
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.enterPIN(1234);
		atmMachine.requestCash(500);
		
		atmMachine.insertCard();
		atmMachine.enterPIN(58765);
		atmMachine.requestCash(500);
		atmMachine.enterPIN(12345);
		atmMachine.requestCash(20000);
		
		atmMachine.requestCash(100);
		atmMachine.ejectCard();
		
		atmMachine.requestCash(500);

	}

}
