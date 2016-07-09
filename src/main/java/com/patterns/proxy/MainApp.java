package com.patterns.proxy;

import java.io.IOException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter user name");
		String userName = sc.nextLine();
		
		System.out.println("Please enter password");
		String password = sc.nextLine();
		
		
		CommandPrompt commandPromptProxy = new CommandPromptProxy(userName, password);
		commandPromptProxy.execute("ls -ltr");
		
		sc.close();

	}

}
