package com.patterns.builder;

/**
 * 
 * @author prateekshah
 * Concrete implementation  where actual robot's parts will be built (New ones)
 */
public class NewRobotBuilder implements RobotBuilder {
	
private Robot robot;
	
	public NewRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildHead() {
		this.robot.setHead("Vibranium Head");

	}

	@Override
	public void buildTorso() {
		this.robot.setTorso("Vibranium Torso");

	}

	@Override
	public void buildArms() {
		this.robot.setArms("Vibranium Arms");

	}

	@Override
	public void buildLegs() {
		this.robot.setLegs("Skating Legs");

	}
	
	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
