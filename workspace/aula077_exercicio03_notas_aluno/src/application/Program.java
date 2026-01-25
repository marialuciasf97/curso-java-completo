package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Enter the student's name: ");
		student.name = scan.nextLine();
		
		System.out.println("Enter the student's grades: ");
		student.grade1 = scan.nextDouble();
		student.grade2 = scan.nextDouble();
		student.grade3 = scan.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if (student.finalGrade() >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		
		scan.close();
	}
}
