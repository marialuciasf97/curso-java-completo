
public class Main {

	public static void main(String[] args) {
		
		double a = 5.0;
		int b;
		
		//b = a; // ERRO: (Type mismatch: cannot convert from double to int)
		
		// Solução com Casting:
		b = (int) a;
		System.out.println(b); // 5
		
	}
}
