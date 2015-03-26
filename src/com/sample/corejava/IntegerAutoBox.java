package com.sample.corejava;

import java.util.ArrayList;
import java.util.List;

public class IntegerAutoBox {
    public static void main(String args[]) {
         Integer x = 400, y = 400;
         if (x == y)
            System.out.println("Same");
         else
            System.out.println("Not Same");
         
         if (x.intValue() == y.intValue())
             System.out.println("Same");
          else
             System.out.println("Not Same");
         
         Integer w = 40, z = 40;
         if (w == z)
            System.out.println("Same");
         else
            System.out.println("Not Same");
         
         
         Integer i = new Integer(-8);
         
         // 1. Unboxing through method invocation
         int absVal = absoluteValue(i);
         System.out.println("absolute value of " + i + " = " + absVal);
  
         List<Double> ld = new ArrayList<>();
         ld.add(3.1416);    // PI is autoboxed through method invocation.
  
         // 2. Unboxing through assignment
         double phi = ld.get(0);
         System.out.println("phi = " + phi);
     }
  
     public static int absoluteValue(int i) {
         return (i < 0) ? -i : i;
     }
}