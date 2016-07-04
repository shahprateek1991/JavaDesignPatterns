package com.patterns.facade;

/**
 * 
 * @author prateekshah
 * 
 *Account facade for facading all the background operation 
 * and providing single methods to the user
 */
public class AccountFacade {
	
	private long accountNumber;
	private long securityNumber;
	
	private WelcomeToBank welcomeToBank;
	private AccountCheck accountCheck;
	private SecurityCheck securityCheck;
	private FundTransactions fundTransactions;
	
	public AccountFacade(long accountNumber, long securityNumber){
		this.accountNumber = accountNumber;
		this.securityNumber = securityNumber;
		
		welcomeToBank = new WelcomeToBank();
		accountCheck = new AccountCheck();
		securityCheck = new SecurityCheck();
		fundTransactions = new FundTransactions();
		
	}
	
	public void deposite(double funds) {
		
		if(accountCheck.isAccountActive(accountNumber) && 
				securityCheck.isSecurityCodeCorrect(securityNumber)) {
			fundTransactions.increaseMoney(funds);
			System.out.println("Money added to your account : "+funds);
			System.out.println("Account balance : "+fundTransactions.getCashInAccount());
			System.out.println();
		} else {
			System.out.println("Sorry! the information you provided is not correct.");
			System.out.println();
		}
		
	}
	
	public void withdraw(double funds) {
		if(accountCheck.isAccountActive(accountNumber) && 
				securityCheck.isSecurityCodeCorrect(securityNumber)) {
			if(fundTransactions.hasEnoughFunds(funds)) {
				fundTransactions.decreaseMoney(funds);
				System.out.println("Money withdrawed from your account : "+funds);
				System.out.println("Account balance : "+fundTransactions.getCashInAccount());
				System.out.println();
			} else {
				System.out.println("Sorry! You do not have enough funds in your account");
				System.out.println("Account balance : "+fundTransactions.getCashInAccount());
				System.out.println();
			}
		} else {
			System.out.println("Sorry! the information you provided is not correct.");
			System.out.println();
		}
	}

}
