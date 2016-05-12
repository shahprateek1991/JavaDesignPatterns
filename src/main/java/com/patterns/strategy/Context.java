package com.patterns.strategy;

/**
 * 
 * @author prateekshah
 *
 * @param <T>
 * 
 * Context for determining the strategies
 */
public class Context<T> {
	
	Strategy<T> strategy;

	public Strategy<T> getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy<T> strategy) {
		this.strategy = strategy;
	}

	public Context(Strategy<T> strategy) {
		this.strategy = strategy;
	}
	
	public void sort(T[] arr) {
		this.strategy.sort(arr);
	}
	
	

}
