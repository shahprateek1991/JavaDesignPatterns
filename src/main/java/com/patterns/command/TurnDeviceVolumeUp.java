package com.patterns.command;

public class TurnDeviceVolumeUp implements Command {
	
	private Device device;
	
	

	public TurnDeviceVolumeUp(Device device) {
		this.device = device;
	}



	@Override
	public void execute() {
		device.volumeUp();

	}

}

