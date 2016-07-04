package com.patterns.iterator;

public class Channel {
	
	private Language language;
	private String frequency;
	
	
	
	public Channel(String frequency, Language language) {
		
		this.frequency = frequency;
		this.language = language;

	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public String toString() {
		
		return "Channel at frequency "+ 
				this.frequency + " in language "+ this.language.getDescription();
	}
	
	
	
	

}
