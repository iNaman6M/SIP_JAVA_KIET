//24 June 2021
// A sample Java program to sort an array of integers
// using Arrays.sort(). It by default sorts in
// ascending order

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ArraySort {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of the Arrays : ");
		
			for(int i = 0; i<arr.length; i++) {
				 arr[i] = sc.nextInt();			
				}
			
			Arrays.sort(arr);
			
			System.out.printf("New Sorted Array: %s", Arrays.toString(arr));
	}
	
}
