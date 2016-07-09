package com.patterns.chainofresponsibility;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	
	public void dispenseCash(int amount);

}
