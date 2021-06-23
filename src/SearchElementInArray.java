// 24 June 2021
// Java program to check whether
// an element is present in array or not

import java.util.Arrays;

public class SearchElementInArray {
	
	public static void searchElement(int []arr,int toCheck) {
		boolean isPresent = false;
		
		//using the linear search : applying forEachLoop 
		
		for(int element : arr) {
			if(element == toCheck) {
				isPresent = true;
				break;
			}
		}
		System.out.println("The Element "+toCheck+" is present in the Array: "+isPresent);
	}
	
	
	//Driver method
	public static void main(String []args) {
		int arr[] = {23,12,4,65,7,8,9};
		
		int toCheck = 6;
		
		System.out.println("Given Array: "+Arrays.toString(arr));
		searchElement(arr, toCheck);
	}
	
}
