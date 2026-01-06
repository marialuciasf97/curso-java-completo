# Aula 057 - Teste de Mesa com Estrutura Repetitiva `for`

Nesta aula realizamos um **teste de mesa manual** para a **estrutura repetitiva `for`**, com o objetivo de **entender claramente sua regra de funcionamento**, passo a passo.

O teste de mesa é fundamental para:
- Consolidar o entendimento da estrutura `for`
- Evitar erros lógicos em loops
- Desenvolver raciocínio algorítmico

---

## 57.1 Recapitulando Regras de Funcionamento do for

A estrutura `for` possui **três partes**:

```java
for (inicio; condição; incremento) {
    comandos
}
```

- **Início** → Executado **apenas uma vez**, na primeira entrada no `for`
- **Condição** → Testada **antes de cada repetição**
- **Incremento** → Executado **sempre após o bloco**, ao voltar para o `for`

---

## 57.2 Código Analisado no Teste de Mesa

```java
int x = 3;
int y = 0;

for (int i = 0; i < x; i++) {
    System.out.print(i + ",");
    y = y + 5;
    System.out.println(y);
}
```

---

## 57.3 Teste de Mesa (Passo a Passo)

### Estado Inicial (Antes do `for`):
| Variável | Valor |
| -------- | ----- |
| x        | 3     |
| y        | 0     |

### Tabela de Teste de Mesa (para x = 3):
| Passo | i (antes) | y (antes) | Condição `i < x` | Operações Executadas                            | i (depois) | y (depois) | Impressão |
| ----- | --------- | --------- | ---------------- | ----------------------------------------------- | ---------- | ---------- | --------- |
| 0     | —         | —         | —                | Inicialização: `i = 0`                          | 0          | 0          | —         |
| 1     | 0         | 0         | true             | `print(i + ",")`<br>`y = y + 5`<br>`println(y)` | 1          | 5          | `0,5`     |
| 2     | 1         | 5         | true             | `print(i + ",")`<br>`y = y + 5`<br>`println(y)` | 2          | 10         | `1,10`    |
| 3     | 2         | 10        | true             | `print(i + ",")`<br>`y = y + 5`<br>`println(y)` | 3          | 15         | `2,15`    |
| 4     | 3         | 15        | false            | Loop encerrado                                  | —          | —          | —         |


### Resultado Final:
- Valor final de `i`: **3**
- Valor final de `y`: **15**

### Saída no console:
```bash
0,5
1,10
2,15
```

---

## 57.5 Observações e Conclusão

- A variável de controle (`i`) é criada e inicializada **no início do `for`**, sendo executada apenas uma vez.
- O **incremento** ocorre **sempre após a execução do bloco**, antes de testar novamente a condição.
- Quando a condição se torna **falsa**, o laço é imediatamente encerrado.
- A estrutura `for` é ideal para:
  - **Contagens** (progressivas ou regressivas)
  - **Repetições com quantidade previamente conhecida**
  - **Testes de mesa claros e previsíveis**

O **teste de mesa com `for`** facilita muito o entendimento da execução do programa, pois deixa claro:
- Quando cada parte do `for` é executada
- Como as variáveis mudam a cada iteração
- Por que e em que momento o laço termina

Essa prática é **essencial** antes de avançar para exercícios mais complexos e para evitar erros lógicos em estruturas de repetição.
