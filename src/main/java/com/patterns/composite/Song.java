package com.patterns.composite;

public class Song implements SongComponent {
	
	private String songName;
	private String artistName;
	private int yearReleased;
	
	public Song(String songName, String artistName, int yearReleased) {
		
		this.songName = songName;
		this.artistName = artistName;
		this.yearReleased = yearReleased;
	}

	@Override
	public void add(SongComponent songComponent) {
		// Not required for the leaves
		
	}

	@Override
	public SongComponent get(int index) {
		// Not required for the leaves
		return null;
	}

	@Override
	public void remove(SongComponent songComponent) {
		// Not required for the leaves
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Song : " + this.songName+" Artist : "+this.artistName+" Year : "+this.yearReleased);
		
	}


}
