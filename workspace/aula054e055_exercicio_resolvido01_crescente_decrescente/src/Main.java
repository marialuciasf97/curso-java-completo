import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite o valor de x: ");
		x = scan.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = scan.nextInt();
		
		while(x != y) {
			
			if (x < y) {
				System.out.println("Crescente!\n");
			} else {
				System.out.println("Decrescente!\n");
			}
			
			System.out.print("Digite o valor de x: ");
			x = scan.nextInt();
			
			System.out.print("Digite o valor de y: ");
			y = scan.nextInt();
		}
		
		scan.close();
	}
}
