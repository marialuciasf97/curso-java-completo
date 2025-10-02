import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, desconto;
		
		System.out.println("Digite o preço do produto");
		preco = sc.nextDouble();
		
		desconto = (preco <= 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto: " + desconto);
		
		sc.close();
		
	}
}
