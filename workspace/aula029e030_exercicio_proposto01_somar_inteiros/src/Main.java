import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, soma;
		
		System.out.println("Digite o primeiro número inteiro: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro");
		numero2 = sc.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
	}
}
