package com.patterns.flyweight;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		
		String[] colors = {"Red","Blue","Black","White","Green","Purple","Pink","Cyan","Magenta","Yellow"};
		
		long startTimeWithoutFlyWeight = System.nanoTime();
		for(int i=0;i<100;i++) {
			
			Random random = new Random();
			String color = colors[random.nextInt(9)];
			ExpensiveObject expensiveObject = new ExpensiveObject(color);
			expensiveObject.setExtrinsicProperty(random.nextInt(5000));
			expensiveObject.setExtrinsicProperty(random.nextInt(1000));
			expensiveObject.performOperation();
		}
		
		System.out.println("Total time taken is: "+(System.nanoTime()-startTimeWithoutFlyWeight)+" ns\n\n\n");

		
		long startTime = System.nanoTime();
		for(int i=0;i<100;i++) {
			
			Random random = new Random();
			String color = colors[random.nextInt(9)];
			ExpensiveObject expensiveObject = ExpensiveObjectFactory.getInstance(color);
			expensiveObject.setExtrinsicProperty(random.nextInt(5000));
			expensiveObject.setExtrinsicProperty(random.nextInt(1000));
			expensiveObject.performOperation();
		}
		
		System.out.println("Total time taken is: "+(System.nanoTime()-startTime)+" ns\n\n\n");

	}

}
