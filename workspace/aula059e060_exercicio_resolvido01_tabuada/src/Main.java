import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = 0;
		
        System.out.print("Digite um número inteiro (2 < N < 1000): ");
		N = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + N + " = " + (i * N) );
		}
		
		scan.close();
	}
}
