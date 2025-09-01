import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		System.out.println("Insira os valores de A, B e C. (separados por espaço)");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		// área do triângulo retângulo (A - base, e C - altura)
		areaTriangulo = (A * C) / 2;
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		
		// área do cículo (C - raio, e pi = 3.14159)
		areaCirculo = pi * Math.pow(C, 2);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		
		// área do trapézio (A e B - bases, e C - altura)
		areaTrapezio = ((A + B) * C) / 2;
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		
		// área quadrado (B - lado)
		areaQuadrado = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		
		// área retangulo (A e B - lados)
		areaRetangulo = A * B;
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
		
	}
}
