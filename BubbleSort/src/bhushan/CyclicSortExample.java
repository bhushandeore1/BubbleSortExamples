package bhushan;

import java.util.Arrays;

//Practice example for the cyclic sort

//if any example containing a range 1 to n then apply cyclic sort--!important
public class CyclicSortExample {

	public static void main(String[] args) {
		int [] num= {5,3,1,2,4};
		cyclicSort(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void cyclicSort(int[] num) {
		int i=0;
		while (i<num.length) {
			int correct=num[i]-1;
			if(num[i]!=num[correct]) {
				int tem=num[i];
				num[i]=num[correct];
				num[correct]=tem;
			}
			else {
				i++;
			}
		}
	}

}
