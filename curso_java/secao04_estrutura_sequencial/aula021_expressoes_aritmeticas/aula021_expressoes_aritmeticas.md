# Aula 021 - Expressões Aritméticas

Expressões aritméticas são aquelas que, ao serem calculadas, retornam um valor numérico.  
Por exemplo: a expressão `4 + 5` resulta em `9`.

## 21.1 Operadores Aritméticos
Os operadores aritméticos permitem realizar operações matemáticas em variáveis e valores numéricos.  
Segue os principais operadores:

| Operador | Descrição                    | Exemplo   | Resultado |
|----------|------------------------------|-----------|-----------|
| `+`      | Adição                        | `4 + 5`   | 9         |
| `-`      | Subtração                     | `9 - 3`   | 6         |
| `*`      | Multiplicação                 | `2 * 3`   | 6         |
| `/`      | Divisão                       | `8 / 2`   | 4         |
| `%`      | Resto da divisão (**mod**)    | `14 % 3`  | 2         |

> ⚠ O operador `%` **não** é porcentagem, e sim o *resto* de uma divisão inteira.

---

## 21.2 Ordem de Precedência dos Operadores
Quando uma expressão contém mais de um operador, a ordem em que as operações são realizadas afeta o resultado.  
Nem todos os operadores têm a mesma prioridade, e a execução segue regras específicas.

### 21.2.1 Ordem de resolução
1. **Parênteses `( )`** → Sempre resolvidos primeiro, do mais interno para o mais externo.  
2. **Multiplicação `*`, Divisão `/` e Módulo `%`** → Mesma precedência, resolvidos da **esquerda para a direita**.  
3. **Adição `+` e Subtração `-`** → Mesma precedência, resolvidos da **esquerda para a direita**.  

---

### 21.2.2 Tabela de Precedência

| Nível de Precedência | Operadores   | Descrição                                                                 |
|----------------------|--------------|---------------------------------------------------------------------------|
| 1° lugar             | `( )`        | Parênteses alteram a ordem natural, resolvendo primeiro o que está dentro deles. |
| 2° lugar             | `*`, `/`, `%`| Multiplicação, Divisão e Módulo são resolvidos antes de soma/subtração.   |
| 3° lugar             | `+`, `-`     | Adição e Subtração são resolvidos após multiplicação/divisão/módulo.      |
| Mesma precedência    | —            | Quando dois operadores têm a mesma precedência, a execução é da esquerda para a direita. |


---

## 21.3 Exemplos de Expressões e Resultados

| Expressão              | Ordem de Resolução                                               | Resultado | Explicação |
|------------------------|------------------------------------------------------------------|-----------|------------|
| `2 * 6 / 3`            | `2 * 6 = 12`, depois `12 / 3 = 4`                                | 4         | `*` e `/` têm mesma precedência, logo executa da esquerda para a direita. |
| `3 + 2 * 4`            | `2 * 4 = 8`, depois `3 + 8 = 11`                                 | 11        | Multiplicação tem maior precedência que adição. |
| `(3 + 2) * 4`          | `(3 + 2) = 5`, depois `5 * 4 = 20`                               | 20        | Parênteses resolvem primeiro, alterando a ordem natural. |
| `60 / (3 + 2) * 4`     | `(3 + 2) = 5`, depois `60 / 5 = 12`, depois `12 * 4 = 48`         | 48        | Parênteses resolvem primeiro, depois `/` e `*` da esquerda para a direita. |
| `60 / ((3 + 2) * 4)`   | `(3 + 2) = 5`, depois `5 * 4 = 20`, depois `60 / 20 = 3`          | 3         | Parênteses internos primeiro, depois `*`que esta nos `()`, depois `/`. |

---

## 21.4 Operador de Módulo `%`
O operador Modulo `%` retorna o **resto** da divisão inteira entre dois números.  
É útil para verificar divisibilidade ou calcular restos.

| Expressão  | Cálculo                        | Resultado |
|------------|--------------------------------|-----------|
| `14 % 3`   | `14 / 3 = 4` resto `2`         | 2         |
| `19 % 5`   | `19 / 5 = 3` resto `4`         | 4         |
