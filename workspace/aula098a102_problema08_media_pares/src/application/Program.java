package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many elements will the array have? ");
		int size = scan.nextInt();
		
		int[] integers = new int[size];
		
		for (int i = 0; i < integers.length; i++) {
			System.out.print("Enter an integer: ");
			integers[i] = scan.nextInt();
		}
		
		double sum = 0.0;
		int countEven = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				sum += integers[i];
				countEven++;
			}
		}
		
		if (countEven == 0) {
			System.out.println("NO EVEN NUMBERS");
		} else {
			double average = sum / countEven;
			System.out.printf("AVERAGE OF EVEN NUMBERS = %.1f%n", average);
		}
	}
}
