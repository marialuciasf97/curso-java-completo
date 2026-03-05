package application.procedural;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("How many values will each array have? ");
		int size = scan.nextInt();

		double[] vectorA = new double[size];
		double[] vectorB = new double[size];
		double[] vectorC = new double[size];

		System.out.println("Enter the values of array A:");
		for (int i = 0; i < vectorA.length; i++) {
			System.out.printf("element #%d: ", (i + 1));
			vectorA[i] = scan.nextDouble();
		}

		System.out.println("Enter the values of array B:");
		for (int i = 0; i < vectorB.length; i++) {
			System.out.printf("element #%d: ", (i + 1));
			vectorB[i] = scan.nextDouble();
		}

		System.out.println("RESULTING ARRAY: ");
		for (int i = 0; i < vectorC.length; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
			System.out.println(vectorC[i]);
		}

		scan.close();
	}
}