package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter: ");
		int nNumbers = scan.nextInt();
		
		double[] numbers = new double[nNumbers];
		
		for (int i = 0; i < nNumbers; i++) {
			System.out.print("Enter number #" + (i + 1) + ": ");
			numbers[i] = scan.nextDouble();
		}
		
		double sum = 0.0;
		System.out.print("VALUES = ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
			sum += numbers[i];
		}
		
		double average = sum / numbers.length;
		
		System.out.printf("%nSUM = %.2f%n", sum);
		System.out.printf("AVERAGE = %.2f%n", average);
		
		scan.close();
	}
}
