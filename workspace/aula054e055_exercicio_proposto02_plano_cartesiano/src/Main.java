import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double X = 0, Y = 0;

		System.out.print("Digite o valor de X: ");
		X = scan.nextDouble();

		System.out.print("Digite o valor de Y: ");
		Y = scan.nextDouble();

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro Quadrante\n");
			} else if (X < 0 && Y > 0) {
				System.out.println("Segundo Quadrante\n");
			} else if (X < 0 && Y < 0) {
				System.out.println("Terceiro Quadrante\n");
			} else { // X > 0 && Y < 0
				System.out.println("Quarto Quadrante\n");
			}

			System.out.print("Digite o valor de X: ");
			X = scan.nextDouble();

			System.out.print("Digite o valor de Y: ");
			Y = scan.nextDouble();
		}

		scan.close();
	}
}
