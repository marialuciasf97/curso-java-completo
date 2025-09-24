import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		String ponto;
		
		System.out.println("Digite o valor do eixo X:");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor do eixo Y:");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			ponto = "Origem";
		} else if (x == 0) {
			ponto = "Eixo Y";
		} else if (y == 0) {
			ponto = "Eixo X";
		} else if (x > 0 && y > 0) {
			ponto = "Q1";
		} else if (x < 0 && y > 0) {
			ponto = "Q2";
		} else if (x < 0 && y < 0) {
			ponto = "Q3";
		} else {
			ponto = "Q4";
		}
		
		System.out.println(ponto);
		
		sc.close();
		
	}
}
