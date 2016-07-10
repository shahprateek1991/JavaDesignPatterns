package com.patterns.flyweight;

public class ExpensiveObject {
	
	String intrinsicProperty;	//This property can not be shared among objects
	
	int extrinsicProperty;
	int anotherExtrinsicProperty;  //This property can be shared among objects
	
	public ExpensiveObject(String intrinsicProperty) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//The expensive object takes time to create object 
		this.intrinsicProperty = intrinsicProperty;
	}
	
	public void performOperation() {
		
		System.out.println("Some operation performed on Ecpensive object using "
				+ "intrinsicProperty :"+ this.intrinsicProperty + " " 
				+ "extrinsicProperty :"+ this.extrinsicProperty + " " 
				+ "anotherExtrinsicProperty :"+ this.anotherExtrinsicProperty + "" );
	}

	public int getExtrinsicProperty() {
		return extrinsicProperty;
	}

	public void setExtrinsicProperty(int extrinsicProperty) {
		this.extrinsicProperty = extrinsicProperty;
	}

	public int getAnotherExtrinsicProperty() {
		return anotherExtrinsicProperty;
	}

	public void setAnotherExtrinsicProperty(int anotherExtrinsicProperty) {
		this.anotherExtrinsicProperty = anotherExtrinsicProperty;
	}
	
	

}
