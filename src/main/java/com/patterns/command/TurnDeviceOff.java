package com.patterns.command;

public class TurnDeviceOff implements Command {
	
	private Device device;
	
	

	public TurnDeviceOff(Device device) {
		this.device = device;
	}



	@Override
	public void execute() {
		device.off();

	}

}
