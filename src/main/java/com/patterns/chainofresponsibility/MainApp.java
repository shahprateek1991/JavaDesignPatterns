package com.patterns.chainofresponsibility;

import java.util.Scanner;

public class MainApp {
	
	private Chain mainChain; 
	
	public Chain getMainChain() {
		return mainChain;
	}
	
	public MainApp() {
		
		mainChain = new Dispense50DollorNote();
		Chain dollorDispenser20 = new Dispense20DollorNote();
		Chain dollorDispenser10 = new Dispense10DollorNote();
		mainChain.setNextChain(dollorDispenser20);
		dollorDispenser20.setNextChain(dollorDispenser10);
	}

	public static void main(String[] args) {
		
		System.out.println("Please enter the amount to be dipensed(multiple of 10)");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		
		if(amount%10 !=0) {
			System.out.println("Sorry! You need to enter the amount in multiple of 10's");
			sc.close();
			return;
		}
		
		MainApp mainApp = new MainApp();
		
		mainApp.getMainChain().dispenseCash(amount);
		sc.close();

	}

}
