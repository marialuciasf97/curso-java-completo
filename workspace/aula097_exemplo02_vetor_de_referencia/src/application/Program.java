package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int productCount = scan.nextInt();
		
		Product[] products = new Product[productCount];
		
		for (int i = 0; i < products.length; i++) {
			scan.nextLine(); // clear buffer
			
			System.out.println("Product #" + (i+1) + " data: ");
			System.out.print("Name: ");
			String name = scan.nextLine();

			System.out.print("Price: ");
			double price = scan.nextDouble();

			products[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].getPrice();
		}
		
		double averagePrice = sum / products.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", averagePrice);

		scan.close();
	}
}
