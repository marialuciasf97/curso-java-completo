package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int nNumber = scan.nextInt();
		
		double[] realNumbers = new double[nNumber];
		
		for (int i = 0; i < realNumbers.length; i++) {
			System.out.print("Enter a real number: ");
			realNumbers[i] = scan.nextDouble();
		}
		
		
		double maxNumber = 0.0;
		int indexMaxNumber = 0;
		
		for (int i = 0; i < realNumbers.length; i++) {
			if (realNumbers[i] > maxNumber) {
				maxNumber = realNumbers[i];
				indexMaxNumber = i;
			}
		}

		System.out.println();
		System.out.printf("HIGHEST VALUE = %.1f%n", maxNumber);
		System.out.printf("POSITION OF THE HIGHEST VALUE = %d%n", indexMaxNumber);
		
		scan.close();
	}
}
