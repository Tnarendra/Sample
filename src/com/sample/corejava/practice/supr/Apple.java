package com.sample.corejava.practice.supr;

import com.sample.corejava.practice.Fruit;

class Apple extends Fruit{ 
	
	public static void main(String... args) {
		
		Fruit ap = new Apple();
		System.out.println("Number of fruits "+ap.numberOfFruits());
		ap.fruitName("Apple");	
	}

	@Override
	public int numberOfFruits() {	
		return 10;
	}

	@Override
	public void taste() {
		// TODO Auto-generated method stub	
	}
}
