# Aula 087 – Gerando Automaticamente Construtores, Getters e Setters no Eclipse

Nesta aula aprendemos como utilizar o **Eclipse IDE** para gerar automaticamente:

- Construtores
- Métodos getters
- Métodos setters

**Importante**:
A geração automática **não substitui o entendimento da teoria**.
É essencial saber implementar manualmente antes de usar a ferramenta.

O Eclipse apenas automatiza algo que você já deve saber fazer.

---

## 87.1 Gerando Construtores Automaticamente

Suponha que a classe `Product` esteja assim:

```java
public class Product {

    private String name;
    private double price;
    private int quantity;

}
```

Sem construtores definidos.

---

### 87.1.1 Passo a passo no Eclipse

1. Clique com o botão direito dentro da classe.
2. Vá em:

```text
Source → Generate Constructor using Fields
```

3. Selecione os atributos que deseja incluir no construtor.
4. Clique em OK.

Dependendo dos atributos escolhidos, o Eclipse gera automaticamente algo como:

```java
public Product(String name, double price, int quantity) {
    super();
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}
```

**Sobre o `super()`**

O Eclipse adiciona:

```java
super();
```

Isso é uma chamada ao construtor da superclasse.

Toda classe em Java herda implicitamente de `Object`.  
Portanto, `super()` chama o construtor da classe pai.

Como ainda não estamos trabalhando com **herança**, essa linha pode ser removida sem problemas.  
Mais adiante, quando estudarmos **herança**, entenderemos melhor o papel do `super()`.

A ferramenta acelera a escrita, mas o design continua sendo sua responsabilidade.

---

## 87.2 Gerando Getters e Setters

Para gerar automaticamente:

1. Clique com botão direito na classe.
2. Vá em:

```text
Source → Generate Getters and Setters
```

3. Selecione os atributos desejados.
4. Clique em OK.

O Eclipse gera algo como:

```java
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

E assim para todos os atributos selecionados.

> **Importante**:
Mesmo com geração automática, devemos respeitar o encapsulamento.  
Alguns atributos não devem possuir setter.  
Sua modificação deve ocorrer apenas por métodos específicos que garantam as regras de negócio.

A ferramenta gera código.  
Mas quem define as regras é o desenvolvedor.

---

## 87.3 Conclusão

O Eclipse permite gerar automaticamente:

- Construtores
- Getters
- Setters

Isso:

- Aumenta produtividade
- Evita repetição de código
- Reduz erros de digitação

Porém:

- É fundamental entender o que está sendo gerado
- O design da classe continua sendo responsabilidade do programador
- Nem todo atributo deve ter setter

Ferramentas auxiliam.
Mas o domínio do conceito é indispensável.

---