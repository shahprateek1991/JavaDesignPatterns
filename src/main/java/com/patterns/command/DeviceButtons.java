package com.patterns.command;

public class DeviceButtons {
	
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void press() {
		command.execute();
	}
}
