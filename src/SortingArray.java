

// Java Program to sort the elements
// of an array in ascending order

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	
	public static void printingArray(int []arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//Logic for Sorting the array
	public static void sortArray(int arr[]) {
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println("New Sorted array : ");
		printingArray(arr);
	}
	
	//Driver Method
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
			System.out.println("Enter the elements of the array : ");
			for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}

			System.out.println("Elements of enetered array : ");
			printingArray(arr);
			
			sortArray(arr);
	}
}
