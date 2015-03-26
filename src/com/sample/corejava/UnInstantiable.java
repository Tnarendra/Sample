package com.sample.corejava;

public class UnInstantiable {
	
	// tested this class in Hello.java
	
	private static UnInstantiable currentUnInstantiable = new UnInstantiable();
	
    /** Don't let anyone else instantiate this class */
	private UnInstantiable() {}
	
	public static UnInstantiable getUnInstantiable(){
		return currentUnInstantiable;
	}
	
	public double getRandomInteger(){
		return Math.random();
	}
}
