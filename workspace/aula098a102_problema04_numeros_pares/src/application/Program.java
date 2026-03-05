package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int nNumber = scan.nextInt();
		
		int[] integers = new int[nNumber];
		
		for (int i = 0; i < integers.length; i++) {
			System.out.print("Enter an integer: ");
			integers[i] = scan.nextInt();
		}
		
		int countEvenNumber = 0;
		System.out.println("EVEN NUMBERS:");
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				System.out.print(integers[i] + "  ");
				countEvenNumber++;
			}
		}
		
		System.out.println();
		System.out.println("NUMBER OF EVEN NUMBERS = " + countEvenNumber);
		
		scan.close();
	}
}
