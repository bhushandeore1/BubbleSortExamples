package bhushan;

import java.util.Arrays;
import java.util.Iterator;

public class FisrtBubbleSortExample {

	public static void main(String[] args) {
//		int[] num= {5,4,3,2,1};
		int[] num= {-1,-2781,0,2,3,4,565656,5,6,7,9};
		bubble(num);
		System.out.println(Arrays.toString(num));
	}

	private static void bubble(int[] num) {
		boolean swapped=false;
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length-i; j++) {
				
				if(num[j]<num[j-1]) {
					int temp=num[j-1];
					num[j-1]=num[j];
					num[j]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			
		}
		
	}

}
