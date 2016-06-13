package com.patterns.adapter;

public class TwoPinSocketImpl implements TwoPinSocket {

	@Override
	public void plug(String firstPin, String secondPin) {
		System.out.println("Two Pin Socket: "+firstPin+" "+secondPin);

	}

}
