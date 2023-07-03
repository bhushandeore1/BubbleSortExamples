package bhushan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than 
//⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//Input: nums = [3,2,3]
//Output: 3
public class MajorityElement {

	public static void main(String[] args) {
		int[] nums= {2,2,2,1,2,3,1};
		sortTheArray(nums);
		
		//1st method brutforce
		int frequency,j,i;
		for(i=0;i<nums.length;i++) {
			frequency=1;
			for(j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]){
					frequency++;
					
				}
				else {
					break;
				}
			}
			i=j-1;
			if(frequency>(nums.length)/2) {
				System.out.println(nums[i]);
			}
		}
		
		
		
		//2nd method Moore Voting Algorithm
//		int[] nums= {2,2,2,1,2,3,1};
		int start=0;
		int element=0;
		for (int k : nums) {
			if(start==0) {
				element=k;
			}
			if(element==k) {
				start++;
			}
			else {
				start--;
			}
		}
		System.out.println(element);
	}
	
	public static void sortTheArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=1;j<nums.length-i;j++) {
				if(nums[j]<nums[j-1]) {
					int temp=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=temp;
				}
			}
		}
	}

}
