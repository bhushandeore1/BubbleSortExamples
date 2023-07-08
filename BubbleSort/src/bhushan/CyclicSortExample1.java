package bhushan;

import java.util.Arrays;

public class CyclicSortExample1 {

	public static void main(String[] args) {

		int [] num= {5,4,3,2,1};
		sort1(num);
		System.out.println(Arrays.toString(num));

	}

	private static void sort1(int[] num) {
		int i=0;
		while(i<num.length) {
			int correctposition=num[i]-1;
			if(num[i]!=num[correctposition]) {
				int temp=num[i];
				num[i]=num[correctposition];
				num[correctposition]=temp;
			}
			else {
				i++;
			}
		}
		
	}

}
