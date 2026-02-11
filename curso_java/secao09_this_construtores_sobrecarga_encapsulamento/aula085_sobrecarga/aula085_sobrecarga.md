# Aula 085 – Sobrecarga em Java

Nesta aula, aprofundamos o conceito de **sobrecarga (overloading)**, um recurso fundamental da Programação Orientada a Objetos que permite definir **múltiplas versões de métodos ou construtores com o mesmo nome**, desde que possuam **listas de parâmetros diferentes**.

O conceito é aplicado diretamente no **problema do controle de estoque**, já utilizado nas aulas anteriores (como na [aula 083](../../../curso_java/secao09_this_construtores_sobrecarga_encapsulamento/aula083_construtores/aula083_construtores.md) em 83.4 Problema Exemplo), com o objetivo de **melhorar o design da classe `Product`**, tornando sua instanciação mais flexível e expressiva.

---

## 85.1 O que é Sobrecarga?

**Sobrecarga** é o mecanismo que permite que uma mesma classe possua:

* Métodos ou construtores com o **mesmo nome**
* Desde que tenham **assinaturas diferentes**

A assinatura de um método ou construtor é definida pela **lista de parâmetros**, considerando:

* Quantidade de parâmetros
* Tipo dos parâmetros
* Ordem dos parâmetros

> O **tipo de retorno não participa da diferenciação** em sobrecarga.

---

## 85.2 Relação com a Aula 083 (Construtores)

Na **aula 083**, criamos um construtor com parâmetros para evitar a criação de produtos em estado inválido:

```java
public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}
```

Esse construtor garante que todo `Product` seja criado já com:

* Nome válido
* Preço válido
* Quantidade inicial no estoque definida

Porém, ao avançarmos no problema, surge uma nova necessidade.

---

### 85.2.1 Motivação: Nem Todo Produto Nasce com Estoque

Em muitos cenários reais:

* Um produto é cadastrado **antes de existir estoque**
* Como não tem estoque, a quantidade inicial deve ser **zero**

Com o construtor atual, somos obrigados a escrever:

```java
new Product(name, price, 0);
```

Embora funcione, essa solução:

* Polui o código
* Repete uma regra de negócio
* Reduz a expressividade da criação do objeto

A solução correta é permitir **outra forma de construção do objeto**, sem exigir a quantidade de estoque inicial (`quantity`).

---

### 85.2.2 Proposta de melhoria: Sobrecarga na Classe `Product`

Aplicamos a **sobrecarga de construtores**, criando uma nova versão que recebe apenas:

* Nome
* Preço

#### Construtor que já existia (3 parâmetros)

```java
public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}
```

Esse construtor continua existindo e é usado quando a quantidade inicial já é conhecida.

#### Construtor Sobrecarregado (2 parâmetros)

```java
public Product(String name, double price) {
    this.name = name;
    this.price = price;
    this.quantity = 0;
}
```

Nesse construtor:

* A quantidade **não é informada** pelo usuário
* A regra de negócio é explícita: todo produto criado sem quantidade inicia com **estoque zero**

Isso torna o código:

* Mais legível
* Mais seguro
* Mais alinhado ao domínio do problema

> Observação:
>
> No construtor de dois parâmetros, poderíamos omitir o `this` e escrever apenas: `quantity = 0;`  
> Isso funciona porque não existe parâmetro com o mesmo nome, logo o Java entende que estamos nos referindo ao atributo da classe.
>
> Também seria possível não atribuir nada explicitamente, pois atributos do tipo `int` são inicializados automaticamente com `0` por padrão.
>
> No entanto, pode definir `this.quantity = 0;` explicitamente como uma decisão
> de design mais clara, pois deixa a regra de inicialização evidente.


---

## 85.3 Uso dos Construtores no Programa Principal

Após a sobrecarga, a classe `Product` pode ser instanciada de duas formas principais:

```java
Product p1 = new Product(name, price, quantity); // quantidade informada
Product p2 = new Product(name, price);           // quantidade inicia em zero
```

A escolha do construtor ocorre **em tempo de compilação**, com base na lista de parâmetros utilizada.

---

## 85.4 Sobrecarga e Construtor Padrão

Se também declararmos explicitamente o construtor padrão:

```java
public Product() {
}
```

A classe passa a oferecer **três formas de instanciação**:

```java
new Product();                   // construtor padrão
new Product(name, price);        // construtor sobrecarregado
new Product(name, price, qty);   // construtor completo
```

Cada construtor atende a um **cenário específico**, sem quebrar código existente.

---

## 85.5 Regra Fundamental da Sobrecarga

A escolha de qual construtor será chamado depende **exclusivamente da lista de parâmetros utilizada**.

O Java **não considera**:

* Nome das variáveis
* Tipo de retorno

Apenas a **assinatura**:
- **nome do método**
- e pela **lista de parâmetros** (ordem, tipo e quantidade)

---

## 85.6 Benefícios da Sobrecarga de Construtores

* Evita repetição de regras de negócio no código cliente
* Torna a criação de objetos mais expressiva
* Aumenta a flexibilidade da classe
* Mantém o objeto sempre em um estado válido
* Melhora o design orientado a objetos

---

## 85.7 Código Completo

- [Classe Product](../../../workspace/aula085_sobrecargar_problema_do_estoque/src/entities/Product.java)
- [Classe Principal](../../../workspace/aula085_sobrecargar_problema_do_estoque/src/application/Program.java)

---
