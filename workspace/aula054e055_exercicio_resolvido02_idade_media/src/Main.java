import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade = 0, quantIdade = 0, soma = 0;
		double idademedia = 0;
		
		System.out.print("Digite a idade do individuo: ");
		idade = scan.nextInt();
		
		if (idade < 0) {
			System.out.println("Impossível Calcular");
		} else {
			
			while(idade >= 0) {
				soma += idade;
				quantIdade++;
				
				System.out.print("Digite a idade do outro individuo: ");
				idade = scan.nextInt();
			}
			
			idademedia = soma / quantIdade;
			System.out.printf("Idade Média: %.2f%n", idademedia);
		}
		
		scan.close();
	}
}
