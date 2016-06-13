package com.patterns.facade;

public class SecurityCheck {
	
	private long securityNumber = 123456789;
	
	public long getSecurityNumber() {
		return this.securityNumber;
	}
	
	public boolean isSecurityCodeCorrect(long securityNumber) {
		return (this.securityNumber == securityNumber);
	}

}
