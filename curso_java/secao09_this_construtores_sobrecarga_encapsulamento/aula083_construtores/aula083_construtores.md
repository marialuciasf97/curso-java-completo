# Aula 083 – Construtores em Java

Nesta aula, iniciamos o estudo dos **construtores**, um dos conceitos fundamentais da Programação Orientada a Objetos e peça-chave para **melhorar o design das classes**.

Construtores permitem executar ações no momento da **instanciação de um objeto**, sendo amplamente utilizados para **inicializar atributos** e **garantir que um objeto seja criado em um estado válido**.

---

## 83.1 O que é um Construtor?

Um **construtor** é uma operação especial de uma classe que:

- É executada **automaticamente** no momento em que o objeto é instanciado (`new`)
- Possui o **mesmo nome da classe**
- **Não possui tipo de retorno**
- Pode receber parâmetros

Exemplo de instanciação (se não for criado construtor com parâmetros):

```java
Product product = new Product();
```

> Ao executar `new Product()`, o **construtor da classe** `Product` é chamado.

---

## 83.2 Para que usar Construtores?

Os usos mais comuns de construtores são:

- Inicializar os valores dos atributos
- Garantir que o objeto receba dados obrigatórios na criação
- Evitar a criação de objetos em estado inconsistente
- Melhorar o encapsulamento e o design da classe

**Ideia central**  
Um objeto deve **nascer pronto para uso**, já em um estado válido.

---

## 83.3 Construtor Padrão

Se **nenhum construtor for declarado explicitamente**, o Java fornece automaticamente um **construtor padrão**, sem argumentos:

```java
public Product() {
}
```

Esse construtor é o que permite chamadas como:

```java
new Product();
```

> **Importante**: Quando um construtor com parâmetros é criado, o construtor padrão **deixa de existir automaticamente**, a menos que seja declarado manualmente pelo programador um contrutor padrão.
---

## 83.4 Problema Exemplo – Produto em Estoque

Vamos reutilizar o problema do capítulo anterior, agora aplicando o conceito de **construtores**.

Se quiser rever a aula anterior onde esse problema foi resolvido **sem construtor com parâmetros**, acesse: [Ir para a aula](../../../curso_java/secao08_introducao_programacao_orientada_objetos/aula074ate076_problema02_controle_estoque_usando_poo/aula074ate076_controle_estoque_produto_usando_poo.md)  

Abaixo está o enunciado do problema:

![problema02](../../../imagens/imagem_aula074_exemplo02.png)

### 83.4.1 Problema do Uso do Construtor Padrão

Quando esse problema foi resolvido no **capítulo anterior**, Na solução anterior, não foi criado um construtor com parâmetros.  
Isso permitia instanciar o objeto assim:

```java
Product product = new Product();
```

Nesse caso, os atributos recebiam **valores padrão**:

- `String name` → `null`
- `double price` → `0.0`
- `int quantity` → `0`

Os valores só passavam a fazer sentido **depois**, quando eram atribuídos via `Scanner`.

**Problema:**
Faz sentido existir um produto **sem nome** ou **sem preço**?  
Claramente, não.

---

## 83.5 Criando um Construtor com Parâmetros

Para evitar a criação de produtos inválidos, criamos um **construtor que obriga o fornecimento dos dados essenciais** no momento da instanciação.

**Classe `Product`**

```java
public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
```

### 83.5.1 Observação sobre a palavra this

- `this` refere-se ao **objeto atual**
- É usado para diferenciar **atributos da classe** de **parâmetros do construtor**

#### Exemplo:

```java
this.name = name;
```

- `this.name` → atributo do objeto
- `name` → parâmetro do construtor

---

## 83.6 Impacto no Programa Principal após a Criação do Contrutor com Parâmetros

Após a criação do construtor com parâmetros, o código abaixo **deixa de funcionar**:

```java
Product product = new Product(); // ERRO
```

Isso ocorre porque o **construtor padrão não existe mais**.

Agora, o objeto deve ser criado informando todos os dados obrigatórios:

```java
Product product = new Product(name, price, quantity);
```

Isso força o programador a criar o objeto **em um estado válido desde o início.**

---

## 83.7 Benefícios do Uso de Construtores

- Evita objetos com dados inválidos
- Garante consistência do estado do objeto
- Centraliza a inicialização dos atributos
- Melhora o encapsulamento
- Torna o código mais seguro e expressivo

## 83.8 Conclusão

- Construtores são executados no momento da instanciação do objeto
- Servem para inicializar atributos e impor regras de criação
- Se nenhum construtor for declarado, o Java cria um construtor padrão
- Ao criar um construtor com parâmetros, o construtor padrão deixa de existir
- O uso correto de construtores melhora significativamente o design da classe

---

## 83.9 Codigo Completo dessa Aula usando Construtor com Parâmetros

- [Classe Product](../../../workspace/aula083_problema_do_estoque_construtor_com_parametros/src/entities/Product.java)
- [Classe Principal](../../../workspace/aula083_problema_do_estoque_construtor_com_parametros/src/application/Program.java)