package com.patterns.singleton;

public class MainApp {

	public static void main(String[] args) {
		Singleton firstInstance = Singleton.getInstance();
		System.out.println(System.identityHashCode(firstInstance));
		
		//always returns the same instance
		Singleton secondInstance = Singleton.getInstance();
		System.out.println(System.identityHashCode(secondInstance));
	}

}
