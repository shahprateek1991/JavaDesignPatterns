package com.patterns.command;

public class DeviceFactory {
	
	public static Device getDevice(String deviceName) {
		Device device;
		switch (deviceName) {
		case "TV":
			device = new Television();
			break;
			
		case "Radio":
			device = new Television();
			break;

		default:
			device = new Television();
			break;
		}
		
		return device;
	}

}
