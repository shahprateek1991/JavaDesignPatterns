package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup implements SongComponent {
	
	private List<SongComponent> songComponents = new ArrayList<>();
	private String groupName;
	
	public SongGroup(String groupName) {
		
		this.groupName = groupName;
	}
	
	

	@Override
	public void add(SongComponent songComponent) {
		
		songComponents.add(songComponent);
		
	}

	@Override
	public SongComponent get(int index) {
		
		return songComponents.get(index);
	}

	@Override
	public void remove(SongComponent songComponent) {
		
		songComponents.remove(songComponent);
		
	}

	@Override
	public void displayInfo() {
		
		System.out.println("Group Name : "+ this.groupName);
		System.out.println("Components are : \n");
		for(SongComponent songComponent : songComponents) {
			songComponent.displayInfo();
		}
		
	}


}
