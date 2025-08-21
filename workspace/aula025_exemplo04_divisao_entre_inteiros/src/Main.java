
public class Main {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		double result;
		
		result = a / b;
		System.out.println(result); // 2.0
		
		// Resultado esperado 2.5, mas o compilador interpreta a / b como divisão inteira, resultando em 2.0
		// Para obter o resultado correto da divisão entre inteiros, usamos o casting (exemplo 05)
		
	}
}
