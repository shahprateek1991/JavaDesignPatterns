package com.patterns.builder;

/**
 * 
 * @author prateekshah
 * An engineer to assemble all the parts of the robots built by the builder
 */
public class RobotEngineer {
	RobotBuilder robotBuilder;

	public RobotBuilder getRobotBuilder() {
		return robotBuilder;
	}

	public void setRobotBuilder(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	
	public Robot getRobot() {
		return this.robotBuilder.getRobot();
	}
	
	public void buildRobot() {
		this.robotBuilder.buildHead();
		this.robotBuilder.buildArms();
		this.robotBuilder.buildTorso();
		this.robotBuilder.buildLegs();
	}

}
