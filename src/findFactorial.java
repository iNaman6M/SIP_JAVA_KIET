
// Java program to find factorial of given number

import java.lang.*;
public class findFactorial {
	
	
	static int factorial(int n) {
		
//		Using Recursive Method
		if(n == 0) {
			return 1;
		}
		return n*factorial(n-1);
		
		//Using Iterative Method
	//		int fact = 1;
	//		for(int i = 2; i<=n; i++) {
	//			fact *= i;
	//		}
	//		return fact;
	//	}
	}	
	
	
	//Driver Method
	public static void main(String []args) {
		int n = 5;
		System.out.println("The Factorial of "+n+" is"+factorial(n));
	}
	
	
	
}
