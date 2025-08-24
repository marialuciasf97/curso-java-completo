# Aula 027 - Entrada de Dados em Java (parte 2)

Na aula passada [Aula026 - parte 1](../aula026_entrada_de_dados_parte1/aula026_entrada_de_dados_parte1.md) vimos o `next()`, que captura apenas **uma palavra** até o primeiro espaço.

Agora veremos como ler um texto até a **quebra de linha (enter)**, ou seja, o usuário pode digitar várias palavras com espaços, até pressionar ENTER ⏎.

---

## 27.1 nextLine() - Lendo Texto até a Quebra de Linha

- Até agora usamos métodos como `next()`, `nextInt()`, `nextDouble()`.
Esses métodos leem somente um token (normalmente até o próximo espaço).

> Para ler uma linha inteira **(inclusive com espaços)**, usamos `nextLine()`.  
> Quando você usa `nextLine()`, o Scanner lê tudo até o **ENTER⏎**, ou seja, a linha inteira.

### Exemplo inicial:
```java
Scanner sc = new Scanner(System.in);

String s1, s2, s3;

s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("Dados digitados:");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

sc.close();
```
### Execução:

- Entrada (a cada termino de frase é dado ENTER):
```
bom dia⏎
boa tarde⏎
boa noite⏎
```

- Saída:
```
Dados digitados:
bom dia
boa tarde
boa noite
```

> Foi lida a frase inteira até o **ENTER⏎**, mesmo contendo espaços.

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula027_exemplo01_nextline/src/Main.java)

---

## 27.2 Problema da Quebra de Linha Pendente

- Quando são usados comandos de leitura diferente do `nextLine()`, como `nextInt()`, `nextDolble`, `next()`, eles não consomem a quebra de linha que ocorre quando pressionamos **ENTER⏎**.
- Isso faz com que a quebra de linha fique **pendente** no buffer de entrada. E ao tentar usar `nextLine()` em seguida, ele irá consumir essa quebra de linha (ENTER) ao invés do conteúdo que você deseja capturar.
- Logo, se usarmos por exemplo, o `nextLine()` logo após um `nextInt()`, vai ocorrer algo indesejado.

### Exemplo

```java
int x;
String s1, s2, s3;

x = sc.nextInt();   // Digita o número e dar ENTER (esse ENTER fica no buffer)
s1 = sc.nextLine(); // aqui ocorre o problema (o ENTER que estava no buffer é capturado)
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("Dados digitados:");
System.out.println(x);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

sc.close();
```

### Execução:

- Entrada:
```
30⏎        (esse enter após o 30 fica no buffer)
bom dia⏎
boa tarde⏎
```

- Saída:
```
Dados digitados:
30

bom dia
boa tarde
```
> Por quê teve uma linha vazia?
- O `nextInt()` leu apenas o número 30.
- O **ENTER** após o `30` **ficou no buffer**.
- O `nextLine()` seguinte consumiu esse **ENTER** e retornou string vazia.
- Logo, `s1` = "" **(vazio)**.

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula027_exemplo02_nextline_quebra_linha_pedente/src/Main.java)

---

## 27.3 Solução para o Problema da Quebra de Linha Pendente

- Sempre que usar um `next` que **não seja** `nextLine()` e em seguida precisar de um `nextLine()`, adicione um `nextLine()` extra para consumir a quebra de linha pendente.
- Esse `nextLine()` extra **limpa o buffer** e evita o bug

### Exemplo

```java
x = sc.nextInt();  // como não é um nextLine(), o ENTER (quebra de linha) ficará no buffer
sc.nextLine();     // consome a quebra de linha pendente
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("Dados digitados:");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
```

### Execução:

- Entrada:
```
30⏎        (esse enter após o 30 fica no buffer)
bom dia⏎
boa tarde⏎
boa noite⏎
```

- Saída:
```
Dados digitados:
30
bom dia
boa tarde
boa noite
```

Algoritmo desse exemplo: [Ver Algoritmo](../../../workspace/aula027_exemplo03_nextline_solucao_limpar_buffer/src/Main.java)

---

## Resumo da Aula

✔️ O `Scanner` lê dados com métodos como `nextInt()`, `nextDouble()`, `next()`.  
✔️ O `nextLine()` lê a linha inteira até o `ENTER` ⏎.  
✔️ Se usar `nextInt()`, `nextDouble()`, `next()` ou outro que não seja `nextLine()` antes de um `nextLine()`, precisa limpar o **buffer** com um **nextLine() extra**.
