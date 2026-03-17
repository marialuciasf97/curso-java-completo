# Aula 119 – Convertendo Data-Hora para Texto

Esta aula aborda o **processo inverso** da aula anterior:

| Aula 118 | Aula 119 |
|---|---|
| Texto → objeto de data/hora | Objeto de data/hora → texto |

Isso é necessário principalmente para **exibir datas ao usuário**, já que o formato interno do Java nem sempre é o mais legível.

---

## 119.1 Formato Padrão — `toString()`

Ao imprimir qualquer objeto da API `java.time` com `System.out.println()`, o Java chama `.toString()` automaticamente, que retorna a data no **formato ISO 8601**:

```java
System.out.println(d04);        // equivalente a d04.toString()
```

| Tipo | Formato gerado | Exemplo |
|---|---|---|
| `LocalDate` | `yyyy-MM-dd` | `2022-07-20` |
| `LocalDateTime` | `yyyy-MM-ddTHH:mm:ss` | `2022-07-20T01:30:26` |
| `Instant` | `yyyy-MM-ddTHH:mm:ssZ` | `2022-07-20T01:30:26Z` |

---

## 119.2 Formatação Customizada — `DateTimeFormatter`

Para exibir datas em **outros formatos**, usa-se a classe `DateTimeFormatter`. O método `.ofPattern()` recebe uma string que descreve o formato desejado:

```java
DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
```

| Código | Significado |
|---|---|
| `dd` | Dia |
| `MM` | Mês |
| `yyyy` | Ano |
| `HH` | Hora (0–23) |
| `mm` | Minutos |

### 119.2.1 Formatando `LocalDate`

As duas formas abaixo são equivalentes — escolha a que preferir:

```java
LocalDate d04 = LocalDate.parse("2022-07-20");

System.out.println(d04.format(fmt1));  // Forma 1 — mais comum
System.out.println(fmt1.format(d04));  // Forma 2 — via formatter
// Saída: 20/07/2022
```

### 119.2.2 Formatando `LocalDateTime`

```java
DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

System.out.println(d05.format(fmt1)); // Saída: 20/07/2022
System.out.println(d05.format(fmt2)); // Saída: 20/07/2022 01:30
```

> O objeto `d05` é sempre o mesmo — apenas o **texto gerado** muda de acordo com o formatter utilizado.

---

## 119.3 Formatando `Instant` — Atenção ao Fuso Horário

Um `Instant` representa um instante **global em UTC** e **não possui fuso horário local**. Por isso, tentar formatá-lo diretamente com `fmt2` lança uma exceção:

```java
fmt2.format(d06); // ❌ UnsupportedTemporalTypeException
```

Para formatar um `Instant`, é obrigatório definir um fuso horário usando `.withZone()`:

```java
DateTimeFormatter fmt3 = DateTimeFormatter
    .ofPattern("dd/MM/yyyy HH:mm")
    .withZone(ZoneId.systemDefault()); // usa o fuso do computador do usuário

Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
System.out.println(fmt3.format(d06)); // Saída: 19/07/2022 22:30
```

> O resultado mudou porque o Brasil está **3 horas atrás do UTC** — o que era `20/07 às 01:30 UTC` se torna `19/07 às 22:30` no horário local.

---

## 119.4 Formatadores Prontos da API

A classe `DateTimeFormatter` também oferece **constantes prontas**, sem necessidade de definir um padrão manualmente:

```java
// Para LocalDateTime
DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
System.out.println(fmt4.format(d05)); // Saída: 2022-07-20T01:30:26

// Para Instant
DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
System.out.println(fmt5.format(d06)); // Saída: 2022-07-20T01:30:26Z
```

---

## 119.5 Resumo

| Método | Quando usar |
|---|---|
| `toString()` / `println()` | Exibição rápida no formato ISO padrão |
| `.format(DateTimeFormatter)` | Formatar em qualquer padrão customizado |
| `DateTimeFormatter.ofPattern()` | Criar um formato personalizado |
| `.withZone(ZoneId)` | **Obrigatório** ao formatar um `Instant` |
| `DateTimeFormatter.ISO_*` | Formatadores prontos da própria API |

## 119.6 Aplicação no código

[Ir para o código](../../../workspace/aula119_data_hora_para_texto/src/application/Program.java)