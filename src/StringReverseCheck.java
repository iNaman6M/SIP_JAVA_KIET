//Given a string , print Yes if it is a palindrome, print No otherwise.
import java.util.*;
import java.lang.*;
import java.io.*;

public class StringReverseCheck {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String A = sc.next();
		
		boolean Check = A.equals(new StringBuilder(A).reverse().toString());
		
		System.out.println(Check ? "Yes": "No");
	}
}
