import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tipoCombustivel = 0;
		int contAlcool = 0, contGasolina = 0, contDiesel = 0;
		
		System.out.println("=-=-= MENU =-=-=");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");
		System.out.print("Digite o tipo de combustível desejado: ");
		tipoCombustivel = scan.nextInt();
		
		// Obs: este problema poderia ser resolvido com do-while ou com um método para o menu,
		// evitando repetição de código. Essas abordagens serão vistas mais à frente no curso.		
		while (tipoCombustivel != 4) {
			
			switch(tipoCombustivel) {
			case 1:
				contAlcool++;
				break;
			case 2:
				contGasolina++;
				break;
			case 3:
				contDiesel++;
				break;
			default:
				System.out.println("Código Inválido!");
				break;
			}
			
			System.out.println("\n=-=-= MENU =-=-=");
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Fim");
			System.out.print("Digite o tipo de combustível desejado: ");
			tipoCombustivel = scan.nextInt();
		}
		System.out.println("\nMUITO OBRIGADO");
		System.out.println("Alcool: " + contAlcool);
		System.out.println("Gasolina: " + contGasolina);
		System.out.println("Diesel: " + contDiesel);
		
		scan.close();
	}
}
