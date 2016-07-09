package com.patterns.proxy;

import java.io.IOException;

public class CommandPromptProxy implements CommandPrompt {
	
	private CommandPrompt commandPrompt;
	boolean isAdmin = false;
	
	public CommandPromptProxy(String userName, String password) {
		
		if(userName!=null && password !=null && 
				userName.equals("root") && password.equals("root")) {
			isAdmin = true;
		}
		
		commandPrompt = new CommandPromptImpl();
		
	}

	@Override
	public void execute(String command) throws IOException {
		
		if(isAdmin) {
			commandPrompt.execute(command);
		} else {
			System.out.println("You do not have the permission to execute commands");
		}
		
	}

}
