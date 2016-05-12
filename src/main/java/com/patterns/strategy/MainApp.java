package com.patterns.strategy;

/**
 * 
 * @author prateekshah
 * User can now change the strategy of the sorting algorithm on the fly and the sort algorithm will 
 * work according to the given strategy
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Strategy<Integer> strategy  = new MergeSort<>();
		Context<Integer> context = new Context<>(strategy);
		Integer[] arr = new Integer[5];
		context.sort(arr);
		strategy = new QuickSort<>();
		context.setStrategy(strategy);
		context.sort(arr);
		strategy = new BubbleSort<>();
		context.setStrategy(strategy);
		context.sort(arr);
		

	}

}
