package com.patterns.iterator;

public enum Language {
	
	EN("English"),ES("Spanish");
	
	String description;
	
	Language(String desc) {
		
		this.description = desc;
	}

	public String getDescription() {
		return description;
	}
	
	

}
