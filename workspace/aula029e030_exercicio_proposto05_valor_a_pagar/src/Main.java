import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, quantidadePecas1, quantidadePecas2;
		double valorPeca1, valorPeca2, valorAPagar;
		
		System.out.println("Insira o código, quantidade e o valor unitário da peça 1:");
		codigoPeca1 = sc.nextInt();
		quantidadePecas1 = sc.nextInt();		
		valorPeca1 = sc.nextDouble();

		System.out.println("Insira o código, quantidade e o valor unitário da peça 2:");
		codigoPeca2 = sc.nextInt();
		quantidadePecas2 = sc.nextInt();		
		valorPeca2 = sc.nextDouble();
		
		valorAPagar = (quantidadePecas1 * valorPeca1) + (quantidadePecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();
		
	}
}
