package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle wigth and height: ");
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		
		rectangle.area();
		rectangle.perimeter();
		rectangle.diagonal();
		
		System.out.println(rectangle);
		
		scan.close();
	}
}
