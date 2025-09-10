# Aula 035 - Estrutura Condicional (if-else)

A **estrutura condicional** é um tipo de **estrutura de controle** que permite **direcionar o fluxo de execução do programa** com base em uma condição.  

Ou seja:  
- Se a condição for **verdadeira**, um bloco de comandos será executado.  
- Se a condição for **falsa**, outro bloco (ou nenhum) será executado.  

Isso torna o programa **mais inteligente e dinâmico**, permitindo diferentes comportamentos conforme os valores processados.

---

## 35.1 Estrutura Condicional Simples (if)

Na forma **simples**, só existe um bloco de comandos a ser executado **caso a condição seja verdadeira**.  
Se for falsa, esse bloco será ignorado.

**Sintaxe:**
```java
if (condicao) {
    // comandos executados se a condição for verdadeira
}
```

### 35.1.1 Exemplo prático
```java
int x = 5;

System.out.println("Bom dia");
if (x > 0) {
    System.out.println("Boa tarde");
}
System.out.println("Boa noite");
```
- Imprime **Bom dia** pois não tem restrições.
- Imprime **Boa tarde** pois apesar de ter restrição, a condição é atendida `(x > 0)`
  - Se a condição não fosse atendida, **Boa tarde** não seria impresso.
- Imprime **Boa noite** pois não tem restrições.

> 📌 Boas práticas: utilize indentação (recuo) para facilitar a leitura do código.

---

## 35.2 Estrutura Condicional Composta (if-else)

Permite **duas alternativas:**
- Se a condição for verdadeira, executa o bloco do `if`.
- Caso contrário, executa o bloco do `else`.

**Sintaxe:**
```java
if (condicao) {
    // comandos executados se a condição for verdadeira
} else {
    // comandos executados se a condição for falsa
}
```

### 35.2.1 Exemplo prático
```java
Scanner sc = new Scanner(System.in);

System.out.print("Que horas são? ");
int hora = sc.nextInt();

if (hora < 12) {
    System.out.println("Bom dia");
} else {
    System.out.println("Boa tarde");
}
sc.close();
```
- Se usuário digita o valor de `hora` < 12 (ex: 10):
    - imprime **Bom dia** (bloco do if).
- Se usuário digita o valor de `hora` >= 12 (ex: 15):
    - imprime **Boa tarde** (Bloco do else).

---

## 35.3 Encadeamento de Condições

Quando há mais de duas possibilidades, podemos encadear estruturas condicionais.

### 35.3.1 Exemplo

```java
Scanner sc = new Scanner(System.in);

System.out.print("Que horas são? ");
int hora = sc.nextInt();

if (hora < 12) {
    System.out.println("Bom dia");
} else {
    if (hora < 18) {
        System.out.println("Boa tarde");
    } else {
        System.out.println("Boa noite");
    }
}

sc.close();
```
- Se usuário digita um valor de `hora < 12` (ex: 10):
    - Imprime **Bom dia** (Bloco do if mais externo).
- Se usuário digita um valor de `hora >= 12` entra no `else` externo, que possui um `if-else` dentro dele.
    - se `hora < 18` (ex: `16`): imprime **Boa tarde** (if mais interno).
    - Caso contrário (ex: `20`): imprime **Boa noite** (else mais interno).

### 35.3.2 Organização com else if

Em vez de criar vários níveis de indentação, pode-se alinhar `else if` na mesma coluna.

### 35.3.3 Exemplo

```java
if (hora < 12) {
    System.out.println("Bom dia");
} else if (hora < 18) {
    System.out.println("Boa tarde");
} else {
    System.out.println("Boa noite");
}
```

---

## 35.4 Sintaxe Opcional: Chaves

Se o bloco de comandos tiver apenas uma instrução, as chaves `{}` podem ser omitidas.

### 35.4.1 Exemplo

```java
if (hora < 12)
    System.out.println("Bom dia");
else if (hora < 18)
    System.out.println("Boa tarde");
else
    System.out.println("Boa noite");
```
> **⚠️ Atenção**: por questões de **clareza e didática**, recomenda-se sempre usar chaves, mesmo quando há apenas um comando.

---

35.5 Resumo

- **if** (simples) → executa apenas se a condição for verdadeira.
- **if-else** → escolhe entre duas possibilidades.
- **if-else if-else** → permite tratar várias condições encadeadas.
- **else if** → verificar uma nova condição quando a anterior (if) não foi satisfeita.  
Ela evita múltiplos níveis de `if` dentro de `else`, tornando o código mais **organizado e legível**.