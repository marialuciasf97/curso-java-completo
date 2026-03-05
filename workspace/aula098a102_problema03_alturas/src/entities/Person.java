package entities;

public class Person {

	private static final int MINOR_AGE = 16;
	
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public boolean isUnderAge() {
		return age < MINOR_AGE;
	}
	
	public static int getMinAge() {
		return MINOR_AGE;
	}
	
}
