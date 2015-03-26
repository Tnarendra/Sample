package com.sample.corejava;

import java.util.HashSet;

class Dog{
	String color;
 
	public Dog(String s){
		color = s;
	}
	
	//overridden method, has to be exactly the same like the following
		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Dog))
				return false;	
			if (obj == this)
				return true;
			return this.color.equals(((Dog) obj).color);
		}
		
		//test this example by commenting below hashCode method
		@Override
		public int hashCode(){
			return color.length();//for simplicity reason
		}
}


//1. If two objects are equal, then they must have the same hash code.
//2. If two objects have the same hashcode, they may or may not be equal.
//http://www.programcreek.com/2011/07/java-equals-and-hashcode-contract/

public class HshcodeAndEquals {
	
	public static void main(String[] args) {
		HashSet<Dog> dogSet = new HashSet<Dog>();
		dogSet.add(new Dog("white"));
		dogSet.add(new Dog("white"));
 
		System.out.println("We have " + dogSet.size() + " white dogs!");
 
		if(dogSet.contains(new Dog("white"))){
			System.out.println("We have a white dog!");
		}else{
			System.out.println("No white dog!");
		}
	}
}