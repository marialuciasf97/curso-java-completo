package util;

import entities.Student;

public class StudentUtils {
	
	public static Student[] getApprovedStudents(Student[] students, double minimumGrade) {
		
		int count = countApprovedStudents(students, minimumGrade);
		Student[] approvedStudents = new Student[count];
		
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (isApproved(students[i], minimumGrade)) {
				approvedStudents[index] = students[i];
				index++;
			}
		}
		return approvedStudents;
	}
	
	private static int countApprovedStudents(Student[] students, double minimumGrade) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (isApproved(students[i], minimumGrade)) {
				count++;
			}
		}
		return count;
	}
	
	private static boolean isApproved(Student student, double minimumGrade) {
		return student.getAverage() >= minimumGrade;
	}
}
