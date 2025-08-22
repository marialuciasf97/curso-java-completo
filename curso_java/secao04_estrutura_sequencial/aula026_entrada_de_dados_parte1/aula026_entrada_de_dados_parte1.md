# Aula 026 - Entrada de Dados em Java – Parte 1

Nesta aula vamos aprender a realizar a **entrada de dados em Java**, ou seja, quando o usuário informa dados para o programa, que são armazenados em variáveis.  

A entrada de dados também é chamada de **leitura**, pois o programa está "lendo" os valores digitados pelo usuário por meio de um dispositivo de entrada, como o teclado.

---

## 26.1. Introdução ao Scanner

No Java, para fazer entrada de dados, utilizamos um **objeto da classe `Scanner`**.  

- Primeiro, é necessário **importar** a classe:
  ```java
  import java.util.Scanner;
  ```
- Em seguida, criamos um objeto `Scanner` associado ao teclado (entrada padrão do console):
  ```java
  Scanner sc = new Scanner(System.in);
  ```
- Ao final do programa, devemos **fechar** o recurso:
  ```java
  sc.close();
  ```

**Bônus (Explicação mais Técnica - Spoiler para OO)**

- Declaramos uma variável chamada `sc` do tipo `Scanner`.
- Criamos um objeto com o operador `new` e o configuramos para ler a entrada padrão `(System.in)`.
- Esse objeto criado fica armazenado na memória `Heap`.
- A variável `sc` recebe, através do `=` a **referência (endereço de memória)** do objeto `Scanner` que foi criado.
- Assim, `sc` **não guarda o objeto em si, mas sim a referência para ele**, permitindo acessar seus métodos (como `nextLine()`, `nextInt()`, etc.).

---

## 26.2. Lendo uma Palavra (sem espaços)

Exemplo de leitura de uma palavra e impressão do valor lido:

```java
Scanner sc = new Scanner(System.in);

String x;
x = sc.next(); // lê uma palavra (para no primeiro espaço)

System.out.println("Você digitou: " + x);

sc.close();
```

- Ao rodar o programa, ele ficará aguardando a digitação do usuário.
- Se digitarmos Maria e apertarmos Enter, a saída será:

```java
Você digitou: Maria
```

> Observação: `next()` lê apenas até o primeiro espaço. Se o usuário digitar `Maria Silva`, será lido apenas `Maria`.

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula026_exemplo01_lendo_palavra_com_next/src/Main.java)

---

## 26.3. Lendo um Número Inteiro

Ler um valor inteiro e armazenar em uma variável `int`.

```java
Scanner sc = new Scanner(System.in);

int x;
x = sc.nextInt(); // lê um inteiro

System.out.println("Você digitou: " + x);

sc.close();
```

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula026_exemplo02_ler_numero_inteiro/src/Main.java)

---

## 26.4. Lendo um Número com Ponto Flutuante (double)

Por padrão, o `Scanner` usa o **Locale** do sistema para interpretar o separador decimal.  
- Em pt-BR, o separador é **vírgula (,)**.  
- Para garantir **ponto (.)**, defina `Locale.US`.

```java
Locale.setDefault(Locale.US); // força ponto como separador decimal
Scanner sc = new Scanner(System.in);

double x;
x = sc.nextDouble(); // lê um double

System.out.printf("Você digitou: %.2f%n", x);

sc.close();
```

Exemplo de entrada/saída:
```java
4.5
Você digitou: 4.50
```

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula026_exemplo03_ler_numero_ponto_flutuante/src/Main.java)

---

## 26.5. Lendo um Caractere

Como `Scanner` não possui método direto para `char`, lemos uma `String` e pegamos o **primeiro caractere**.

Ou seja, vamos usar o `next()` para capturar uma String e depois o método `.charAt(0)` para pegar o primeiro caractere.

```java
Scanner sc = new Scanner(System.in);

char x;
x = sc.next().charAt(0); // pega o primeiro caractere do token lido

System.out.println("Você digitou: " + x);

sc.close();
```

- Entrada:
```
T
```
- Saída:
```java
Você digitou: T
```

> Se o usuário digitar mais de um caractere, apenas o primeiro será considerado.

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula026_exemplo04_ler_caractere/src/Main.java)

---

## 26.6. Lendo Vários Dados na Mesma Linha

Podemos ler vários valores (separados por espaço) na mesma linha, chamando o método adequado para cada tipo:

```java
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

String nome;
int idade;
double renda;

nome  = sc.next();       // lê uma palavra
idade = sc.nextInt();    // lê um inteiro
renda = sc.nextDouble(); // lê um double

System.out.println("Dados digitados:");
System.out.println(nome);
System.out.println(idade);
System.out.println(renda);

sc.close();
```

Exemplo de entrada (Digitar tudo na mesma linha separado por espaço):
```
Maria 30 4.5
```
Saída:
```
Dados digitados:
Maria
30
4.5
```

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula026_exemplo05_ler_varios_dados_mesma_linha/src/Main.java)

---

## Conclusão dessa Aula

- `Scanner` é a forma padrão de **entrada de dados no console** em Java.  
- Métodos principais:
  - `next()` → lê `String` (até o próximo espaço)  
  - `nextInt()` → lê `int`  
  - `nextDouble()` → lê `double`  
  - `next().charAt(0)` → lê `char` (primeiro caractere)  
- **Locale** influencia o separador decimal do `nextDouble()` (vírgula vs. ponto).  
- **Feche** o `Scanner` com `sc.close()` ao final do programa.
