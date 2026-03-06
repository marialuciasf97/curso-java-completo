# Aula 104 – Laço for-each

O **for-each** é uma sintaxe alternativa e simplificada para percorrer coleções ou vetor em Java, amplamente utilizada quando precisamos iterar sobre todos os elementos **sem manipular índices manualmente**.

---

## 104.1 O que é o laço for-each

O **for-each** é uma estrutura de repetição que permite percorrer diretamente os elementos de uma coleção.

Ele é considerado uma **forma simplificada do laço** `for` **tradicional**, especialmente útil quando:

- precisamos apenas acessar os elementos
- não precisamos do índice da coleção
- queremos um código mais legível

---

## 104.2 Sintaxe do for-each

```java
for (Tipo apelido : colecao) {
    // código executado para cada elemento
}
```

| Componente  | Descrição                                          |
|-------------|----------------------------------------------------|
| `Tipo`      | Tipo dos elementos da coleção                      |
| `apelido`   | Nome temporário para representar cada elemento     |
| `colecao`   | Vetor ou coleção que será percorrida               |

Uma forma simples de ler o for-each:

> *"Para cada **`apelido`** contido em **`colecao`**, faça..."*

---

## 104.3 Exemplo prático

Dado o seguinte vetor de `String` já inicializado com alguns valores:

```java
String[] vect = {"Maria", "Bob", "Alex"};
```

### 104.3.1 for tradicional

```java
for (int i = 0; i < vect.length; i++) {
    System.out.println(vect[i]);
}
```

### 104.3.2 for-each

```java
for (String obj : vect) {
    System.out.println(obj);
}
```
> o for-each pode ser interpretado como:  
Para cada elemento do vetor `vect`, armazene-o em `obj` e execute o bloco de código.

Ambos produzem a mesma saída:

```
Maria
Bob
Alex
```

O for-each é **mais simples e legível**, mas os dois geram o mesmo resultado.

---

## 104.4 Comparação: for tradicional vs. for-each

| Característica                        | `for` tradicional | `for-each` |
|---------------------------------------|:-----------------:|:----------:|
| Utiliza índice                        | ✅                | ❌         |
| Acessa posições específicas           | ✅                | ❌         |
| Modifica elementos pelo índice        | ✅                | ❌         |
| Percorre apenas parte da coleção      | ✅                | ❌         |
| Sintaxe simples e legível             | ❌                | ✅         |
| Ideal para apenas iterar elementos    | ❌                | ✅         |

---

## 104.5 Quando usar cada um

**Use `for-each` quando:**
- precisar percorrer **todos** os elementos
- não precisar do índice
- quiser código mais **limpo e legível**

**Use `for` tradicional quando:**
- precisar acessar **posições específicas**
- precisar **modificar** elementos pelo índice
- precisar percorrer **apenas parte** da coleção

---

## 104.6 Conclusão

O for-each é amplamente utilizado no Java moderno para iterar sobre **vetores**, **listas**, **conjuntos** e outras coleções. Suas principais vantagens são a **sintaxe enxuta**, a **maior legibilidade** e o **menor risco de erros com índices**.

> Sempre que não precisar do índice, prefira o **for-each**.