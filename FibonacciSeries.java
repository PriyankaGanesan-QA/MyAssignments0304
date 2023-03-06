package day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		//fibonacci series - seq of numbers adding with the previous number
		int firstnum= 0;
		int secondnum=1;
		int sum;
		
		
		System.out.println(firstnum );
		System.out.println(secondnum );
		
		for (int i = 2; i < 11; i++) { 
		sum = firstnum + secondnum; // 1 // 1+1 =2 // 2+3 = 5 // 3+5 =8 // 5+8 -=13 // 5+18 = 23
		System.out.println(sum); // 1 // 2 // 5 // 8 // 13 // 23
	    firstnum = secondnum; // fn - 1, sn - 1 // fn -2 // fn - 3 // fn - 5 // fn-5 // fn - 18
		secondnum = sum; // sn - 1 // sn - 3 // sn -5 // sn -8 // sn - 13 // sn= 23
		
		}
		

	}

}
