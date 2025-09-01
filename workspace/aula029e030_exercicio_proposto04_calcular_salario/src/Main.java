import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		
		System.out.println("Insira o número do Funcionário:");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Insira o número de horas trabalhadas:");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Insira o valor que recebe por hora trabalhada:");
		valorPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
	}
}
