import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // força uso do ponto como separador decimal
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n", x);
		
		sc.close();
		
	}
}
