package com.patterns.command;

public class TurnDeviceOn implements Command {
	
	private Device device;
	
	

	public TurnDeviceOn(Device device) {
		this.device = device;
	}



	@Override
	public void execute() {
		device.on();

	}

}
