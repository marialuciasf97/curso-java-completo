import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int senhaValida = 2002, senha = 0;
		
		System.out.print("Digite a senha: ");
		senha = scan.nextInt();
		
		while (senha != senhaValida) {
			System.out.println("Senha Invalida\n");
			
			System.out.print("Digite a senha: ");
			senha = scan.nextInt();
		}
		
		System.out.println("Aceso Permitido");
		
		scan.close();
	}
}
