package day2.assignment;

public class FindingDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbrs = {2,8,9,7,2,6,8,7};
		
		for (int i=0;i<numbrs.length;i++) {
			for (int j=i+1;j<numbrs.length;j++) {
				if(numbrs[i]==numbrs[j]) {
					System.out.println(numbrs[i]);
				}
			}
		}

	}

}
