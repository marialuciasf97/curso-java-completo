package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BoardingHouse;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		BoardingHouse boardingHouse = new BoardingHouse();
		
		System.out.print("How many rooms will be rented? ");
		int numberOfRents = scan.nextInt();
		
		for (int i = 0; i < numberOfRents; i++) {
			scan.nextLine(); // clear buffer
			
			System.out.printf("Enter rental details #%d:%n", (i+1));
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Email: ");
			String email = scan.next();
			
			Student student = new Student(name, email);
			
			System.out.print("Room number (0 to 9): ");
			int number = scan.nextInt();
			
			while (!boardingHouse.rentRoom(number, student)) {
				System.out.print("Room already occupied. Choose another: ");
				number = scan.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < BoardingHouse.getQuantityRoom(); i++) {
			if (boardingHouse.getRooms()[i].isOccupied()) {
				System.out.println(boardingHouse.getRooms()[i].getNumber()
						+ ": "
						+ boardingHouse.getRooms()[i].getOccupant());
			}
		}
		
		scan.close();
	}
}
