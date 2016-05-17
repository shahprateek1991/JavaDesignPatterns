package com.patterns.factory;

/**
 * 
 * @author prateekshah
 * Concrete implementations of the products
 */
public class UFOEnemyShip extends EnemyShip {

	public UFOEnemyShip() {
		super.setName("UFOEnemyShip");
		super.setSpeed(500.00);
		super.setDamage(100);
	}

	

}
