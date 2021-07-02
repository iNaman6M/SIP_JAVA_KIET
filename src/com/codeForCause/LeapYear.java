package com.codeForCause;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String []args) {
		System.out.println("Leap year Program : ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		
		System.out.println(checkLeapYear(year));
		
	}
	
	static boolean checkLeapYear(int year) {
		if(year % 4 == 0) {
			return true;
		}
		return false;
	}
}
