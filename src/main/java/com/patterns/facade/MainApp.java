package com.patterns.facade;

public class MainApp {

	public static void main(String[] args) {
		
		AccountFacade accountFacade = new AccountFacade(123456789, 123456789);
		
		accountFacade.withdraw(8000);
		
		accountFacade.withdraw(3000);
		
		accountFacade.deposite(5000);
		
		accountFacade.withdraw(2000);
	}

}
