package com.patterns.abstractfactory;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		WidgetFactory widgetFactory = null;
		
		//getting the platform details from the user
		System.out.println("Enter the platform(Mac/MS)");
		Scanner userInput = new Scanner(System.in);
		String platform = userInput.next();
		//calling the appropriate factory based on the user's requirement
		if(platform.equals("MS")) {
			widgetFactory = new MSWidgetFactory();
			widgetFactory.createWindow();
		} else {
			widgetFactory = new MacWidgetFactory();
			widgetFactory.createWindow();
		}
		
		userInput.close();

	}

}
