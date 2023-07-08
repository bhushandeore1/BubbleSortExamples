package bhushan;

import java.util.Arrays;
import java.util.Iterator;

public class SelectionSortExample {

	public static void main(String[] args) {
		int []num= {3,5,1,6,2};
		SelectionSort(num);
		System.out.println(Arrays.toString(num));

	}
	
	public static void SelectionSort(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int last=num.length-i-1;
			int maxnum=getMaxElement(num,0,last);
			swap(num,maxnum,last);
		}

	}
	
	private static void swap(int[] num, int maxnum, int last) {
		int tem=num[maxnum];
		num[maxnum]=num[last];
		num[last]=tem;
		
	}

	private static int  getMaxElement(int []arr,int start, int last) {
		int max=start;
		for (int i = start; i <= last; i++) {
			if(arr[i]>arr[start]) {
				max=i;
			}
		}
		return max;
	}

	
}
