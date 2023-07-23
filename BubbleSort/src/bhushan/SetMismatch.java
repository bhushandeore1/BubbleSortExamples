package bhushan;

import java.util.ArrayList;
import java.util.Arrays;

//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
public class SetMismatch {

	public static void main(String[] args) {
	 int[] nums = {1,2,2,4};
	 CyclicSort(nums);
//	 System.out.println(Arrays.toString(nums));
//	 ArrayList<Integer> arrayList=new ArrayList<>();
//	 for(int i=0;i<nums.length;i++) {
//		 if(nums[i]!=i+1) {
//			 arrayList.add(nums[i]);
//			 arrayList.add(nums[i]+1);
//		 }
//	 }
//	 System.out.println(arrayList);
	 
	 int [] ans= findErrorNums(nums);
	 System.out.println(Arrays.toString(ans));
	 
	}
	
	public static int[] findErrorNums(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			 if(nums[i]!=i+1) {
				 return new int[] {nums[i],i+1};
			 }
		 }
		
		return new int[] {-1,-1};
    }

	private static void CyclicSort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correctindex=nums[i]-1;
			if(nums[i]!=nums[correctindex]) {
				int temp=nums[i];
				nums[i]=nums[correctindex];
				nums[correctindex]=temp;
			}
			else {
				i++;
			}
		}
		
	}

}
