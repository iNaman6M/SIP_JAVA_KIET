
import java.util.Arrays;
import java.util.Scanner;

public class AverageMarks {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Students");
		int totalStudents = sc.nextInt();
		
		System.out.println("Enter the Marks of the students");
		int marks[] = new int[totalStudents];
		
			for(int i = 0; i<totalStudents; i++) {
				marks[i]= sc.nextInt();
			}
			
			int averageMarks = 0;
			for(int i = 0; i<totalStudents; i++) {
				averageMarks += marks[i];
			}
			
			averageMarks /= totalStudents;
		System.out.println("The Average marks of the student is : "+averageMarks);
	}
}
