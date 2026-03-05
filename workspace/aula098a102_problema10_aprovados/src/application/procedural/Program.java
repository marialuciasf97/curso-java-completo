package application.procedural;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PASSING_GRADE = 6.0;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many students will be entered? ");
		int numStudent = scan.nextInt();
		
		String[] students = new String[numStudent];
		double[] firstSemesterGrades = new double[numStudent];
		double[] secondSemesterGrades = new double[numStudent];
		
		for (int i = 0; i < numStudent; i++) {
			scan.nextLine(); // clear buffer
			
			System.out.printf("Enter data for student #%d:%n", (i+1));
			System.out.print("Name: ");
			students[i] = scan.nextLine();
			
			System.out.print("Grade1: ");
			firstSemesterGrades[i] = scan.nextDouble();
			
			System.out.print("Grade2: ");
			secondSemesterGrades[i] = scan.nextDouble();
		}
		
		System.out.println("Passing Students:");
		for (int i = 0; i < numStudent; i++) {
			
			double average = (firstSemesterGrades[i] + secondSemesterGrades[i]) / 2.0;
			
			if (average >= PASSING_GRADE) {
				System.out.println(students[i]);
			}
		}
		
		scan.close();
	}
}
