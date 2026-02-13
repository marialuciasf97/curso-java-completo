# Aula 088 – Modificadores de Acesso

Nesta aula estudamos os **modificadores de acesso** em Java.

Eles definem **onde um atributo ou método pode ser acessado**, sendo fundamentais para aplicar corretamente o **encapsulamento**.

Os quatro níveis de acesso são:

- `private`
- (default) — sem modificador
- `protected`
- `public`

---

## 88.1 private

Um membro declarado como `private`:

- Só pode ser acessado **dentro da própria classe**
- Não pode ser acessado por nenhuma outra classe

**Exemplo**

```java
public class Product {

    private String name;
    private double price;
}
```

Se tentarmos acessar `name` em outra classe:

```java
Product p = new Product();
p.name = "TV"; // ERRO
```

O compilador indicará que o atributo **não é visível**, pois é `private`.

**Uso comum**:
Atributos quase sempre devem ser `private`, garantindo controle via métodos públicos.

---

## 88.2 Sem modificador (default)

Quando nenhum modificador é declarado:

```java
String name;
```

O membro terá acesso **restrito ao mesmo pacote**.

Ou seja:

- ✔ Acessível na própria classe
- ✔ Acessível por outras classes do mesmo pacote
- ✖ Não acessível por classes de outro pacote

**Exemplo prático**

Suponha:

- `Product` está no pacote `entities`
- `Program` está no pacote `application`

Mesmo sem `private`, o atributo não poderá ser acessado de `Program`, pois está em **outro pacote**.

Por outro lado, se criarmos outra classe no **mesmo pacote** `entities`, o acesso será permitido.

---

## 88.3 protected

O modificador `protected` permite acesso:

- ✔ Na própria classe
- ✔ Em outras classes do mesmo pacote
- ✔ Em subclasses (mesmo que estejam em outro pacote)

O conceito de subclasse envolve **herança**, que será estudada mais adiante.

Por enquanto, basta registrar:

> `protected` amplia o acesso para classes do mesmo pacote e para subclasses.

---

## 88.4 public

Um membro `public` pode ser acessado:

- ✔ Por qualquer classe
- ✔ Em qualquer pacote

Exemplo:

```java
public String getName() {
    return name;
}
```

O método poderá ser utilizado livremente por outras classes.

**Observação sobre módulos**  
Em sistemas com módulos (Java Module System), um membro `public` só poderá ser acessado externamente se o pacote estiver exportado pelo módulo.

Esse conceito será aprofundado posteriormente.

---

## 88.5 Resumo Comparativo

| Modificador | Mesma Classe | Outra classe <br> mesmo pacote | Subclasse em <br> outro pacote | Classe não relacionada <br> em outro pacote | Outro módulo <br> (pacote não exportado) |
| ----------- | ------------ | ------------------------- | ------------------------- | -------------------------------------- | ----------------------------------- |
| `private`   | ✔            | ✖                         | ✖                         | ✖                                      | ✖                                   |
| default     | ✔            | ✔                         | ✖                         | ✖                                      | ✖                                   |
| `protected` | ✔            | ✔                         | ✔                         | ✖                                      | ✖                                   |
| `public`    | ✔            | ✔                         | ✔                         | ✔                                      | ✖                                   |

---

## 88.6 Relação com Encapsulamento

A escolha do modificador define o **nível de proteção da classe**.

Boa prática em orientação a objetos:

- Atributos → `private`
- Métodos que definem comportamento externo → `public`
- `protected` → quando há necessidade de herança
- Evitar uso excessivo de acesso default

O modificador é uma decisão de **design**, não apenas sintaxe.

---