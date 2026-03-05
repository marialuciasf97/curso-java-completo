package application.oo;

import java.util.Locale;
import java.util.Scanner;

import entities.Vector;
import util.VectorOperations;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("How many values will each vector have? ");
		int size = scan.nextInt();

		Vector vectorA = new Vector(size);
		Vector vectorB = new Vector(size);

		System.out.println("Insert the elements of vector A:");
		for (int i = 0; i < vectorA.getSize(); i++) {
			System.out.print("Enter an value: ");
			double value = scan.nextDouble();
			vectorA.insertElement(i, value);
		}

		System.out.println("Insert the elements of vector B:");
		for (int i = 0; i < vectorB.getSize(); i++) {
			System.out.print("Enter an value: ");
			double value = scan.nextDouble();
			vectorB.insertElement(i, value);
		}

		Vector vectorC = VectorOperations.sumVectors(vectorA, vectorB);
		System.out.println("RESULTANT VECTOR:");
		System.out.println(vectorC);

		scan.close();
	}
}
