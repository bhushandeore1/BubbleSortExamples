package bhushan;

import java.util.ArrayList;
import java.util.Arrays;

//Leetcode :442. Find All Duplicates in an Array
//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//
//You must write an algorithm that runs in O(n) time and uses only constant extra space.
public class FindAllDuplicatesinanArray {

	public static void main(String[] args) {
		int []nums= {4,3,2,7,8,2,3,1};

		cyclicsort(nums);
		System.out.println(Arrays.toString(nums));
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=i+1) {
				arrayList.add(nums[i]);
			}
		}
		System.out.println(arrayList);

	}

	private static void cyclicsort(int[] nums) {
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
