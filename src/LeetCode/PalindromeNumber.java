//LeetCode : 9 "Palindrome Number

package LeetCode;

import java.lang.*;
import java.util.Scanner;


class Logic {
	public boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}
		
		int rev = 0;
		int temp = x;
		
		while( temp != 0) {
		int lastDigit = temp % 10;
		rev = rev * 10 + lastDigit;
		temp /= 10;
		}
		
		if(rev == x) {
			return true;
		}
		return false;
	}
}
public class PalindromeNumber {
	
	//Driver method
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int x = sc.nextInt();
		
	 Logic lg = new Logic();
	System.out.println(lg.isPalindrome(x));
	}
}
