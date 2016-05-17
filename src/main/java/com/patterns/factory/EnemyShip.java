package com.patterns.factory;

/**
 * 
 * @author prateekshah
 * Abstract product
 */
public abstract class EnemyShip {
	private String name;
	private double damage;
	private double speed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void displayEnemyShip() {
		System.out.println("EnemyShip is: "+this.name+"\nSpeed: "+this.speed+"\nDamage: "+this.damage);
	}
	
	

}
