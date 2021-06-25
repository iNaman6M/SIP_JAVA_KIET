
//Java program to demonstrate Encapsulation

import java.lang.*;

public class Encapsulation {
	
	private String geekName;
	private int geekRoll;
	private int geekAge;
		
		//Getters
		public String getName() {
			return geekName;
		}
		public int getRoll() {
			return geekRoll;
		}
		public int getAge() {
			return geekAge;
		}
		
			//Setters
			public void setName(String name) {
				geekName = name;
			}
			public void setRoll(int roll) {
				geekRoll = roll;
			}
			public void setAge(int age) {
				geekAge = age;
			}
}

class MainClass {
	//Driver Method
	public static void main(String []args) {
		
		Encapsulation en = new Encapsulation();
		en.setName("Naman");
		en.setAge(24);
		en.setRoll(20);
		

        // Displaying values of the variables
        System.out.println("Geek's name: " + en.getName());
        System.out.println("Geek's age: " + en.getAge());
        System.out.println("Geek's roll: " + en.getRoll());
	}
}
