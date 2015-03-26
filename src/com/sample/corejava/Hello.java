package com.sample.corejava;
public class Hello {

	public static void main(String[] args) {
		
		String str = "Hello World!";
		System.out.println(str);	
		
		//UnInstantiable instantiable = new UnInstantiable();
		UnInstantiable instantiable = UnInstantiable.getUnInstantiable();
		
		System.out.println( "Random int from UnInstantiable class "+  instantiable.getRandomInteger());
	}

}
