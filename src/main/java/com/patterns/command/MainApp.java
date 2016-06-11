package com.patterns.command;

public class MainApp {

	public static void main(String[] args) {
		Device device = DeviceFactory.getDevice("TV");
		
		DeviceButtons deviceButtons = new DeviceButtons();
		TurnDeviceOn turnDeviceOn = new TurnDeviceOn(device);
		TurnDeviceOff turnDeviceOff = new TurnDeviceOff(device);
		TurnDeviceVolumeUp turnDeviceVolumeUp = new TurnDeviceVolumeUp(device);
		TurnDeviceVolumeDown turnDeviceVolumeDown = new TurnDeviceVolumeDown(device);
		deviceButtons.setCommand(turnDeviceOn);
		deviceButtons.press();
		
		deviceButtons.setCommand(turnDeviceOff);
		deviceButtons.press();
		
		deviceButtons.setCommand(turnDeviceVolumeUp);
		deviceButtons.press();
		
		deviceButtons.setCommand(turnDeviceVolumeDown);
		deviceButtons.press();
	}

}
