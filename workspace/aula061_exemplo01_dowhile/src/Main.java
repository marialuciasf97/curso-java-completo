import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double fahrenheit = 0.0;
		char opcao = 's';
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = scan.nextDouble();
			
			fahrenheit = ((9 * celsius) / 5) + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			
			System.out.print("Deseja repetir (s/n)? ");
			opcao = scan.next().charAt(0);
			
		} while (opcao == 's');
		
		scan.close();
	}
}
