package application.oo;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
import util.StudentUtils;

public class Program {

	public static final double MINIMUM_GRADE = 6.0;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int numStudent = scan.nextInt();
		
		Student[] students = new Student[numStudent];
		
		for (int i = 0; i < numStudent; i++) {
			
			scan.nextLine();
			
			System.out.printf("Enter data for student #%d:%n", (i+1));
			System.out.print("Name: ");
			students[i] = new Student(scan.nextLine());
			
			System.out.print("Grade1: ");
			students[i].setFirstSemesterGrade(scan.nextDouble());
			
			System.out.print("Grade2: ");
			students[i].setSecondSemesterGrade(scan.nextDouble());
			
		}
		
		Student[] approvedStudents = StudentUtils.getApprovedStudents(students, MINIMUM_GRADE);
		
		System.out.println("Approved Students: ");
		for (int i = 0; i < approvedStudents.length; i++) {
			System.out.println(approvedStudents[i].getName());
		}
		
		scan.close();
	}
}
