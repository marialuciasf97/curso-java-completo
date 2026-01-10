# Aula 063 – Restrições e Convenções para Nomes em Java

Nesta aula, estudamos as **regras obrigatórias** e as **convenções de nomenclatura** da linguagem Java, fundamentais para garantir código **válido**, **legível** e **padronizado**.

---

## 1. Restrições para nomes de variáveis

As seguintes regras **devem ser obrigatoriamente respeitadas**:

### 1.1 Início do nome
- Não pode começar com dígito  
- Deve iniciar com **letra** ou **underscore (`_`)**

#### Incorreto:
```java
int 5minutos;
```

#### Correto:
```java
int minutos5;
int _5minutos;
```

### 1.2 Caracteres permitidos

- Não utilizar **acentos**, **til** ou caracteres especiais
- Não pode conter **espaços em branco**

#### Incorreto:
```java
double salário funcionario;
```

#### Correto:
```java
double salarioFuncionario;
```

### 1.3 Nomes significativos

Use nomes que representem claramente o propósito da variável.

#### Ruim:
```java
double x;
```

#### Bom:
```java
double salarioFuncionario;
```

---

## 2. Convenções de nomenclatura em Java

Além das restrições, a comunidade Java segue padrões bem definidos.

### 2.1 camelCase

- Primeira letra **minúscula**
- Cada nova palavra inicia com **maiúscula**

Utilizado para:

- Variáveis
- Atributos
- Métodos
- Parâmetros
- Pacotes

Exemplos:
```java
String firstName;
double saldoConta;
```

---

## 2.2 PascalCase

- Igual ao camelCase, porém com **primeira letra maiúscula**

Utilizado para:

- Classes

Exemplos:
```java
class ContaBancaria {
}

class Produto {
}
```

---

## 3. Convenção geral (resumo)

| Elemento   | Convenção  | Exemplo             |
| ---------- | ---------- | ------------------- |
| Pacotes    | camelCase  | `com.mycompany.app` |
| Classes    | PascalCase | `ContaBancaria`     |
| Variáveis  | camelCase  | `saldoConta`        |
| Métodos    | camelCase  | `calcularSaldo()`   |
| Parâmetros | camelCase  | `valorInicial`      |

> **Observação**: não se preocupe com a sintaxe completa agora.<br>Esse exemplo serve apenas para ilustrar os padrões de nomes.

### Exemplo ilustrativo
```java
package com.mycompany.app;

public class Conta {

    private double balance;

    public double getBalance() {
        return balance;
    }
}
```

### Observações:

- `com.mycompany.app` → pacote em **minúsculas**
- `Conta` → classe em **PascalCase**
- `balance` → atributo em **camelCase**
- `getBalance()` → método em **camelCase**

---

