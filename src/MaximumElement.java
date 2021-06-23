
//24 June 2021
// Java Program to find maximum in arr[] 

import java.util.Arrays;

public class MaximumElement {
	
	public static int maxElement(int []arr) {
		
		//variable declare max to store 0 index element as inititation
		int max = arr[0]; 
		
		//Traversing 
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	//Driver Method
	public static void main(String []args) {
		int arr[] = {23,4,67,8,34};
		
		System.out.println("The largest element in : "+Arrays.toString(arr)+" is "+maxElement(arr));
		
	}
}
