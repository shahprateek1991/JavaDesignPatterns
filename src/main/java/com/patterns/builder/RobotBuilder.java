package com.patterns.builder;

/**
 * 
 * @author prateekshah
 * A blue print for all the type of the robot builders
 */
public interface RobotBuilder {
	
	public void buildHead();
	
	public void buildTorso();
	
	public void buildArms();
	
	public void buildLegs();
	
	public Robot getRobot();

}
