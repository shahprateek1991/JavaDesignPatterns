package com.patterns.singleton;
/**
 * 
 * @author prateekshah
 * <b> After all this a user can instantiate the class using the Serializable interface
 * for this you can add transient to the field</b> 
 */
public class Singleton {
	
	//private variable- not accessible outside the class
	private static Singleton firstInstance = null;
	
	//private constructor- no one would be able to instantiate the class
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		//if instance is null then initialize it
		if(firstInstance == null) {
			//taking class level lock and making sure that no other thread can instantiate another object
			synchronized(Singleton.class) {
				//Double checking of the null in case of one thread has already passed the first case
				if(firstInstance == null) {
					firstInstance = new Singleton();
				}
			}
		}
		
		return firstInstance;
	}

}
