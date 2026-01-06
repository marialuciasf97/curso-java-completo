import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = 0, soma = 0;
		
		System.out.print("Digite o valor de N: ");
		N = scan.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um valor: ");
			int x = scan.nextInt();
			soma += x;
		}
		
		System.out.println("Soma = " + soma);
		
		scan.close();
	}
}
