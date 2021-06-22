//22 June 2021
// Java program to find all the
// prime numbers from 1 to N

import java.lang.*;

public class PrimeNumber {
	
	public static void primeN(int n) {
		
		//printing the prime statement
		int x,y,flag;
		
		System.out.println("THe prime number between 1 and "+n+" are : ");
		
		//Loop 1 for entering between 1 and n
		for(x = 1; x <= n; x++) {
			
			//check for if it starts from 1 or 0 
			if(x==1 || x==0) {
				continue;
			}
			
			//put flag 1 means ready tok dive above 1 and 0
			flag = 1;
			
			//Entering in second loop to check the number value upto n
			for(y = 2; y <= x/2 ; ++y) {
				
				//prime check 
				if(x%y==0) {
					//if divide by 0 complete than break 
					flag = 0;
					break;
				}
			
			}
				//prime only when flag = 1
				if(flag == 1) {
					System.out.print(x + " ");
				}
		}
	}
		
		//Driver Method
		
		public static void main(String []args) {
				
			int n = 20;
			primeN(n);
			
		}
}