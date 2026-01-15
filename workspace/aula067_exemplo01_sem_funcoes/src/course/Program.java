package course;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		int higher = 0;
		
		System.out.print("Digite um valor inteiro: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite um valor inteiro: ");
		num2 = scan.nextInt();
		
		System.out.print("Digite um valor inteiro: ");
		num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			higher = num1;
		} else if (num2 > num3) {
			higher = num2;
		} else {
			higher = num3;
		}
		
		System.out.println("Higher = " + higher);
		
		scan.close();
	}
}
