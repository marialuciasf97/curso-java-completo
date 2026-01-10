import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int X = 0;
		
		System.out.print("Digite o valor de X, onde (1 <= X <= 100): ");
		X = scan.nextInt();
		
		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}
}
