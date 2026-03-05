package application.oo;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import util.PersonArrayUtils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int nPeople = scan.nextInt();
		
		Person[] people = new Person[nPeople];
		
		for (int i = 0; i < people.length; i++) {
			scan.nextLine(); // clear buffer
			System.out.println("Enter data for person #" + (i+1) + ": ");
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Age: ");
			int age = scan.nextInt();
			
			System.out.print("Height: ");
			double height = scan.nextDouble();
		
			people[i] = new Person(name, age, height);
		}
		
		System.out.printf("Average Height: %.2f%n", PersonArrayUtils.calculateAverageHeight(people));
		System.out.printf("People under %d years old: %.2f%%%n", Person.getMinAge(),PersonArrayUtils.getPercentageUnderAge(people));
		
		String[] namesUnderAge = PersonArrayUtils.getNamesUnderAge(people);
		for (int i = 0; i < namesUnderAge.length; i++) {
			System.out.println(namesUnderAge[i]);
		}
		
		scan.close();
	}
}
