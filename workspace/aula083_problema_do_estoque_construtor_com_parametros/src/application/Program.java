package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Price: ");
		double price = scan.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.print("Produtc data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int number = scan.nextInt();
		
		product.addProducts(number);
		
		System.out.print("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		number = scan.nextInt();
		
		product.removeProducts(number);
		
		System.out.print("Updated data: " + product);
		System.out.println();
		
		scan.close();
	}
}
