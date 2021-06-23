
// A sample Java program to sort a subarray
// using Arrays.sort().

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SybArraySort {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of the Arrays : ");
		
			for(int i = 0; i<arr.length; i++) {
				 arr[i] = sc.nextInt();			
				}
			
//			Arrays.sort(arr,1,3);
			//for printing the sorted array in Descending using collection
			
//			Arrays.sort(arr, Collections.reverseOrder());
			
			System.out.printf("New Sorted Array: %s", Arrays.toString(arr));
	}
}
