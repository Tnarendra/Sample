package com.sample.corejava;
import java.util.Scanner;


public class Prime {
	
	public void primes(int num) {
		int i;
		//int j = 0;
		//Set<Integer> st = new HashSet<Integer>();
		
		for(i=2; i<=num; i++){
			if(isPrime(i)){
				//st.add(i);
				//j++;				
			}
		}
		//System.out.println("Total num of prime's "+ j +" --> "+ st.toString() );

	}
	
	public static void prientPrimes(int n){
		boolean[] prime = new boolean[n+1];
		
		int i;		
		for(i=2; i<=n; i++){
			prime[i] = true;
		}
		
		for(int divisor=2; divisor*divisor <= n; divisor++ ){
			
			if(prime[divisor]){
				for(i=2*divisor; i<=n; i=i+divisor){					
					prime[i]=false;
				}
			}
		}
		
		for(i=2; i<=n; i++){
			if(prime[i]){
				//System.out.print(i+"," );
			}
		}
	}
	
	public static final boolean isPrime(int n){		 
		int divisor = 2;		 
		while(divisor < n ) {		 
			if( n % divisor == 0){
				 return false;
			 }
			 divisor++;
		 }
		return true;		
	}	
	
	public static void main(String args[]){		
		Prime pm = new Prime();
		
	      System.out.println("Enter the number till which prime number to be printed: ");
	      @SuppressWarnings("resource")
		int limit = new Scanner(System.in).nextInt();

		System.out.println("Number "+ limit + " is prime? "+isPrime(limit));

		long starttime = System.currentTimeMillis();
		pm.primes(limit);
		System.out.println("For loop take "+(System.currentTimeMillis() - starttime));
		
		long starttime1 = System.currentTimeMillis();
		Prime.prientPrimes(limit);
		System.out.println("Algorith take "+(System.currentTimeMillis() - starttime1));

	}
}
