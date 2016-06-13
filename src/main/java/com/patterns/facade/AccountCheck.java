package com.patterns.facade;

public class AccountCheck {

	private long accountNumber = 123456789;
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public boolean isAccountActive(long accountNumber) {
		return (this.accountNumber == accountNumber);
	}
}
