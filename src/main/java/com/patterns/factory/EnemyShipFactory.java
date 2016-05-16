package com.patterns.factory;

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
