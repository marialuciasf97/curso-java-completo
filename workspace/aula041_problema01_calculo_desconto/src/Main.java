import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto:");
		double preco = sc.nextDouble();

		double taxaDesconto; // apenas declarando
		
		// Esse if/else garantira a inicializacao de taxaDesconto
		if (preco < 200.0) {
			taxaDesconto = 0.10;
		} else {
			taxaDesconto = 0.0;
		}
		
		double desconto = taxaDesconto * preco;
		double precoFinal = preco - desconto;
		
		System.out.println("Desconto Aplicado: " + desconto);
		System.out.println("Preço Final: " + precoFinal);
		
		sc.close();
		
	}
}
