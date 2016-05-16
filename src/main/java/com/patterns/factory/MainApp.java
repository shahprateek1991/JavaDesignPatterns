package com.patterns.factory;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Enter the type of ship you want to create(U/R)");
		Scanner userInput = new Scanner(System.in);
		String enemyShipType = userInput.next();
		
		EnemyShip enemyShip = EnemyShipFactory.makeEnemyShip(enemyShipType);
		enemyShip.displayEnemyShip();

	}

}
