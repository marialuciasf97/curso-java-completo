il# Aula 086 – Encapsulamento

Nesta aula, estudamos um dos princípios mais importantes da Programação Orientada a Objetos: o **encapsulamento**.

Encapsular significa **proteger os dados internos de implementação, os escondendo**, e **expor apenas operações seguras**, garantindo que o objeto permaneça sempre em um **estado consistente**.

---

## 86.1 O que é Encapsulamento?

Encapsulamento é o princípio que determina que:

- Atributos de uma classe **não devem ser acessados diretamente**
- O acesso e modificação devem ocorrer por meio de **métodos controlados**
- A própria classe deve garantir a consistência dos seus dados

**Regra de Ouro**

> O objeto deve sempre estar em um estado válido e consistente.  
A própria classe é responsável por garantir isso.

---

## 86.2 Analogia: Aparelho Eletrônico

Um aparelho de som possui circuitos internos complexos.

O usuário **não pode acessar diretamente os circuitos**, pois isso poderia danificar o aparelho.

O que é exposto ao usuário?

- Botão de ligar
- Play
- Pause
- Avançar
- Retroceder

Ou seja:

- O funcionamento interno é escondido
- Apenas operações seguras são disponibilizadas

Em Programação Orientada a Objetos, funciona da mesma forma.  
O usuário do objeto não deve manipular diretamente seus dados internos.

---

## 86.3 Regra Geral - Encapsulamento em Java

Para aplicar encapsulamento:

1. **Tornar os atributos privado**
```java
private String name;
private double price;
private int quantity;
```

Isso impede o acesso direto a partir de outras classes.

2. **Criar métodos GET e SET**

Esses métodos são responsáveis por obter e modificar valores dos atributos. Por convenção:

- `getNomeDoAtributo()` → para obter valor
    - Não possui parâmetros e deve informar o tipo de retorno
- `setNomeDoAtributo(valor)` → para alterar valor
    - Não tem tipo de retorno, mas tem algum parâmetro

**Mas atenção**:

Nem todo atributo deve necessariamente possuir setter.  
A decisão depende da regra de negócio.

---

## 86.4 Aplicando Encapsulamento na Classe Product

Estamos encapsulando o mesmo problema visto em aulas anteriores, na aula [085](../../../curso_java/secao09_this_construtores_sobrecarga_encapsulamento/aula085_sobrecarga/aula085_sobrecarga.md) foi aplicada sobreposição de construtores, e nessa aula 086 estamos aplicando Encapsulamento.

Antes na classe `Product`, os atributos eram públicos:

```java
public String name;
public double price;
public int quantity;
```

Agora:

```java
private String name;
private double price;
private int quantity;
```

Agora, se em `Program` tentarmos acessar atributos da classe `Product`:

```java
product.name = "Computer";
```

O compilador gera erro:

```java
The field Product.name is not visible
```

Isso acontece porque o atributo está protegido com `private`  
Agora só será possivel obter/atribuir através de métodos **getters** e **setters**

---

## 86.5 Encapsulando os atributos

### 86.5.1 Atributo `name`

**Getter** 

```java
public String getName() {
    return name;
}
```

**Setter**

```java
public void setName(String name) {
    this.name = name;
}
```

Agora o acesso ocorre assim:

```java
product.setName("Computer");
System.out.println(product.getName());
```

### 86.5.2 Atributo `price`

Segue a mesma llógica que foi feita no atributo `name`

A partir desse momento, toda modificação passa por um método controlado.

> Obs: Mesmo utilizando setter, a responsabilidade de manter o objeto consistente continua sendo da própria classe.  
Se necessário, validações podem ser adicionadas dentro do método.

### 86.5.3 Atributo `quantity`

Esse atributo depende das regras de negócio

---

## 86.7 Regra de Negócio: O Caso da Quantidade

Aqui entra um ponto importante.

A quantidade não deve ser alterada livremente.

Ela só pode mudar quando:

- Houver entrada no estoque (`addProducts`)
- Houver saída no estoque (`removeProducts`)

Se criarmos um `setQuantity`, qualquer classe poderia fazer:

```java
product.setQuantity(-500);
```

Isso poderia quebrar a consistência do objeto, não existe uma quantidade de estoque negativa.

***Solução: Criar apenas o Getter**

```java
public int getQuantity() {
    return quantity;
}
```

E não criar setter.

A alteração continuará sendo feita apenas por métodos específicos:

```java
public void addProducts(int quantity) {
    this.quantity += quantity;
}

public void removeProducts(int quantity) {
    this.quantity -= quantity;
}
```

Assim, a classe mantém controle sobre sua própria integridade.

Esse é um exemplo claro de que:

> `Getter` nem sempre significa que o atributo é mutável.  
`Setter` só deve existir quando fizer sentido dentro da regra de negócio.

---

## 86.8 Conclusão

- Encapsulamento protege os dados do objeto
- Atributos devem ser `private`
- Acesso deve ocorrer via métodos GET/SET
- Nem todo atributo deve possuir setter
- Regras de negócio devem ser protegidas pela própria classe

Encapsular é controlar como o objeto pode ser utilizado e não é apenas esconder atributos.

É garantir que:

- O objeto nunca entre em estado inválido
- As regras de negócio sejam respeitadas
- O design da classe seja seguro e consistente

Quando bem aplicado, o encapsulamento torna o código:

- Mais seguro
- Mais organizado
- Mais fácil de manter

Ele é um dos pilares fundamentais da Programação Orientada a Objetos.

---

## 86.9 Código Completo após Encapsulamento

- [Classe Product](../../../workspace/aula086_encapsulando_problema_do_estoque/src/entities/Product.java)
- [Classe Principal](../../../workspace/aula086_encapsulando_problema_do_estoque/src/application/Program.java)

> Observação:  
Poderiam ser adicionadas **validações** nos métodos `setters`, como verificar se o `price` é maior que zero ou impedir `quantity` negativa.  
Mas nesta etapa, o objetivo foi focar exclusivamente na aplicação do encapsulamento, mantendo a implementação simples.