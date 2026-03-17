# Aula 120 – Convertendo Data-Hora Global para Local

Nesta aula veremos dois conceitos importantes ao trabalhar com datas em Java:

1. Converter um `Instant` (data-hora global) para uma data-hora local
2. Extrair informações de uma data-hora local (dia, mês, ano, hora, minuto)

Essas operações são muito comuns quando dados são **armazenados em UTC** no banco, mas precisam ser **exibidos no fuso do usuário**.

---

## 120.1 Por que Converter Datas Globais?

Um `Instant` representa um instante **global em UTC** — o mesmo valor pode corresponder a horários diferentes dependendo do fuso do usuário:

| Local | Diferença |
|---|---|
| Londres | UTC ±0 |
| Brasil (São Paulo) | UTC −3 |

Por isso, antes de exibir uma data ao usuário, é necessário **convertê-la para o fuso local**.

---

## 120.2 Obtendo Fusos Disponíveis

A classe `ZoneId` permite listar todos os fusos horários disponíveis (mais de 600):

```java
for (String s : ZoneId.getAvailableZoneIds()) {
    System.out.println(s);
}
```

Exemplos de IDs retornados:

```
America/Sao_Paulo
Europe/Lisbon
Europe/London
Asia/Tokyo
America/New_York
```

Esses nomes são usados como parâmetro para `ZoneId.of()`.

---

## 120.3 Convertendo `Instant` para `LocalDate`

```java
Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

// Fuso da máquina (systemDefault)
LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
// Resultado no Brasil (UTC -3): 2022-07-19

// Fuso específico
LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
// Resultado em Portugal (UTC +1): 2022-07-20
```

> **Por que a data muda no Brasil?**
> `01:30 UTC − 3 horas = 22:30 do dia anterior` → a data passa a ser **19 de julho**.
>
> **E em Portugal?**
> `01:30 UTC + 1 hora = 02:30 do mesmo dia` → a data continua sendo **20 de julho**.

---

## 120.4 Convertendo `Instant` para `LocalDateTime`

```java
// Fuso da máquina (Brasil)
LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
// Resultado: 2022-07-19T22:30:26

// Fuso específico (Portugal)
LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
// Resultado: 2022-07-20T02:30:26
```

O mesmo instante global resulta em datas e horários diferentes dependendo do fuso:

| Fuso | Resultado |
|---|---|
| Brasil (UTC −3) | 19/07 às 22:30 |
| Portugal (UTC +1) | 20/07 às 02:30 |

---

## 120.5 Extraindo Informações de uma Data

Após converter para data local, é possível extrair partes específicas com os métodos `get`:

```java
LocalDate d04 = LocalDate.parse("2022-07-20");

d04.getDayOfMonth(); // 20
d04.getMonthValue(); // 7
d04.getYear();       // 2022
```

```java
LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

d05.getHour();   // 1
d05.getMinute(); // 30
```

### Métodos de extração

| Método | Retorna |
|---|---|
| `getDayOfMonth()` | Dia do mês |
| `getMonthValue()` | Mês (número) |
| `getYear()` | Ano |
| `getHour()` | Hora |
| `getMinute()` | Minuto |

---

## 120.6 Resumo

| Operação | Método |
|---|---|
| Converter `Instant` para data local | `LocalDate.ofInstant(instant, zoneId)` |
| Converter `Instant` para data e hora local | `LocalDateTime.ofInstant(instant, zoneId)` |
| Usar fuso da máquina | `ZoneId.systemDefault()` |
| Usar fuso específico | `ZoneId.of("America/Sao_Paulo")` |
| Extrair partes da data | `getDayOfMonth()`, `getMonthValue()`, `getYear()`, `getHour()`, `getMinute()` |

## 120.7 Aplicação no código

[Ir para o código](../../../workspace/aula120_data_hora_global_pra_local/src/application/Program.java)