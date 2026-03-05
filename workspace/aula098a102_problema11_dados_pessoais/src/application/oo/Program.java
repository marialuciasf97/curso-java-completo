package application.oo;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import util.PersonStatistics;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int numPeople = scan.nextInt();
		
		Person[] people = new Person[numPeople];
		
		for ( int i = 0; i < numPeople; i++) {
			System.out.printf("Enter data for person #%d:%n", (i+1));
			System.out.print("Height: ");
			double height = scan.nextDouble();
			
			System.out.print("Gender: ");
			char gender = scan.next().charAt(0);
			
			people[i] = new Person(height, gender);
		}
		
		System.out.printf("Smallest height = %.2f%n", PersonStatistics.getMinHeight(people));
		System.out.printf("Largest height = %.2f%n", PersonStatistics.getMaxHeight(people));
		System.out.printf("Average height of women = %.2f%n", PersonStatistics.getAverageHeightOfWomen(people));
		System.out.printf("Number of men = %d%n", PersonStatistics.getNumberOfMen(people));
		
		scan.close();
		
	}
}
