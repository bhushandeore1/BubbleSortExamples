package bhushan;

import java.util.Arrays;
import java.util.Iterator;

public class InsertionSortExample {

	public static void main(String[] args) {
		int []num= {3,5,1,7,2,4};
		insertionSort(num);
		System.out.println(Arrays.toString(num));

	}

	public static void insertionSort(int[] num) {
		for(int i=0;i<num.length-1;i++) {
			for (int j = i+1; j>0; j--) {
				if(num[j-1]>num[j]) {
					int temp=num[j];
					num[j]=num[j-1];
					num[j-1]=temp;
				}
			}
		}
	}
		
	

}
