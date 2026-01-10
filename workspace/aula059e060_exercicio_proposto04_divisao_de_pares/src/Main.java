import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int N = 0;
		
		System.out.print("Digite N divisões que pretende realizar: ");
		N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.print("Digite o valor do númerador: ");
			double numerador = scan.nextDouble();
			
			System.out.print("Digite o valor do denominador: ");
			double denominador = scan.nextDouble();
			
			if (denominador == 0) {
				System.out.println("Divisão Impossível!\n");
			} else {
				double divisao = numerador / denominador;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		scan.close();
	}
}
