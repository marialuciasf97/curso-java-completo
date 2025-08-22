import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double renda;
		
		nome = sc.next();
		idade = sc.nextInt();
		renda = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(renda);
		
		sc.close();
		
	}
}
