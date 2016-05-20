package com.patterns.prototype;

public class MainApp {

	public static void main(String[] args) {
		Sheep sheep = new Sheep();
		Sheep newSheep = null;
		
		try {
			newSheep = sheep.makeCopy();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Copy is a deep copy rather than a shallow copy
		System.out.println("Orginal sheep:"+ System.identityHashCode(sheep));
		System.out.println("Cloned sheep:"+ System.identityHashCode(newSheep));

	}

}
