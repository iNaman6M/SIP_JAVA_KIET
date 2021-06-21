//22 june 2021
//program  to read input from console in Java
//basic -gfg

import java.util.Scanner;
import java.lang.*;

public class ReadInputFromConsole {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
			
			int s = sc.nextInt();
			System.out.println("The entered String is : "+s);
			sc.close();
	}
	
}
