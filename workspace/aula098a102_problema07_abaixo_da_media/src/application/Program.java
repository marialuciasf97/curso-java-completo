package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many elements will the array have? ");
		int size = scan.nextInt();
		
		double[] realNumbers = new double[size];
		
		for (int i = 0; i < realNumbers.length; i++) {
			System.out.print("Enter a number: ");
			realNumbers[i] = scan.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < realNumbers.length; i++) {
			sum += realNumbers[i];
		}
		
		double average = sum / realNumbers.length;
		System.out.printf("%nARRAY AVERAGE = %.3f%n", average);
		
		System.out.println("BELOW AVERAGE ELEMENTS:");
		for (int i = 0; i < realNumbers.length; i++) {
			if (realNumbers[i] < average) {
				System.out.printf("%.1f%n", realNumbers[i]);
			}
		}
		
		scan.close();
	}
}
