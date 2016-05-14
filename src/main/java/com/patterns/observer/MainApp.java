package com.patterns.observer;

public class MainApp {

	public static void main(String[] args) {
		Publisher publisher = new StockPublisher();
		Observer observer1 = new StockObserver();
		Observer observer2 = new StockObserver();
		publisher.register(observer1);
		((StockPublisher)publisher).setStockData(192.00);
		((StockPublisher)publisher).setStockData(125.00);
		publisher.register(observer2);
		((StockPublisher)publisher).setStockData(200.00);
		((StockPublisher)publisher).setStockData(210.00);
		publisher.unRegister(observer1);
		((StockPublisher)publisher).setStockData(150.00);
		((StockPublisher)publisher).setStockData(140.00);
		

	}

}
