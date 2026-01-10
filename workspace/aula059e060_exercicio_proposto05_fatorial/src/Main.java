import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = 0;
		int fatorial = 1;

		System.out.print("Digite um número inteiro positivo e ache seu fatorial: ");
		N = scan.nextInt();

		for (int i = N; i >= 2; i--) {
			fatorial *= i;
		}

		System.out.println("Fatorial de " + N + " = " + fatorial);

		scan.close();
	}
}
