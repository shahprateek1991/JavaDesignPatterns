package com.patterns.command;

public class TurnDeviceVolumeDown implements Command {
	
	private Device device;
	

	public TurnDeviceVolumeDown(Device device) {
		this.device = device;
	}


	@Override
	public void execute() {
		device.volumeDown();

	}

}


