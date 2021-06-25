//Java SubString Comparison

import java.util.Scanner;

public class javaSubStringComparison {
	
	public static String getSmallestAndLargest(String s, int k) {
			
		String smallest = "";
		String largest  = "";
		
		smallest = s.substring(0,k);
		largest = s.substring(0,k);
		
			for(int i = 0; i<=s.length()-k; i++) {
				String updatedString = s.substring(i,k+i);
				if(smallest.compareTo(updatedString)>0) {
					smallest = updatedString;
				}
				if(largest.compareTo(updatedString)<0) {
					largest = updatedString;
				}
			}
			return smallest + "\n" + largest;	
		
	}
	
	//Driver Method
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.next();
		System.out.println("Enter the String size");
		int k = sc.nextInt();
		
		sc.close();
		System.out.println(getSmallestAndLargest(s,k));
		
	}
}
