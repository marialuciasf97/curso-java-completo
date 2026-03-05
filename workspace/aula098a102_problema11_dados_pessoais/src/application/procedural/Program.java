package application.procedural;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int numPeople = scan.nextInt();
		
		double[] heights = new double[numPeople];
		char[] genders = new char[numPeople];
		
		for (int i = 0; i < numPeople; i++) {
			System.out.println("Enter the data for person #" + (i+1) + ": ");
			System.out.print("Height: ");
			heights[i] = scan.nextDouble();
			
			System.out.print("Gender: ");
			genders[i] = scan.next().charAt(0);			
		}
		
		double minHeight = heights[0];
		double maxHeight = heights[0];
		for (int i = 1; i < numPeople; i++) {
			if (minHeight > heights[i]) {
				minHeight = heights[i];
			}
			if (maxHeight < heights[i]) {
				maxHeight = heights[i];
			}
		}
		
		int countWomen = 0;
		double sumWomemHeight = 0.0;
		for (int i = 0; i < numPeople; i ++) {
			if (genders[i] == 'F' || genders[i] == 'f' ) {
				countWomen++;
				sumWomemHeight += heights[i];
			}
		}
		
		double averageWomanHeight = 0.0;
		if (countWomen != 0) {
			averageWomanHeight = sumWomemHeight / countWomen;
		}
		int numMen = numPeople - countWomen;
		
		System.out.printf("Smallest height = %.2f%n", minHeight);
		System.out.printf("Largest height = %.2f%n", maxHeight);
		System.out.printf("Average height of women = %.2f%n", averageWomanHeight);
		System.out.printf("Number of men = %d%n", numMen);
		
		scan.close();
	}
}
