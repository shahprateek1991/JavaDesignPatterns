package com.patterns.observer;

public class StockObserver implements Observer {
	private double data;
	
	private static int observerIdTracker = 0;
	private int observerId;
	
	private Publisher publisher;

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}


	public StockObserver() {
		this.observerId = ++observerIdTracker;
		
	}
	@Override
	public void update(double data) {
		System.out.println("Observer Id: "+this.observerId);
		System.out.println("Stock value updated from "+ this.data+" to " );
		this.data = data;
		System.out.println(this.data);
		

	}

}
