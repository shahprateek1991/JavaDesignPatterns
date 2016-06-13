package com.patterns.adapter;

public class MainApp {

	public static void main(String[] args) {
		
		ThreePinSocket threePinSocket = new ThreePinSocket();
		
		TwoPinSocket pinSocket = new SocketAdapter(threePinSocket);
		
		pinSocket.plug("11A", "11A");

	}

}
