package com.patterns.composite;

public interface SongComponent {
	
	public void add(SongComponent songComponent);
	public SongComponent get(int index);
	public void remove(SongComponent songComponent);
	
	public void displayInfo();

}
