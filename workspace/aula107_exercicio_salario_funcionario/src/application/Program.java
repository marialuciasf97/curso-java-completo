package application;

import java.util.Locale;
import java.util.Scanner;

import services.EmployeeService;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		EmployeeService service = new EmployeeService();
		
		System.out.println("How many employees will be registered? ");
		int quantity = scan.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ": ");
			System.out.print("Id: ");
			int id = scan.nextInt();
			
			while (service.findById(id) != null) {
				System.out.println("ID already exists, please enter a new ID.");
				System.out.print("Id: ");
				id = scan.nextInt();
			}
			
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			
			service.addEmployee(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncrease = scan.nextInt();
		System.out.print("Enter the percentage: ");
		double percentage = scan.nextDouble();
		if (!service.increaseSalary(idIncrease, percentage)) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : service.getEmployees()) {
			System.out.println(emp);
		}
		
		scan.close();
	}
}
