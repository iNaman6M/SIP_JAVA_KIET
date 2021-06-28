package LeetCode;

import java.util.Scanner;

class LogicLengthOfLW{
public int lengthOfLastWord(String s) {
        
        /*
        Traverse the s
        
        */
        String[] parts = s.split(" ");
        String lastWord = parts[parts.length - 1];
        System.out.println(lastWord.length());
        
        return lastWord.length();
    }
}

public class LengthOFLastWord {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String s = sc.next();
		
		LogicLengthOfLW lw = new LogicLengthOfLW();
		lw.lengthOfLastWord(s);
		
	}

}
