//22 june 2021
// Java program to find GCD of two 
// numbers using Euclidean algorithm

import java.lang.*;
public class GCD {
	
	public static int gcd(int x,int y) {
		if(y==0) {
			return x;
		}
		return gcd(y,x%y);
	}
	
	//Driver method
	public static void main(String []args) {
		int x = 36, y = 60;
		System.out.println("The GCD of "+x+"and"+y+"is"+gcd(x,y));
	}
}
