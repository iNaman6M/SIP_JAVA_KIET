//22 june 2021
//Java Program to Swap Two Numbers
// Basic -gfg 

public class SwapTwoNumber {
	
	static void swapTwoNumber(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
		
		System.out.println("The value of p is\n :" +p +"The value of q is :"+q);
		
	}
	
	public static void main(String []args) {
		int m = 4;
		int n = 2;
		
		swapTwoNumber(m,n);
	}
	
}
