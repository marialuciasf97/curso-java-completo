import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double notaSemestre1, notaSemestre2, notaFinal;
		
		System.out.println("Digite a nota do primeiro semestre: ");
		notaSemestre1 = sc.nextDouble();
		
		System.out.println("Digite a nota do segundo semestre: ");
		notaSemestre2 = sc.nextDouble();
		
		notaFinal = notaSemestre1 + notaSemestre2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60.00) {
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}
}
