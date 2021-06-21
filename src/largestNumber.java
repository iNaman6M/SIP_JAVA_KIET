//22 June 2021
//Java Program to Find the Largest of three Numbers
// Basic - GFG

import java.lang.*;

public class largestNumber {
		
	public static int largest(int x , int y , int z) {
		if(x>=y && x>=z) {
			return x;
		}
		else if (y>=z && y>=x) {
				return y;		
		}
		else {
			return z;
		}
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int largestNum = largest(a,b,c);
		
		System.out.println("Largest Number is : "+largestNum);
		
	}
}
