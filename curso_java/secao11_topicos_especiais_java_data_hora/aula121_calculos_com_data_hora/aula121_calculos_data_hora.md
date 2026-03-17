# Aula 121 – Cálculos com Data-Hora

Nesta aula aprendemos a realizar **operações de cálculo** com datas e horários em Java usando a API `java.time`.

---

## 121.1 Imutabilidade das Classes de Data

As classes da API `java.time` são **imutáveis** — o objeto original nunca é alterado. Operações como soma e subtração sempre **retornam um novo objeto**:

```java
LocalDate localDate = LocalDate.parse("2022-07-20");

LocalDate pastWeekLocalDate = localDate.minusDays(7); // 2022-07-13
LocalDate nextWeekLocalDate = localDate.plusDays(7);  // 2022-07-27

// localDate continua: 2022-07-20
```

> Sempre atribua o resultado a uma nova variável, caso contrário a operação será descartada.

---

## 121.2 Cálculos com `LocalDate`

A classe `LocalDate` possui métodos para adicionar e subtrair períodos diretamente:

| Método | Descrição |
|---|---|
| `plusDays(n)` | Adiciona dias |
| `minusDays(n)` | Subtrai dias |
| `plusWeeks(n)` | Adiciona semanas |
| `minusWeeks(n)` | Subtrai semanas |
| `plusMonths(n)` | Adiciona meses |
| `minusMonths(n)` | Subtrai meses |
| `plusYears(n)` | Adiciona anos |
| `minusYears(n)` | Subtrai anos |

```java
LocalDate localDate = LocalDate.parse("2022-07-20");

LocalDate pastWeekLocalDate = localDate.minusDays(7); // 2022-07-13
LocalDate nextWeekLocalDate = localDate.plusDays(7);  // 2022-07-27
```

---

## 121.3 Cálculos com `LocalDateTime`

`LocalDateTime` herda todos os métodos de `LocalDate` e adiciona operações de **tempo**:

| Método | Descrição |
|---|---|
| `plusHours(n)` | Adiciona horas |
| `minusHours(n)` | Subtrai horas |
| `plusMinutes(n)` | Adiciona minutos |
| `plusSeconds(n)` | Adiciona segundos |

```java
LocalDateTime localDateTime = LocalDateTime.parse("2022-07-20T01:30:00");

LocalDateTime pastWeekLocalDateTime = localDateTime.minusDays(7); // 2022-07-13T01:30
LocalDateTime nextWeekLocalDateTime = localDateTime.plusDays(7);  // 2022-07-27T01:30
```

---

## 121.4 Cálculos com `Instant`

`Instant` não possui métodos diretos como `plusDays()`. Em vez disso, usa os métodos genéricos `plus()` e `minus()` com a enumeração **`ChronoUnit`** para definir a unidade de tempo:

```java
Instant instant = Instant.parse("2022-07-20T01:30:26Z");

Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS); // 2022-07-13T01:30:26Z
Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);  // 2022-07-27T01:30:26Z
```

---

## 121.5 Calculando Duração entre Datas — `Duration`

A classe `Duration` calcula o **tempo decorrido entre dois instantes**. Seus principais métodos de leitura são:

| Método | Retorna |
|---|---|
| `toDays()` | Duração em dias |
| `toHours()` | Duração em horas |
| `toMinutes()` | Duração em minutos |
| `toMillis()` | Duração em milissegundos |

### 121.5.1 Com `LocalDateTime`

```java
Duration durationLocalDateTime = Duration.between(pastWeekLocalDateTime, localDateTime);
System.out.println(durationLocalDateTime.toDays()); // 7
```

### 121.5.2 Com `Instant`

```java
Duration durationInstant = Duration.between(pastWeekInstant, instant);
System.out.println(durationInstant.toDays()); // 7
```

### 125.5.3 Com `LocalDate` — atenção ⚠️

`LocalDate` não possui informação de horário, então `Duration.between()` lança uma exceção se usado diretamente:

```java
Duration durationLocalDate = Duration.between(pastWeekLocalDate, localDate); // ❌ UnsupportedTemporalTypeException
```

A solução é converter para `LocalDateTime` usando `.atStartOfDay()`, que define o horário como `00:00` do dia:

```java
Duration durationLocalDate = Duration.between(
    pastWeekLocalDate.atStartOfDay(),
    localDate.atStartOfDay()
);
System.out.println(durationLocalDate.toDays()); // 7
```

---

## 121.6 Resultado Negativo em `Duration`

Se a **data inicial for posterior à data final**, o resultado será negativo:

```java
Duration durationNegative = Duration.between(instant, pastWeekInstant);
System.out.println(durationNegative.toDays()); // -7
```

> `Duration.between(inicio, fim)` — se `inicio > fim`, o resultado é negativo.

---

## 121.7 Resumo

| Classe | Como calcular |
|---|---|
| `LocalDate` | `plusDays()`, `minusDays()`, `plusMonths()`... |
| `LocalDateTime` | Mesmos métodos + `plusHours()`, `plusMinutes()`... |
| `Instant` | `plus(n, ChronoUnit.X)` / `minus(n, ChronoUnit.X)` |
| `Duration` | `Duration.between(inicio, fim)` |
| `LocalDate` com `Duration` | Converter com `.atStartOfDay()` antes |

## 121.8 Aplicação no código

[ir para o código](../../../workspace/aula121_calculos_data_hora/src/application/Program.java)