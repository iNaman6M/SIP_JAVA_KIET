package com.codeForCause;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
		
	public static void main(String []args) {
				
		Scanner sc = new Scanner(System.in);
		//int[] nums = new int[5];
		
		int[] nums = {1,34,5,6,7,8,4,56};
	
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = sc.nextInt();
//		}
		int element = 56;
	//	int index = LinearSearch(nums, element);
		
		System.out.println(Arrays.toString(nums));
	
		int index = binarySearch(nums, element);
		System.out.println("Element"+element+" found at index"+index);
		
		int maximum = maxElement(nums);
		System.out.println("index of max element is : "+maximum);
}
//	
//	public static int LinearSearch(int[] nums, int element) {
//		for(int i = 0;i<nums.length;i++) {
//			if(nums[i] == element) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	public static int binarySearch(int[] nums,int element) {
		int start = 0,end = nums.length -1;
		while(start <= end) {
			int mid = (start+end)/2;
				if(nums[mid] == element) {
					return mid;
				}
				else if(nums[mid] < element) {
					start = mid + 1;
				}
				else {
					end = mid - 1;
				}
		}
	
		return -1;
}

	
	public static int maxElement(int[] nums) {
		int max = 0;
		for(int i =0;i<nums.length;i++) {
			if(nums[max] < nums[i]) {
				max = i;
			}
		}
		return max;
	}
}