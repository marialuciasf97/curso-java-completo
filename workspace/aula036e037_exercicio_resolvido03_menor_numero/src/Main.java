import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, menor;
		
		System.out.println("Digite o primeiro número inteiro:");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro:");
		num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número inteiro:");
		num3 = sc.nextInt();
		
		if (num1 <= num2 && num1 <= num3) {
			menor = num1;
		} else if (num2 <= num3) {
			menor = num2;
		} else {
			menor = num3;
		}
		
		System.out.println("MENOR = " + menor);
		
		sc.close();
		
	}
}
