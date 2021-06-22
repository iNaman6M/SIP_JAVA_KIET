//22 June 2021
// Java program to find a leap year

import java.lang.*;
import java.io.*;

public class LeapYear {
	
	static void checkLeapYear(int year) {
		
		boolean isLeapY = false;
		
		if(year % 4 == 0) {
			isLeapY =  true;
		}
		else {
			isLeapY = false;
		}
		
		if(!isLeapY) {
			System.out.println("Not a Leap Year");
		}
		else {
			System.out.println("Leap Year");
		}
	}
	
	public static void main(String []args) {
		checkLeapYear(2000);
	}
}
