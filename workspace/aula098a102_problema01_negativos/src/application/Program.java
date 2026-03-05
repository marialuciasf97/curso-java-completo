package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int nNumbers = scan.nextInt();
		
		int[] numbers = new int[nNumbers];
		
		for (int i = 0; i < nNumbers; i++) {
			System.out.print("Enter an integer: ");
			numbers[i] = scan.nextInt();
		}
		
		System.out.println("NEGATIVE NUMBERS: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		scan.close();
	}
}
