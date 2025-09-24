import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco, total;
		
		System.out.println("Digite o código do item:");
		codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade do produto:");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4.00;
		} else if (codigo == 2) {
			preco = 4.50;
		} else if (codigo == 3) {
			preco = 5.00;
		} else if (codigo == 4) {
			preco = 2.00;
		} else if (codigo == 5) {
			preco = 1.50;
		} else {
			preco = 0;
		}
		
		total = preco * quantidade;
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
		
	}
}
