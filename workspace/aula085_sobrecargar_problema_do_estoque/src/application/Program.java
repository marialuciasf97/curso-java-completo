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

        // Construtor completo (3 parâmetros)
        Product productWithQuantity = new Product(name, price, quantity);

        // Construtor sobrecarregado (2 parâmetros)
        Product productWithoutQuantity = new Product(name, price);

        System.out.println();
        System.out.println("Product created with quantity:");
        System.out.println(productWithQuantity);

        System.out.println();
        System.out.println("Product created without quantity (initial stock = 0):");
        System.out.println(productWithoutQuantity);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int number = scan.nextInt();
        productWithoutQuantity.addProducts(number);

        System.out.println("Updated data: " + productWithoutQuantity);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        number = scan.nextInt();
        productWithoutQuantity.removeProducts(number);

        System.out.println("Updated data: " + productWithoutQuantity);

        scan.close();
    }
}
