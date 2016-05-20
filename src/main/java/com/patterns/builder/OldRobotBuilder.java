package com.patterns.builder;

/**
 * 
 * @author prateekshah
 * Concrete implementation  where actual robot's parts will be built (Old ones)
 */
public class OldRobotBuilder implements RobotBuilder {
	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildHead() {
		this.robot.setHead("Tin Head");

	}

	@Override
	public void buildTorso() {
		this.robot.setTorso("Tin Torso");

	}

	@Override
	public void buildArms() {
		this.robot.setArms("Tin Arms");

	}

	@Override
	public void buildLegs() {
		this.robot.setLegs("Tin Legs");

	}
	
	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
