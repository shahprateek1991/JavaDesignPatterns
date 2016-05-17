package com.patterns.factory;

/**
 * 
 * @author prateekshah
 * Factory for generating the products
 */
public class EnemyShipFactory {
	
	public static EnemyShip makeEnemyShip(String s) {
		EnemyShip ship = null;
		
		switch(s) {
		case "U" : 
			ship = new UFOEnemyShip();
			break;
		case "R":
			ship = new RocketEnemyShip();
			break;
		default :
			ship = null;
		}
		
		return ship;
	}

}
