package day2.assignment;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=i+1) // 1 = 0+1, 2 =1+1,3=2+1,4=3+1,6=4+1 ,7=5+1
			System.out.println(i+1);
			break;
			
			
			
		}


	}

}
