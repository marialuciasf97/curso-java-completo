import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double planoBasico = 50.0;
		int minutoPlanoBasico = 100;
		double valorMinutoExcedido = 2.0;
		
		int minutoConsumido;
		double valorAPagar;
		
		System.out.println("Digite a quantidade de minutos consumidos:");
		minutoConsumido = sc.nextInt();
		
		valorAPagar = planoBasico;
		
		// se ultrapassar os minutos do plano básico
		if (minutoConsumido > minutoPlanoBasico) {
			valorAPagar += (minutoConsumido - minutoPlanoBasico) * valorMinutoExcedido;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
		
		sc.close();
		
	}
}
