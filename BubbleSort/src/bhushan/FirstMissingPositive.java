package bhushan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

//
//Given an unsorted integer array nums, return the smallest missing positive integer.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//nums = [1,2,0]
public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] nums= {3,4,-1,1};
		cyclicsort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(firstMissingPositive(nums));

	}
	
	 private static void cyclicsort(int [] nums) {
		int i=0;
		while(i<nums.length) {
				int correctIndex=nums[i]-1;
				if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correctIndex]) {
					int temp=nums[i];
					nums[i]=nums[correctIndex];
					nums[correctIndex]=temp;
				}
				else {
					i++;
				}
			}
			
		}
		


	public static int firstMissingPositive(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=i+1) {
				return i+1;
			}
			
		}
		return -1;
	        
	    }

}
