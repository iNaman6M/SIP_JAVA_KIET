//22 June 2021
//Java Program to Add two Complex Numbers
//Basic - GFG

//Algorithm : 
//inititate Variable real and imaginary
//construct constructor 
//define the fucntion two show real number
//define function to add complex number
//Driver class 

import java.lang.*;

public class ComplexNumber {
	//creating variable for real number
	int real;
	int imag;
	
	//Constructor
	ComplexNumber(int r, int i){
		this.real = r;
		this.imag = i;
	}
	
	//function for printing the format of real numbers
	public void showComplexNumber() {
		System.out.println(this.real+"+i"+this.imag);
	}
	
	//Addition of two complex numbers
	public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2) {
		
		ComplexNumber cn = new ComplexNumber(0,0);
		cn.real = n1.real + n2.real;
		cn.imag = n1.imag + n2.imag;
		
		return cn;
	}
	
	//Driver class
	public static void main(String []args) {
		//creating two complex number object
		
		ComplexNumber cn1 = new ComplexNumber(3,6);
		ComplexNumber cn2 = new ComplexNumber(8,1);
		
		//printing Complex Number
		System.out.println("First Complex Number is : ");
		cn1.showComplexNumber();
		System.out.println("Second Complex Number is : ");
		cn2.showComplexNumber();
		
		//adding of two Complex number
		ComplexNumber cn = add(cn1,cn2);
		
		System.out.println("Addition : ");
		cn.showComplexNumber();
	}
}
