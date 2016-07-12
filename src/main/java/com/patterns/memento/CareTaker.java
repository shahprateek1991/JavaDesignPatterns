package com.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> articleList = new ArrayList<>();
	
	public void addMemento(Memento memento) {
		
		articleList.add(memento);
	}
	
	public Memento getMemento(int index) {
		
		return articleList.get(index);
	}
	
	

}
