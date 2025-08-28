
public class Main {

	public static void main(String[] args) {
		
		double a = 1;
		double b = -3;
		double c = 2;
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b - Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b + Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("delta = " + delta);
		System.out.println("As raízes da equação são:");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}
}
