package com.sample.corejava.practice;
public abstract class Fruit{ 
	 
	public abstract int numberOfFruits();
	
	 public abstract void taste();
	 
	 public void fruitName(String fName) {
		System.out.println("Fruit name is '"+ fName+"'." );
	 }
	
}