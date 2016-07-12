package com.patterns.mediator;

public class GoldmanSachs extends Colleague {

	public GoldmanSachs(Mediator mediator) {
		super(mediator);
		
		System.out.println("GoldmanSachs signed in to the system");
	}

}
