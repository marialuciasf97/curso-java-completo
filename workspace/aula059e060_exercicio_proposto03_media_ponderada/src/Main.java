import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int N = 0;
		double media = 0.0;
		
		// Obs: estes valores são constantes lógicas;
		// Ao avançar mais o curso, o ideal é declará-los como 'final' e em letras maiúsculas.
		int pesoValor1 = 2;
		int pesoValor2 = 3;
		int pesoValor3 = 5;
				
		System.out.print("Digite a quantidade de casos de teste: ");
		N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.print("Digite o " + i + "ª valor: ");
			double valor1 = scan.nextDouble();
			
			System.out.print("Digite o " + (i+1) + "ª valor: ");
			double valor2 = scan.nextDouble();
			
			System.out.print("Digite o " + (i+2) + "º valor: ");
			double valor3 = scan.nextDouble();
			
			media = (valor1 * pesoValor1 + valor2 * pesoValor2 + valor3 * pesoValor3)
					/ (pesoValor1 + pesoValor2 + pesoValor3);
			
			System.out.printf("Média Ponderada: %.1f%n", media);
			}
		
		scan.close();
	}
}
