package com.patterns.builder;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		RobotBuilder robotBuilder;
		System.out.println("Enter the type of robot you want to create(Old/New)");
		Scanner userInput = new Scanner(System.in);
		String robotType = userInput.next();
		if(robotType.equals("Old")) {
			robotBuilder = new OldRobotBuilder();
		} else {
			robotBuilder = new NewRobotBuilder();
		}
		
		RobotEngineer engineer = new RobotEngineer();
		engineer.setRobotBuilder(robotBuilder);
		engineer.buildRobot();
		System.out.println(engineer.getRobot());
		
		
		userInput.close();

	}

}
