//Leetcode problem 

//progrma to conver roman number to integer

package LeetCode;

import java.util.Scanner;

class LogicRomanToInteger{
	
	 public int romanToInt(String s) {
	        
	        //declaring array to store all roman vaues
		 //use switch case method to call the const value of roman numbers
	        
	        int nums[] = new int[s.length()];
	        
	            for(int i = 0; i<s.length(); i++){
	                switch(s.charAt(i)){
	                case 'M':
		                nums[i] = 1000;
		                break;
		            case 'D':
		                nums[i] = 500;
		                break;
		            case 'C':
		                nums[i] = 100;
		                break;
		            case 'L':
		                nums[i] = 50;
		                break;
		            case 'X' :
		                nums[i] = 10;
		                break;
		            case 'V':
		                nums[i] = 5;
		                break;
		            case 'I':
		                nums[i] = 1;
		                break;
	                }
	            }
	        int sum = 0;
	        for(int i=0; i<s.length()-1; i++){
	            if(nums[i] < nums[i+1]){
	                sum -= nums[i];
	            }
	            else
	            {
	                sum += nums[i];
	            }
	        }
	        return sum + nums[nums.length-1];
	    }
}
public class RomanToInteger {
	//Driver method
			public static void main(String []args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the ROman Number : ");
				String s = sc.next();
				
				LogicRomanToInteger lvp = new LogicRomanToInteger();
				System.out.println(lvp.romanToInt(s));
			}
	}
	
	
