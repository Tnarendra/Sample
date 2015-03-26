package com.sample.corejava.practice;

import static java.lang.System.out;


public class SampleJava1 {
	
	/* Below are valid main method formats */
	//static public void main(String[] args)
    //public static void main(String... x)
    //static public void main(String bang_a_gong[])
    
	public static void main(String[] args) {
      out.println(args[0] + " " + args[1]);
    }
}