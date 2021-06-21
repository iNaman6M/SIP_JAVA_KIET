
import java.lang.*;
public class EvenOdd {
	
		public static boolean isEvenOdd(int n) {
			if(n%2==0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void main(String []args) {
			int number = 23;
			boolean isCheck = false;
			
			isCheck = isEvenOdd(number);
			if(!isCheck) {
				System.out.println("Odd");
			}
			else {
				System.out.println("Even");
			}
	  }	
	}
