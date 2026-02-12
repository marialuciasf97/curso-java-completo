package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Price: ");
		double price = scan.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();
		
		Product productWithStock = new Product(name, price, quantity);
		
		System.out.print("Product data: " + productWithStock);
		System.out.println();
		
		// We cannot modify attribute values ​​by accessing them directly.
		// But we can using setters.
		// No setter methods were created for "Quantity".
		
		productWithStock.setName("Computer");
		productWithStock.setPrice(2000.00);
		
		System.out.println();
		System.out.println("Updated data: " + productWithStock);
		System.out.println();
		
		// If you just want to check the name, price, or quantity in stock:
		// Use the Getters methods:
		
		System.out.println(productWithStock.getName());
		System.out.println(productWithStock.getPrice());
		System.out.println(productWithStock.getQuantity());
		
		scan.close();
	}
}
