package day1.assignment;

public class Day1Week1Assignment1 {

	public static void main(String[] args) {
	
		int firstnum= 0;
		int secondnum=1;
		int sum;
		int count=11;
		
		
		
		System.out.println(firstnum + " " + secondnum);
		
		for (int i = 2; i < count; ++i) {
		sum = firstnum + secondnum;
		System.out.println(" " + sum);
		
		firstnum = secondnum;
		secondnum = sum;
		
		}
		

	}

}
