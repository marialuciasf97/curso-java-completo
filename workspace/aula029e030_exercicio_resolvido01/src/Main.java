import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // garante ponto(.) como separador decimal
		
		Scanner sc = new Scanner(System.in);
		
		double larguraTerreno, comprimentoTerreno, precoMetroQuadrado;
		double areaTerreno, precoTerreno;
		
		System.out.println("Insira a largura do terreno: ");
		larguraTerreno = sc.nextDouble();
		
		System.out.println("Insira o comprimento do terreno: ");
		comprimentoTerreno = sc.nextDouble();
		
		System.out.println("Insira o valor do metro quadrado do terreno: ");
		precoMetroQuadrado = sc.nextDouble();
		
		areaTerreno = larguraTerreno * comprimentoTerreno;
		precoTerreno = areaTerreno * precoMetroQuadrado;
		
		System.out.printf("AREA = %.2f%n", areaTerreno);
		System.out.printf("PRECO = %.2f%n", precoTerreno);
		
		sc.close();
	}
}
