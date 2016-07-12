package com.patterns.mediator;

public class JPMorgan extends Colleague {

	public JPMorgan(Mediator mediator) {
		super(mediator);
		
		System.out.println("JPMorgan signed in to the system");
	}

}
