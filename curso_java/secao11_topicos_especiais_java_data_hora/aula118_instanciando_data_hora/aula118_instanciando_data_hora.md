# Aula 118 – Instanciando Data-Hora em Java

A partir do **Java 8** (2014), a linguagem passou a contar com uma nova API de datas no pacote `java.time`, substituindo o modelo antigo baseado em `Date` e `Calendar` — considerado complexo e propenso a erros.

A API `java.time` é **imutável** (objetos não podem ser alterados após criados), **thread-safe** e **padronizada**, sendo o padrão atual do desenvolvimento Java.

---

## 118.1 Principais Classes

| Classe | Descrição |
|---|---|
| `LocalDate` | Representa apenas uma **data** (ano, mês, dia) — sem hora e sem fuso horário |
| `LocalDateTime` | Representa **data e hora** — sem fuso horário |
| `Instant` | Representa um **instante global** no tempo, sempre armazenado em UTC |
| `Duration` | Representa uma **duração**, ou seja, o tempo decorrido entre dois instantes |
| `ZoneId` | Representa um **fuso horário** (ex: `America/Sao_Paulo`) |
| `ChronoUnit` | Representa **unidades de tempo** para cálculos (dias, horas, meses...) |

---

## 118.2 Formas de Instanciar

### 118.2.1 Momento atual — `.now()`

Usado quando o sistema precisa capturar **o instante exato em que algo acontece** (um pedido, um log, uma transação):

```java
LocalDate d01     = LocalDate.now();      // 2022-07-23
LocalDateTime d02 = LocalDateTime.now();  // 2022-07-23T18:36:48.058
Instant d03       = Instant.now();        // 2022-07-23T21:36:48Z
```

> O `Instant` sempre armazena o horário em **UTC**, independentemente do fuso configurado na máquina. Por isso o resultado aparece com `Z` no final.
>
> Note que `LocalDateTime.now()` retornou `18:36` enquanto `Instant.now()` retornou `21:36` — são o mesmo instante, mas o `Instant` está em UTC (3h à frente do horário de São Paulo).

---

### 118.2.2 Texto ISO 8601 — `.parse()`

Usado quando o sistema recebe uma data como **texto vindo de uma API, banco de dados ou arquivo**, já no formato ISO 8601. O `.parse()` converte essa string em um objeto de data-hora:

```java
LocalDate d04     = LocalDate.parse("2022-07-20");
LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
Instant d06       = Instant.parse("2022-07-20T01:30:26Z");
```

Também é possível passar um texto com **deslocamento de fuso horário** — o Java converte automaticamente para UTC ao criar o `Instant`:

```java
Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
// O Java interpreta o -03:00 e converte o horário para UTC internamente
```

---

### 118.2.3 Texto customizado — `DateTimeFormatter`

Usado quando o texto recebido **não segue o padrão ISO 8601** — por exemplo, dados digitados por usuários ou vindos de sistemas legados. É necessário criar um `DateTimeFormatter` que descreva exatamente qual é o formato do texto:

```java
// Texto no formato brasileiro: dd/MM/yyyy
DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
// Saída: 2022-07-20

// Texto com data e hora: dd/MM/yyyy HH:mm
DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
// Saída: 2022-07-20T01:30
```

> O `DateTimeFormatter` funciona como um "molde" que ensina ao Java como ler aquele texto específico.

---

### 118.2.4 Valores separados — `.of()`

Usado quando os dados chegam **individualmente**, como em campos separados de um formulário (campo de dia, campo de mês, campo de ano). O `.of()` recebe os valores diretamente como parâmetros:

```java
LocalDate d10     = LocalDate.of(2022, 7, 20);            // 2022-07-20
LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30); // 2022-07-20T01:30
// Parâmetros: ano, mês, dia, hora, minuto
```

---

## 118.3 Resumo

| Situação | Método |
|---|---|
| Capturar o momento atual | `.now()` |
| Texto já está em ISO 8601 | `.parse("2022-07-20")` |
| Texto está em outro formato | `.parse("20/07/2022", DateTimeFormatter)` |
| Valores chegam separados | `.of(ano, mês, dia, hora, minuto)` |

> Ao usar `System.out.println()` com qualquer dessas classes, o Java chama `.toString()` automaticamente — que sempre retorna a data no **formato ISO 8601**.

---

## 118.4 Aplicação no código

[Ir para código](../../../workspace/aula118_instanciacao_data_hora/src/application/Program.java)