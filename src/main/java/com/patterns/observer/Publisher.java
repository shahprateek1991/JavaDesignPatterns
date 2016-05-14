package com.patterns.observer;

public interface Publisher {
	public void register(Observer observer);
	
	public void unRegister(Observer observer);
	
	public void notifyObserver();

}
