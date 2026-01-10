import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = 0;
		
		System.out.print("Digite um número inteiro positivo, e descubra seus divisores positivos: ");
		N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}
}
