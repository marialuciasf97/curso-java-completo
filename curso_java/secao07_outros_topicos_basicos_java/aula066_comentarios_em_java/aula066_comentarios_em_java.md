# Aula 066 – Comentários em Java

Nesta aula estudamos o **uso básico de comentários em Java**, que servem para **explicar o código**, facilitar a **leitura** e ajudar a entenderem o que o programa faz.

Nesta aula **não abordamos comentários de documentação (Javadoc)**. O foco é apenas nos comentários mais simples.

---

## 66.1 O que são Comentários?

Comentários são **trechos de texto inseridos no código-fonte** que são **ignorados pelo compilador**.  
Eles existem apenas para **leitura humana**.

São muito usados para:

- Explicar o que um programa faz
- Documentar trechos importantes do código
- Tornar o código mais legível e compreensível

---

## 66.2 Comentário de Bloco

O **comentário de bloco** é delimitado por:

```java
/*
   texto do comentário
*/
```

> Tudo o que estiver entre `/*` e `*/` será **ignorado pelo compilador.**

### Exemplo
```java
/*
 * Este programa calcula as raízes de uma equação do segundo grau.
 * Os valores dos coeficientes são informados pelo usuário.
 */
public class Main {
    public static void main(String[] args) {
        // código do programa
    }
}
```
Esse tipo de comentário é muito comum para:

- Explicar o objetivo geral do programa
- Descrever blocos maiores de código
- Inserir observações mais detalhadas

---

## 66.3 Comentário de Linha

O **comentário de linha** começa com duas barras:
```java
// comentário
```

Tudo o que vem **à direita de `//` naquela linha** será ignorado pelo compilador.

### Exemplo
```java
double delta = b * b - 4 * a * c; // cálculo do valor de delta
```

Esse tipo de comentário é usado para:
- Explicações curtas
- Comentários rápidos na mesma linha do código
- Destaque de alguma operação específica

---

## 66.4 Boas Práticas no Uso de Comentários

Uma observação importante:

> **Evite o excesso de comentários.**

Boas práticas incluem:

- Usar comentários **apenas quando necessário**
- Preferir **nomes de variáveis e métodos claros e autoexplicativos**
- Evitar comentar o óbvio

### Exemplo ruim
```java
int x = 10; // cria uma variável x e atribui 10
```

### Exemplo melhor
```java
int maxTentativas = 10;
```

> Um **bom nome** muitas vezes elimina a necessidade de comentário.

---