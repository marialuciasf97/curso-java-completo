import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raioCirculo, areaCirculo, pi = 3.14159;
		
		System.out.println("Insira o raio do círculo:");
		raioCirculo = sc.nextDouble();
		
		areaCirculo = pi * Math.pow(raioCirculo, 2);
		
		System.out.printf("Área do círculo = %.4f%n", areaCirculo);
		
		sc.close();
		
	}
}
