package application.procedural;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	private static final int MINOR_AGE = 16;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int nPeople = scan.nextInt();
		
		if (nPeople <= 0) {
			System.out.println("No data to process.");
			scan.close();
			return;
		}
		
		String[] names = new String[nPeople];
		int[] ages = new int[nPeople];
		double[] heights = new double[nPeople];
		
		for (int i = 0; i < nPeople; i++) {
			scan.nextLine(); // clear buffer
			System.out.println("Enter data for person #" + (i+1) + ": ");
			System.out.print("Name: ");
			names[i] = scan.nextLine();
			
			System.out.print("Age: ");
			ages[i] = scan.nextInt();
			
			System.out.print("Height: ");
			heights[i] = scan.nextDouble();
		}
		
		// Calculate average height
		double sumHeight = 0.0;
		for (int i = 0; i < nPeople; i++) {
			sumHeight += heights[i];
		}
		double averageHeight = sumHeight / nPeople;
		
		// Calculate percentage of people under Age
		int countUnderAge = 0;
		for (int i = 0; i < nPeople; i++) {
			if (ages[i] < MINOR_AGE) {
				countUnderAge++;
			}
		}
		double percentageUnderAge = ((double) countUnderAge / nPeople) * 100;
		
		System.out.printf("Average Height: %.2f%n", averageHeight);
		System.out.printf("People under %d years old: %.2f%%%n", MINOR_AGE, percentageUnderAge);
		for (int i = 0; i < nPeople; i++) {
			if (ages[i] < MINOR_AGE) {
				System.out.println(names[i]);
			}
		}
		
		scan.close();
	}
}
