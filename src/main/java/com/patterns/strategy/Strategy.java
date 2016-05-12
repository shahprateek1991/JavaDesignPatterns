package com.patterns.strategy;

/**
 * 
 * @author prateekshah
 *
 * @param <T>
 * 
 * Interface for the blueprint of the various algorithms
 */
public interface Strategy<T> {
	
	public void sort(T[] arr);

}
