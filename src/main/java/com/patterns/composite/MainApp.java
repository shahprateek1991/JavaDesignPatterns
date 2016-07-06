package com.patterns.composite;

public class MainApp {

	public static void main(String[] args) {
		
		SongComponent grunge = new SongGroup("Metal");
		grunge.add(new Song("Nothing Else Matter", "Mettalica", 1992));
		grunge.add(new Song("Fule", "Mettalica", 1994));
		grunge.add(new Song("Astronomy", "Mettalica", 1996));
		
		SongComponent rock = new SongGroup("Rock");	//Groups
		rock.add(new Song("Back in Black", "AC/DC", 1990));
		rock.add(new Song("Highway to Hell", "AC/DC", 1993));
		
		SongComponent allSongs = new SongGroup("All Songs");
		allSongs.add(grunge);
		allSongs.add(rock);
		allSongs.add(new Song("Comfortably Numb", "Pink Floyd",1990)); //Leaf Node
		
		allSongs.displayInfo();

	}

}
