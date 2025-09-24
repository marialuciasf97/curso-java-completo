import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroA, numeroB;
		
		System.out.println("Digite um número inteiro A:");
		numeroA = sc.nextInt();
		
		System.out.println("Digite um número inteiro B:");
		numeroB = sc.nextInt();
		
		if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}
		
		sc.close();
		
	}
}
