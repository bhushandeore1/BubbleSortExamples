package bhushan;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

//Leetcode 88
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
public class MergeSortedArray {
	public static void main(String[] args) {
		int [] nums1= {1,2,3,0,0,0};
		int [] nums2= {2,5,6};
		
		merge1(nums1,3,nums2,3);
		
		
//		merge(nums1,3,nums2,3);
//		int[] newarr=removezero(nums1);
//		merge(newarr, 3, nums2, 3);
	}
	
	private static void merge1(int[] nums1, int m, int[] nums2, int n) {
		for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
		
	}

	public static int[] removezero(int[] nums) {
		String ans;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			count++;
			if(nums[i]==0) {
				count--;
			}
		}
		int newArr[]=new int[count];
		for(int i=0,j=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				newArr[j]=nums[i];
				j++;
			}
		}
//		System.out.println(Arrays.toString(newArr));
		
		return newArr;
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output=new int[m+n];
        int count=0;
        for(int i=0;i<m;i++){
            output[i]=nums1[i];
            count++;
        }
        for(int j=0;j<n;j++){
            output[count++]=nums2[j];
        }
        System.out.println(Arrays.toString(output));
        
        for(int i=0;i<output.length;i++) {
        	for(int j=1;j<output.length-i;j++) {
        		if(output[j]<output[j-1]) {
        			int tem=output[j-1];
        			output[j-1]=output[j];
        			output[j]=tem;
        		}
        	}
        }
        System.out.println(Arrays.toString(output));
    }


}
