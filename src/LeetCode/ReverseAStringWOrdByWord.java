package LeetCode;

import java.util.Scanner;
class LogicRSBW {
	 public String reverseWords(String s) {
	        
	        //object creation
	        String result = new String();
	        int i = 0;
	        
	        //checking for spaces with leading and traiing heads
	        while(i<s.length()){
	            while(i<s.length() && s.charAt(i) == ' ')
	                i++;
	            if(i >= s.length()){
	                break;
	            }
	            int j = i+1;
	            while(j<s.length() && s.charAt(j) != ' ')
	                j++;
	            String str = s.substring(i,j);
	            
	            if(result.length() == 0){
	                result = str;
	            }
	            else {
	                result = str + " " +result;
	            }
	            i = j+1;
	            System.out.println(result);
	        }
	        return result;
	    }
}
public class ReverseAStringWOrdByWord {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String s = sc.next();
		
		LogicRSBW lrs = new LogicRSBW();
		lrs.reverseWords(s);
		
	}

}
