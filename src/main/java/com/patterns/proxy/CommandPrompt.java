package com.patterns.proxy;

import java.io.IOException;

public interface CommandPrompt {
	
	public void execute(String command) throws IOException;

}
