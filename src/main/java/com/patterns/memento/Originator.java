package com.patterns.memento;

public class Originator {
	
	private String article;
	
	public void setArticle(String article) {
		
		this.article = article;
		
	}
	
	public String restoreFromMemento(Memento memento) {
		
		return memento.getArticle();
	}
	
	public Memento storeInMemento() {
		
		return new Memento(article);
	}

}
