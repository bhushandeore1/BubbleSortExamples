//leetcode 287. Find the Duplicate Number
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.

//Example 1:
//Input: nums = [1,3,4,2,2]
//Output: 2

package bhushan;

import java.util.Arrays;
import java.util.Iterator;

public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		int[] nums= {1,3,4,2,2};
		cyclicSort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(findDuplicate(nums));

	}

	private static int findDuplicate(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i+1) {
				ans=nums[i];
			}
		}
		return ans;
	}

	private static void cyclicSort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(nums[i]!=nums[correctIndex]) {
				int temp=nums[i];
				nums[i]=nums[correctIndex];
				nums[correctIndex]=temp;
			}else {
				i++;
			}
		}
		
	}

}
