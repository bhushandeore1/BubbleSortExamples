package bhushan;

import java.util.Iterator;

//Given an integer array nums, 
//return true if any value appears at least twice in the array, and return false if every element is distinct.

//Input: nums = [1,2,3,1]
//Output: true

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4};
		sortTheArray(nums);
		System.out.println(checkduplicate(nums));
	}

	private static void sortTheArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length-i; j++) {
				if(nums[j]<nums[j-1]) {
					int tem=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=tem;
				}
			}
		}
		
	}

	private static boolean checkduplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int k = 1; k < nums.length-i; k++) {
				if(nums[i]==nums[k]) {
					return true;
				}
			}
		}
		
		return false;
		
	}

}
