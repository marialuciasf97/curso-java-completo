import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x;
		int soma = 0;
		
		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		
		
		while(x != 0) {
			soma += x;
			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();
		}
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}