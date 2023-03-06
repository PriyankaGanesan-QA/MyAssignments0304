package day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// check the given number is prime
		
		int numbr = 13;
		
		boolean prime = true;
		
		for (int i = 2; i < numbr; i++) {
			
			if(numbr%i==0) {
				System.out.println("Non Prime");
				prime=false;
				break;
			} 
			
		}
			
			if(prime)
			{
				System.out.println("Prime");
			}
				
			
		}
		


	}


