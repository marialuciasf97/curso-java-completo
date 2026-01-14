# Aula 065 – Funções Interessantes para String

Nesta aula temos uma **coleção de métodos importantes da classe** `String`, que servem como **material de referência prática** sempre que for necessário manipular textos em Java.

### Principais categorias abordadas:

- **Formatação**: `toLowerCase()`, `toUpperCase()`, `trim()`
- **Recorte**: `substring(inicio)`, `substring(inicio, fim)`
- **Substituição**: `replace(char, char)`, `replace(String, String)`
- **Busca**: `indexOf()`, `lastIndexOf()`
- **Divisão**: `split()`

---

## 65.1 String Base (Usada nos Exemplos)
```java
String original = "abcde FGHIJ ABC abc DEFG    ";
```

Essa string contém:

- Letras maiúsculas e minúsculas
- Espaços em branco no final

Ela será usada como **base para todos os exemplos**, facilitando a comparação dos resultados.

---

## 65.2 Converter para Minúsculas – toLowerCase()

Converte **todos os caracteres** da string para letras minúsculas.
```java
String s1 = original.toLowerCase();
System.out.println(s1);
```

**Saída:**
```text
abcde fghij abc abc defg    
```

> Útil para comparações de texto sem diferenciar letras maiúsculas e minúsculas.
  
Em Java, a comparação de `String` é *case-sensitive*, por ex: `"Java"` e `"java"` são considerados diferentes.  
Aqui pode converter o texto para minúsculas antes da comparação usando `toLowerCase()`:
```java
if (entrada.toLowerCase().equals("java")) {
    // comparação sem diferenciar maiúsculas/minúsculas
}
```

---

## 65.3 Converter para Maiúsculas – `toUpperCase()`

Converte **todos os caracteres** da string para letras maiúsculas.
```java
String s2 = original.toUpperCase();
System.out.println(s2);
```

**Saída:**
```text
ABCDE FGHIJ ABC ABC DEFG    
```

---

## 65.4 Remover Espaços nas Extremidades – `trim()`

Remove **apenas os espaços em branco no início e no fim** da string.
```java
String s3 = original.trim();
System.out.println(s3);
```

**Saída:**
```text
abcde FGHIJ ABC abc DEFG
```

> O conteúdo interno da string **não é alterado**.

---

## 65.5 Recortar String – `substring()`

### A partir de uma posição
```java
String s4 = original.substring(2);
System.out.println(s4);
```

**Saída:**
```text
cde FGHIJ ABC abc DEFG    
```

> Retorna a string **do índice informado até o final**.

### Entre duas posições
```java
String s5 = original.substring(2, 9);
System.out.println(s5);
```

**Saída:**
```text
cde FGH
```

> Retorna a string entre os índices informados.  
> O índice final **não é incluído** no recorte.

---

## 65.6 Substituir Conteúdo – `replace()`

### Substituindo caracteres
```java
String s6 = original.replace('a', 'x');
System.out.println(s6);
```

**Saída:**
```text
xbcde FGHIJ ABC xbc DEFG    
```

### Substituindo substrings
```java
String s7 = original.replace("abc", "xy");
System.out.println(s7);
```

**Saída:**
```text
xyde FGHIJ ABC xy DEFG    
```

---

## 65.7 Buscar Posições – `indexOf()` e `lastIndexOf()`
```java
int i = original.indexOf("abc");
int j = original.lastIndexOf("abc");

System.out.println(i);
System.out.println(j);
```

**Saída:**
```text
0
16
```

- `indexOf()` → primeira ocorrência
- `lastIndexOf()` → última ocorrência
- Retorna `-1` se não encontrar

---

## 65.8 Dividir String – `split()`
Divide uma string em partes usando um **separador**, retornando um **vetor de strings**.  
(Ao avançar do curso, falaremos mais afundo sobre Vetores)

```java
String s = "potato apple lemon";
String[] vet = s.split(" ");

System.out.println(vet[0]);
System.out.println(vet[1]);
System.out.println(vet[2]);
```

**Saída:**
```text
potato
apple
lemon
```

Cada parte fica armazenada em uma posição do vetor:

- `vet[0]` → primeira palavra
- `vet[1]` → segunda palavra
- `vet[2]` → terceira palavra

### Algoritmo Completo com Todos os Exemplos

[Ver algoritmo](../../../workspace/aula065_exemplo_funcoes_string/src/Main.java)

---

## 65.9 Observações Importantes

- Strings em Java são **imutáveis**
- Toda operação retorna **uma nova string**
- O objeto original **nunca é alterado**
- Esses métodos são amplamente usados em:
    - Validação de dados
    - Processamento de texto
    - Entrada e saída
    - Arquivos, redes e parsing de dados

---