//Leetcode
//448. Find All Numbers Disappeared in an Array

//Given an array nums of n integers where nums[i] is in the range [1, n],
//return an array of all the integers in the range [1, n] that do not appear in nums.

//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]

package bhushan;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		cyclicSort(nums);
//		System.out.println(Arrays.toString(nums));
		ArrayList<Integer> newarrArrayList= new ArrayList<>();
		int i=0;
		while(i<nums.length) {
			if(nums[i]!=i+1) {
				newarrArrayList.add(i+1);
			}
			i++;
		}
		System.out.println(newarrArrayList);

	}

	private static void cyclicSort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(nums[i]!=nums[correctIndex]) {
				int temp=nums[i];
				nums[i]=nums[correctIndex];
				nums[correctIndex]=temp;
			}
			else {
				i++;
			}
		}
		
	}

	private static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length-i; j++) {
				if (nums[j-1]>nums[j]) {
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
	}

}
