package com.codeForCause;

import java.util.Arrays;
import java.util.Iterator;

public class sorting {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,5,63,3,16,35};
		
		System.out.println(Arrays.toString(nums));
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void bubbleSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-1-i;j++) {
				
			
			if(nums[j] > nums[j+1]) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			}
		}
	}
}
