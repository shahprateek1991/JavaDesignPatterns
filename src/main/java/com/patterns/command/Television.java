package com.patterns.command;

public class Television implements Device {
	
	private int volume = 0;

	@Override
	public void on() {
		System.out.println("Television turned on");

	}

	@Override
	public void off() {
		System.out.println("Television turned off");

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Television volume turned up to "+volume);

	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Television turned down to "+volume);

	}

}
