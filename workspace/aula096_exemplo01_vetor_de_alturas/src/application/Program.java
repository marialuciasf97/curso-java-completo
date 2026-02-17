package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter a value N for the size of the vector: ");
		int size = scan.nextInt();
		
		double[] heightVector = new double[size];
		
		for (int i = 0; i < size; i++) {
		    System.out.print("Enter a height: ");
		    heightVector[i] = scan.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < size; i++) {
		    sum += heightVector[i];
		}

		double mediaHeight = sum / size;
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", mediaHeight);
		
		scan.close();
	}
}
