import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int intervaloMin = 10;
		int intervaloMax = 20;
		int dentroIntervalo = 0, foraIntervalo = 0;
		int N = 0, X = 0;
		
		System.out.print("Digite o valor de N: ");
		N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.print("Digite o " + i + "ª valor: ");
			X = scan.nextInt();
			
			if (X >= intervaloMin && X <= intervaloMax) {
				dentroIntervalo++;
			} else {
				foraIntervalo++;
			}
		}
		
		System.out.println(dentroIntervalo + " in");
		System.out.println(foraIntervalo + " out");
		
		scan.close();
	}
}
