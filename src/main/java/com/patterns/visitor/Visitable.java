package com.patterns.visitor;

public interface Visitable {
	
	public double accept(Visitor visitor);

}
