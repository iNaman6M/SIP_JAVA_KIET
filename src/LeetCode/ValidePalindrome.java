package LeetCode;

import java.lang.*;
import java.util.Scanner;

class LogicValidPalindrome{
	 public boolean isPalindrome(String s) {
	        
	        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
	        System.out.println(s);
	        String str = s.replaceAll("\\s","");
	        
	        boolean check = str.equals(new StringBuilder(str).reverse().toString());
	        
	        if(check){
	            return true;
	        }
	        return false;
	    }
}

public class ValidePalindrome {
	
	
	//Driver method
		public static void main(String []args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the String : ");
			String s = sc.next();
			
			LogicValidPalindrome lvp = new LogicValidPalindrome();
			System.out.println(lvp.isPalindrome(s));
		}
}
