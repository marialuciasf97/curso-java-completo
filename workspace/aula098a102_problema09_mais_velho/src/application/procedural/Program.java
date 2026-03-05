package application.procedural;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people will you enter? ");
		int numPeople = scan.nextInt();
		
		String[] names = new String[numPeople];
		int[] ages = new int[numPeople];
		
		for (int i = 0; i < numPeople; i++) {
			scan.nextLine();
			
			System.out.printf("Enter person #%d data:%n", (i+1));
			System.out.print("Name: ");
			names[i] = scan.nextLine();
			
			System.out.print("Age: ");
			ages[i] = scan.nextInt();
		}
		
		int maxAge = 0;
		int indexMaxage = 0;
		for (int i = 0; i < ages.length; i++) {
			if (maxAge < ages[i]) {
				maxAge = ages[i];
				indexMaxage = i;
			}
		}
		
		System.out.printf("OLDEST PERSON: %s", names[indexMaxage]);
		
		scan.close();
	}
}
