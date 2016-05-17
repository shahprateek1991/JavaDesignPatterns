package com.patterns.factory;

/**
 * 
 * @author prateekshah
 * Concrete implementations of the products
 */
public class RocketEnemyShip extends EnemyShip {

	public RocketEnemyShip() {
		super.setName("RocketEnemyShip");
		super.setSpeed(300.00);
		super.setDamage(70);
	}
	
	

}
