# Aula 129 – Composição

**Composição** é um tipo de associação onde um objeto é formado por outros objetos.
É um dos relacionamentos mais importantes na POO porque permite modelar sistemas
reais de forma natural — representando relações do tipo **"tem um"** (`has-a`) ou
**"tem vários"** (`has-many`).

---

## 129.1 Os Três Tipos de Relacionamento

Nem todo "tem um" é igual. O que define o tipo de relação é o **ciclo de vida** dos
objetos envolvidos.

### 129.1.1 Composição — Todo-Parte Forte (◆)

O objeto contido (parte) é uma extensão estrutural do objeto que o contém (todo), compartilhando o mesmo ciclo de vida. Se o contêiner (todo) for destruído, o objeto contido (parte) também será.

Na **UML**, essa relação de composição é representada por um diamante preto (◆)**

```
Order ◆───>* OrderItem
```

Em **Java**, o objeto (parte) costuma ser instanciado com `new` dentro da própria classe "pai" (todo).

> Um `OrderItem` não faz sentido existir fora de um `Order`.

---

### 129.1.2 Agregação — Todo-Parte Fraco (◊)

O objeto **"todo"** referencia a **"parte"**, mas esta possui ciclo de vida independente e pode ser compartilhada entre diferentes instâncias. 

Na **UML**, a agregação é representada por um losango vazio (◊) no lado do **"todo"**, indicando que a **parte** possui ciclo de vida independente. 

```
Order ◊───> Client
```

Em **Java**, a **parte** é instanciada externamente e injetada no **todo** via construtor ou setter, garantindo que sua existência não dependa da classe que a utiliza.

> Um `Client` existe antes e depois do pedido (`Order`) — apagar o pedido não apaga o cliente.

---

### 129.1.3 Associação Simples (→)

Os objetos apenas se "conhecem" para trocar mensagens, sem relação de posse.

Na **UML**, é representada por uma seta simples indicando que os objetos apenas se comunicam, sem vínculo de posse.

```
OrderItem ───> Product
```

Em **Java**, geralmente o objeto é passado como parâmetro de método.

> O item (`OrderItem`)apenas consulta o produto (`Product`) — não o possui nem depende do seu ciclo de vida.

---

## 129.2 Composição no Java

Em **código Java** puro, o "diamante" não aparece explicitamente — a diferença se manifesta no ciclo de vida e em como os objetos são criados e gerenciados. Por isso, o termo **"composição"** é frequentemente usado de forma mais ampla para qualquer relação **"tem um"** ou **"tem vários"**, mesmo que não seja composição forte no sentido estrito da UML.

> 💡 **Dica para identificar o tipo:** "Se eu deletar o objeto principal, o objeto associado deve ser deletado automaticamente?"
> - **Sim** → Composição (◆)
> - **Não** → Agregação (◊) ou Associação (→)

---

### 129.2.1 Exemplo: Order Model

| Relação | Tipo | Ciclo de vida | Decisão de design |
|---|---|---|---|
| `Order` → `OrderItem` | Composição (◆) | `OrderItem` criado dentro do `Order` | O `OrderItem` não existe sem um `Order` |
| `Order` → `Client` | Aggregation (◊) | `Client` pode ser recebido no construtor ou setters | O `Client` existe antes e depois do `Order` |
| `OrderItem` → `Product` | Association (→) | `Product` passado como referência | O `OrderItem` apenas consulta o `Product` |

![uml_entities](../../../imagens/imagem_aula129_uml_entities.png)

---

## 129.3 Impacto Real no Código

A distinção teórica torna-se prática em dois cenários principais:

**Cascateamento (Hibernate/JPA):**

Na **Composição**, usa-se `orphanRemoval = true`. Se o `Order` é deletado, seus `OrderItem` morrem junto no banco.  
Na **Agregação**, o `Client` permanece intacto mesmo se o `Order` for excluído.

**Injeção de Dependência:**

Agregação e Associação permitem que objetos sejam compartilhados sem acoplamento rígido, facilitando testes e manutenção.

---

## 129.4 Prefira Composição à Herança

Um dos princípios mais importantes do design de software é:

> *"Favor Composition over Inheritance"* — prefira composição à herança.

### 129.4.1 Por que a herança é arriscada?

A herança cria um vínculo **estático e permanente** em tempo de compilação. Qualquer
mudança na classe pai afeta todas as filhas — o chamado **problema da fragilidade da
classe base**.

Exemplo: se `Pato` herda de `AnimalQueVoa`, criar um `PatoDeBorracha` (que não voa)
se torna um problema difícil de resolver sem quebrar a hierarquia inteira.

---

### 129.4.2 Por que a composição é superior?

A composição permite **injetar e trocar comportamentos** até mesmo em tempo de
execução (`Runtime`).

**Exemplo — Guerreiro com armas:**

```java
// Herança (rígido): exigiria GuerreiroComEspada, GuerreiroComArco...
// Composição (flexível): a arma é um atributo trocável
guerreiro.setArma(new Espada()); // ataque corpo a corpo
guerreiro.setArma(new Arco());   // troca dinâmica para ataque à distância
```

---

### 129.4.3 Comparação direta

| Característica | Herança (`is-a`) | Composição (`has-a`) |
|---|---|---|
| Vínculo | Estático (fixo no código) | Dinâmico (trocável via setters) |
| Visibilidade | A filha acessa o interior do pai | O todo vê apenas a interface da parte |
| Complexidade | Tende a criar hierarquias gigantes | Mantém classes pequenas e focadas |

---