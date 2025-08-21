import java.util.Locale;

public class Main {
    
	public static void main(String[] args) {
        
        // Imprimir na tela:

        // sem quebra de linha (retira o 'ln' do print):
        System.out.print("Hello world!");
        System.out.print("Good morning!\n");
        
        // com quebra de linha (acrescenta 'ln' no print):
        System.out.println("Hello world");
        System.out.println("Good morning!");

        // criando na memória RAM uma "caixinha" chamada 'y' com valor 32:
        int y = 32;
        
        // mostrando o conteúdo da variável y:
        System.out.println(y);

        // criando uma variável do tipo double
        double x = 10.35784;
        System.out.println(x); // imprime todas as casas

        // Para limitar o número de casas decimais, usa-se printf
        System.out.printf("%.2f%n", x); // %.2f = 2 casas decimais, %n = quebra de linha
        System.out.printf("%.4f%n", x); // %.4f = 4 casas decimais

        // printf usa por padrão o idioma do sistema
        // Se estiver em português-BR, printf usa vírgula como separador decimal
        // Para usar ponto como separador, deve-se configurar Locale para US:
        Locale.setDefault(Locale.US);

        // agora o printf usa ponto como separador decimal
        System.out.printf("%.4f%n", x);

        // concatenando vários elementos com "+"
        System.out.println("RESULT = " + x + " METERS");

        // concatenando com printf (mais controlado):
        System.out.printf("RESULT = %.2f METERS%n", x);

        // Exemplo com variáveis de tipos diferentes:
        String name = "Maria";
        int age = 31;
        double income = 4000.0;
        
        // usando marcadores diferentes no printf: %s (String), %d (int), %.2f (double)
        System.out.printf("%s is %d years old and earns US$ %.2f%n", name, age, income);
    }
}
