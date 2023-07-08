package bhushan;

import java.util.Arrays;

//this is for cyclic sort leetcode problem 268
//Given an array nums containing n distinct numbers in the range [0, n],
//return the only number in the range that is missing from the array.
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
//2 is the missing number in the range since it does not appear in nums.
public class MissingNumber {

	public static void main(String[] args) {
		int []num= {3,0,1,4};
		cyclicsort(num);
//		System.out.println(num.length);
		System.out.println(Arrays.toString(num));
//		System.out.println(checkMissingnum(num));
//		checkMissingnum(num);
//		checkMissingnum1(num);
//		System.out.println(checkMissingnum1(num));
	}

	private static void cyclicsort(int[] num) {
		int i=0;
		while(i<num.length) {
			int correctIndex=num[i];
			if(num[i]<num.length && num[i]!=num[correctIndex]) {
				int tem=num[i];
				num[i]=num[correctIndex];
				num[correctIndex]=tem;
			}
			else {
				i++;
			}
		}
		
	}

	private static int checkMissingnum1(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if(num[i]!=i) {
				return i;
			}
		}
		return num.length;
		
	}

	private static int checkMissingnum(int[] num) {
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		} 
		int actualsum=0;
		for (int i = 0; i <= num.length; i++) {
			actualsum=actualsum+i;
		}
		
		return actualsum-sum;
		
		
	}
	

}
