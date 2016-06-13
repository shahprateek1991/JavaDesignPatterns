package com.patterns.adapter;

public class SocketAdapter implements TwoPinSocket {
	
	private ThreePinSocket threePinSocket;
	
	private static String EARTH = "0";
	
	public SocketAdapter(ThreePinSocket threePinSocket) {
		this.threePinSocket = threePinSocket;
	}

	@Override
	public void plug(String firstPin, String secondPin) {
		threePinSocket.plug(firstPin, secondPin, EARTH);

	}

}
