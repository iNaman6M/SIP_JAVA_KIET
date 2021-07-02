package com.codeForCause;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String []args) {
		System.out.println("Prime number Program : ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		primeNumber(n);
}
	
	public static void primeNumber(int n) {
		if(n == 0 || n == 1 ) {
			System.out.println("Not Prime");
			return;
		}
		for(int i = 2; i< n; i++) {
			if(n % i == 0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
	}
}