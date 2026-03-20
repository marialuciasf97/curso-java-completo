# Aula 125 – Visão Geral do Capítulo: Enumerações e Composição

Nesta aula é apresentada uma **visão geral da Seção 12**, que introduz dois conceitos
fundamentais no desenvolvimento orientado a objetos: **Enumerações (Enums)** e
**Composição de objetos** — amplamente utilizados na modelagem de sistemas reais.

---

## 125.1 Enumerações (Enums)

Enumerações definem um conjunto fixo de valores constantes, evitando o uso de valores
inválidos, melhorando a legibilidade e facilitando a manutenção do código.

**Exemplo:** um sistema de pedidos pode ter os estados `PENDING_PAYMENT`, `PROCESSING`,
`SHIPPED` e `DELIVERED`.

---

## 125.2 Composição de Objetos

A composição é um relacionamento onde um objeto é formado por outros objetos, permitindo
representar sistemas reais de forma mais fiel.

**Exemplo:** um `Order` possui um `Client` e vários `OrderItem`s, cada um associado a
um `Product`.

---

## 125.3 Modelagem de Domínio

Os conceitos acima serão aplicados com apoio de:

- **Diagrama de Classes** – Define a estrutura do sistem (classes e relacionamentos)
- **Diagrama de Objetos** – Mostra instâncias reais e como elas se relacionam na memória

---

## 125.4 Conteúdo da Seção

Neste capítulo, serão abordados:

- Enumerações
- Princípios de design
- Composição
- Exercícios resolvidos
- Uso de StringBuilder
- Exercício de fixação e correção

---