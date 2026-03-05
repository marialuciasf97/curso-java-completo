package entities;

public class Student {

	private String name;
	private double firstSemesterGrade;
	private double secondSemesterGrade;
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getFirstSemesterGrade() {
		return firstSemesterGrade;
	}

	public void setFirstSemesterGrade(double firstSemesterGrade) {
		this.firstSemesterGrade = firstSemesterGrade;
	}

	public double getSecondSemesterGrade() {
		return secondSemesterGrade;
	}

	public void setSecondSemesterGrade(double secundSemesterGrade) {
		this.secondSemesterGrade = secundSemesterGrade;
	}
	
	public double getAverage() {
		return (firstSemesterGrade + secondSemesterGrade) / 2.0;
	}
		
}
