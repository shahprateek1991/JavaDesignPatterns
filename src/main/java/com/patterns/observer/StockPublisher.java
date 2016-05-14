package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockPublisher implements Publisher {
	
	private double stockData;
	
	private List<Observer> observers = new ArrayList<>();

	public double getStockData() {
		return stockData;
	}

	public void setStockData(double stockData) {
		this.stockData = stockData;
		notifyObserver();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
		System.out.println("Observer registered"+observer);

	}

	@Override
	public void unRegister(Observer observer) {
		if(observers.remove(observer)){
			System.out.println("Observer unregistered"+observer);
		} else {
			System.out.println("No observer found to unregister");
		}
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(stockData);
			
		}

	}

}
