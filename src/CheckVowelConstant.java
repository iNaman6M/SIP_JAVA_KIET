

// java program to check whether input
// character is a vowel or consonant

import java.lang.*;

public class CheckVowelConstant {
	
	static void checkVowelConstant(char z) {
		if(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is a constant");
		}
	}
	
	public static void main(String []args) {
		checkVowelConstant('c');
	}
}
