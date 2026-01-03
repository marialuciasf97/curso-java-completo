# Aula 052 – Teste de Mesa com a Estrutura Repetitiva `while`

Nesta aula estudamos o **teste de mesa manual** aplicado à **estrutura repetitiva `while`**.  
Esse tipo de exercício é fundamental para **entender passo a passo a execução do código**, acompanhar a evolução das variáveis e verificar se a lógica do laço está correta.

O teste de mesa ajuda muito:
- Na compreensão do funcionamento do `while`
- Na identificação de erros lógicos
- No raciocínio para resolver exercícios e provas

---

## 52.1 Código Analisado no Teste de Mesa

Considere o seguinte trecho de código:

```java
int x = 0;
int y = 4;

while (x < 3) {
    y = y + 2;
    x = x + 1;
    System.out.println(x + "-" + y);
}
```

---

## 52.2 Regra de Funcionamento do while

- A condição é **avaliada antes** de cada iteração.
- Se a condição for **verdadeira**, o bloco é executado e o fluxo **volta ao início do laço**.
- Se a condição for **falsa**, o laço é encerrado.

---

## 52.3 Teste de Mesa (Resumo em Tabela)

A tabela abaixo mostra a execução **passo a passo**, seguindo exatamente a ordem de funcionamento do `while`.

| Passo | x (antes) | y (antes) | Condição `x < 3` | Operações Executadas                     | x (depois) | y (depois) | Impressão |
|------|-----------|-----------|------------------|------------------------------------------|------------|------------|-----------|
| 0    | 0         | 4         | —                | Inicialização das variáveis              | 0          | 4          | —         |
| 1    | 0         | 4         | Verdadeira       | `y = y + 2`<br>`x = x + 1`                | 1          | 6          | `1-6`     |
| 2    | 1         | 6         | Verdadeira       | `y = y + 2`<br>`x = x + 1`                | 2          | 8          | `2-8`     |
| 3    | 2         | 8         | Verdadeira       | `y = y + 2`<br>`x = x + 1`                | 3          | 10         | `3-10`    |
| 4    | 3         | 10        | Falsa            | Laço encerrado                           | 3          | 10         | —         |

---

## 52.4 Resultado Final

- Valor final de `x`: **3**
- Valor final de `y`: **10**

Saída no console:
```bash
1-6
2-8
3-10
```

---


## 52.5 Observações Importantes

- A condição do `while` é sempre testada **antes** da execução do bloco.
- Quando x passa a valer `3`, a condição `x < 3` se torna **falsa**.
- Quando a condição é falsa, **nenhuma instrução dentro do laço é executada**.
- O `System.out.println` gera uma nova linha a cada iteração, por isso a saída aparece linha por linha.

---

## 52.6 Conclusão

O teste de mesa manual é uma técnica essencial para:

- Entender estruturas repetitivas
- Desenvolver raciocínio lógico
- Prever corretamente a saída de um programa

> Antes de implementar soluções mais complexas com `while`, é altamente recomendável **treinar testes de mesa** como este.