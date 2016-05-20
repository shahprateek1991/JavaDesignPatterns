package com.patterns.prototype;

public interface Animal extends Cloneable {
	
	public Animal makeCopy() throws CloneNotSupportedException;

}
