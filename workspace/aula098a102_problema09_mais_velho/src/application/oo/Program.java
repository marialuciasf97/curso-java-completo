package application.oo;

import java.util.Scanner;

import entities.Person;
import util.PersonArrayUtils;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people will you enter? ");
		int numPeople = scan.nextInt();
		
		Person[] people = new Person[numPeople];
		
		for (int i = 0; i < people.length; i++) {
			scan.nextLine(); // clear buffer
			
			System.out.printf("Enter person #%d data:%n", (i+1));
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Age: ");
			int age = scan.nextInt();
			
			people[i] = new Person(name, age);
		}
		
		Person oldestPerson = PersonArrayUtils.findOldest(people);
		
		if (oldestPerson == null) {
			System.out.println("No people entered.");
		} else {
			System.out.println("OLDEST PERSON: " + oldestPerson.getName());
		}
	
		scan.close();
	}
}
