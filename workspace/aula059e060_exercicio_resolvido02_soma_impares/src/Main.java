import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int X = 0, Y = 0, soma = 0;
		
		System.out.print("Digite o valor de X: ");
		X = scan.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		Y = scan.nextInt();
		
		// garante que x nunca será maior que y
		if (Y < X) {
			int aux = X;
			X = Y;
			Y = aux;
		} 
		
		for (int i = X+1; i < Y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		
		scan.close();
	}
}
