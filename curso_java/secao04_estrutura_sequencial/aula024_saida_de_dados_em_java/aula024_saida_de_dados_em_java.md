# Aula 024 – Saída de Dados em Java

Nesta aula, vamos aprender na prática como realizar a **saída de dados em Java**, ou seja, quando o programa informa dados para o usuário por meio de dispositivos de saída, como o **monitor**.  

Essa operação também é chamada de **escrita**, pois o programa "escreve" os dados para o usuário.

---

## 24.1. Comandos Básicos de Saída

O Java possui dois comandos principais para imprimir no console:

- `System.out.print("texto");` → imprime **sem quebra de linha**.  
- `System.out.println("texto");` → imprime **com quebra de linha ao final**.

### Exemplos:

- Usando `println` (com quebra de linha):

~~~java
System.out.println("Olá, Mundo!");
System.out.println("Bom dia!");
~~~
Saída:
~~~
Olá, Mundo!
Bom dia!
~~~

- Usando `print` (sem quebra de linha):

~~~java
System.out.print("Olá, Mundo!");
System.out.print("Bom dia!");
~~~
Saída:
~~~
Olá, Mundo!Bom dia!
~~~

---

## 24.2. Impressão de Variáveis

Podemos exibir valores armazenados em variáveis diretamente com `print` ou `println`.

### 24.2.1. Tipo inteiro (int)
- Vamos criar na memória RAM uma “caixinha” chamada `y` com valor `32`, e depois imprimir seu conteúdo:
~~~java
int y = 32;
System.out.println(y);
~~~
Saída:
~~~
32
~~~

### 24.2.2. Tipo de ponto flutuante (double)
~~~java
double x = 10.35784;
System.out.println(x);
~~~
Saída:
~~~
10.35784
~~~

---

## 24.3. Controle de Casas Decimais – `printf`

Para controlar o número de casas decimais, utilizamos o `printf` (**print formatado**).  
Use `%.<casas>f`. (O valor pode ser arredondado.)

~~~java
double x = 10.35784;
System.out.printf("%.2f%n", x); // imprime 10,36
System.out.printf("%.4f%n", x); // imprime 10,3578
~~~

- `%.2f` → limita **duas** casas decimais.  
- `%.4f` → limita **quatro** casas decimais.  
- `%n` ou `\n` → quebra de linha (equivalente ao `println`).  

---

## 24.4. Separador Decimal (vírgula × ponto)

O `printf` usa por padrão a **localidade (Locale)** do computador.  
No português do Brasil, o separador decimal é a **vírgula**. (Diferente do `println`, que sempre usa **ponto**.)

Para forçar o `printf` a usar **ponto**, configure o `Locale` para **US**.

> **Importe a classe**: `import java.util.Locale;`

### Exemplo:
~~~java
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // força separador decimal com ponto
        double x = 10.35784;
        System.out.printf("%.2f%n", x);
    }
}
~~~
Saída:
~~~
10.36
~~~

---

## 24.5. Concatenando texto e variáveis

### 24.5.1 Usando `println`
Regra geral: `elemento1 + elemento2 + ... + elementoN`

~~~java
double x = 10.35784;
System.out.println("Resultado = " + x + " metros");
~~~
Saída:
~~~
Resultado = 10.35784 metros
~~~

### 24.5.2 Usando `printf`
Marcadores:
- `%f` → ponto flutuante
- `%d` → inteiro
- `%s` → texto

Regra geral:
`"texto <%.marcador> texto %.<marcador> texto %.<marcador>%n", var1, var2, var3`

~~~java
java.util.Locale.setDefault(java.util.Locale.US);
double x = 10.35784;
System.out.printf("Resultado = %.2f metros%n", x);
~~~
Saída:
~~~
Resultado = 10.36 metros
~~~

---

## 24.6. Concatenar elementos com diferentes tipos (usando `printf`)

Especificadores comuns:
- `%f` → ponto flutuante (`double/float`)  
- `%d` → inteiro (`int/long`)  
- `%s` → `String` (texto)  
- `%c` → caractere  
- `%n` → quebra de linha  

~~~java
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
~~~
Saída:
~~~
Maria tem 31 anos e ganha R$ 4000.00 reais
~~~

---

## Resumo da Aula
- `print` → imprime **sem** quebra de linha.  
- `println` → imprime **com** quebra de linha.  
- `printf` → imprime **formatado**.  
- Marcadores: `%d` (inteiro), `%f` (decimais), `%s` (texto), `%n` (quebra de linha).  
- `Locale` controla o separador decimal (vírgula ou ponto).  
- Concatenar texto e variáveis: `+` (simples) ou `printf` (formatado).  

Para mais informações sobre formatação de números, consulte: [Documentação Oracle – NumberFormat](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)

Algoritmo Baseado na Aula: [Ver Algoritmo](./src/Main.java)

Exercício de Fixação: [Ver Exercício](../../../workspace/aula024_exercicio_fixacao01/aula024_exercicio_fixacao01.md)
