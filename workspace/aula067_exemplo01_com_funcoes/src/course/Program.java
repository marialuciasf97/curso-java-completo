package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0;
		
		System.out.print("Digite um valor inteiro: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite um valor inteiro: ");
		num2 = scan.nextInt();
		
		System.out.print("Digite um valor inteiro: ");
		num3 = scan.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		scan.close();
	}
	
	public static int max(int x, int y, int z) {
		int higher = 0;
		
		if (x > y && x > z) {
			higher = x;
		} else if (y > z) {
			higher = y;
		} else {
			higher = z;
		}
		
		return higher;
	}
	
	public static void showResult(int higher) {
		System.out.println("Higher = " + higher);
	}
	
}
