public class Main {

    public static void main(String[] args) {

        // String base usada em todos os exemplos
        String original = "abcde FGHIJ ABC abc DEFG    ";

        System.out.println("ORIGINAL: -" + original + "-");
        System.out.println();

        /*
         * ===============================
         * FORMATAÇÃO DE TEXTO
         * ===============================
         */

        // Converte toda a string para letras minúsculas
        String s1 = original.toLowerCase();
        System.out.println("toLowerCase(): -" + s1 + "-");

        // Converte toda a string para letras maiúsculas
        String s2 = original.toUpperCase();
        System.out.println("toUpperCase(): -" + s2 + "-");

        // Remove espaços em branco do início e do fim
        String s3 = original.trim();
        System.out.println("trim(): -" + s3 + "-");

        System.out.println();

        /*
         * ===============================
         * RECORTE DE STRING
         * ===============================
         */

        // Recorta a string a partir do índice 2 até o final
        String s4 = original.substring(2);
        System.out.println("substring(2): -" + s4 + "-");

        // Recorta a string do índice 2 até o índice 9 (9 não incluído)
        String s5 = original.substring(2, 9);
        System.out.println("substring(2, 9): -" + s5 + "-");

        System.out.println();

        /*
         * ===============================
         * SUBSTITUIÇÃO
         * ===============================
         */

        // Substitui todas as ocorrências do caractere 'a' por 'x'
        String s6 = original.replace('a', 'x');
        System.out.println("replace('a', 'x'): -" + s6 + "-");

        // Substitui todas as ocorrências da substring "abc" por "xy"
        String s7 = original.replace("abc", "xy");
        System.out.println("replace(\"abc\", \"xy\"): -" + s7 + "-");

        System.out.println();

        /*
         * ===============================
         * BUSCA DE POSIÇÕES
         * ===============================
         */

        // Primeira ocorrência da substring "BC"
        int i = original.indexOf("abc");

        // Última ocorrência da substring "BC"
        int j = original.lastIndexOf("abc");

        System.out.println("indexOf(\"abc\"): " + i);
        System.out.println("lastIndexOf(\"abc\"): " + j);

        System.out.println();

        /*
         * ===============================
         * DIVISÃO DA STRING (split)
         * ===============================
         */

        String s = "potato apple lemon";

        // Divide a string usando espaço como separador
        String[] vet = s.split(" ");

        System.out.println("split(\" \"):");
        System.out.println("vet[0]: " + vet[0]);
        System.out.println("vet[1]: " + vet[1]);
        System.out.println("vet[2]: " + vet[2]);
    }
}
