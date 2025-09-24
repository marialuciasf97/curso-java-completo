import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, impostoRenda = 0.0;
		
		System.out.println("Digite o salário:");
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			System.out.println("Isento");
		} else {
			if (salario <= 3000.0) {
				impostoRenda = (salario - 2000.0) * 0.08;
			} else if (salario <= 4500.0) {
				impostoRenda = ((salario - 3000.0) * 0.18) + (1000.0 * 0.08);
			} else {
				impostoRenda = ((salario - 4500.0) * 0.28) + (1500.0 * 0.18)
						+ (1000.0 * 0.08);
			}

			System.out.printf("R$ %.2f%n", impostoRenda);
		}
		
		sc.close();
		
	}
}
