import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int mask = 32; // Em binário 00100000
		
		System.out.println("Digite um número inteiro: ");
		numero = scan.nextInt();
		
		if ((numero & mask) != 0)  {
			System.out.println("O sexto bit é verdadeiro");
		} else {
			System.out.println("O sexto bit é falso");
		}
		
		scan.close();
	}
}
