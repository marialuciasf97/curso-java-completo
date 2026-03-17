# Aulas 122, 123 e 124 – Date e Calendar (Sistema Legado)

> ⚠️ **Aviso** estas aulas são **referência opcional** para quem precisar trabalhar com sistemas legados em Java anteriores à versão 8. Para projetos novos, utilize sempre `java.time`.

---

# Aula 123 – Trabalhando com Datas (`Date`)

A classe `Date` pertence ao pacote `java.util` e é o modelo **mais antigo** de representação de datas no Java.

---

## 123.1 Como o `Date` Armazena uma Data

Um objeto `Date` **não armazena** dia, mês, ano, hora ou minuto diretamente. Na verdade, ele armazena:

```
Número de milissegundos desde 01/01/1970 00:00:00 UTC
```

Esse momento de referência é chamado de **Epoch** (Unix Time).

> O Java armazena a data em **UTC**, mas a **exibição** depende do fuso horário da máquina. No Brasil (UTC −3), o Epoch (`0`) é exibido como `31/12/1969 21:00:00`.

---

## 123.2 Instanciando Datas

```java
// Data e hora atuais
Date x1 = new Date();

// Usando milissegundos atuais (equivalente ao anterior)
Date x2 = new Date(System.currentTimeMillis());

// Epoch (01/01/1970 00:00:00 UTC) — exibe 31/12/1969 21:00:00 no Brasil
Date x3 = new Date(0L);

// 5 horas após o Epoch: 1000ms * 60s * 60min * 5h
Date x4 = new Date(1000L * 60 * 60 * 5);
```

---

## 123.3 Convertendo ISO 8601 → `Date`

O formato padrão ISO 8601 para `Date` é:

```
yyyy-MM-dd'T'HH:mm:ss'Z'
```

Para converter, usa-se `Instant`:

```java
Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
```

---

## 123.4 Classe `SimpleDateFormat`

A classe `java.text.SimpleDateFormat` é usada para **converter entre `Date` e `String`**.

### Símbolos de formatação

| Símbolo | Significado |
|---|---|
| `dd` | Dia |
| `MM` | Mês |
| `yyyy` | Ano |
| `HH` | Hora |
| `mm` | Minuto |
| `ss` | Segundo |

### 123.4.1 Convertendo `String` → `Date`

O método `.parse()` pode lançar `ParseException`, por isso é necessário declarar `throws ParseException`:

```java
SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

Date y1 = sdf1.parse("25/06/2018");           // sem hora → 00:00:00
Date y2 = sdf2.parse("25/06/2018 15:42:07");
```

### 123.4.2 Convertendo `Date` → `String`

```java
System.out.println(sdf2.format(y1)); // 25/06/2018 00:00:00
System.out.println(sdf2.format(y2)); // 25/06/2018 15:42:07
```

---

## 123.5 Controlando o Fuso Horário

Por padrão, o `SimpleDateFormat` usa o fuso da máquina. Para forçar a saída em **UTC**:

```java
SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

System.out.println(sdf3.format(y3)); // 25/06/2018 15:42:07 (UTC)
```

### Comparação: impressão padrão vs formatada

```java
System.out.println(x1);            // Mon Jun 25 16:21:06 BRT 2018
System.out.println(sdf2.format(x1)); // 25/06/2018 16:21:06
```

---

## 123.6 Resumo

| Operação | Como fazer |
|---|---|
| Data atual | `new Date()` |
| A partir do Epoch (ms) | `new Date(milissegundos)` |
| A partir de ISO 8601 | `Date.from(Instant.parse("..."))` |
| A partir de texto | `sdf.parse("...")` — lança `ParseException` |
| Formatar para texto | `sdf.format(date)` |
| Forçar fuso UTC | `sdf.setTimeZone(TimeZone.getTimeZone("GMT"))` |

---
---

# Aula 124 – Manipulando um `Date` com `Calendar`

A classe `java.util.Calendar` resolve as limitações da classe `Date` para **manipulação de datas**, permitindo somar/subtrair unidades de tempo e extrair partes específicas.

---

## 124.1 Convertendo `Date` para `Calendar`

```java
Calendar cal = Calendar.getInstance();
cal.setTime(d); // d é um objeto Date
```

A partir disso, o `Calendar` passa a representar aquela data internamente.

---

## 124.2 Adicionando e Subtraindo Tempo

```java
cal.add(Calendar.FIELD, quantidade);
```

Após modificar, é necessário **atualizar o objeto `Date`**:

```java
d = cal.getTime();
```

### Exemplo: adicionar 4 horas

```java
cal.add(Calendar.HOUR_OF_DAY, 4);
d = cal.getTime();
```

### Constantes disponíveis

| Constante | Significado |
|---|---|
| `Calendar.MINUTE` | Minutos |
| `Calendar.HOUR_OF_DAY` | Horas |
| `Calendar.DAY_OF_MONTH` | Dias |
| `Calendar.MONTH` | Meses |
| `Calendar.YEAR` | Anos |

---

## 124.3 Extraindo Partes da Data

```java
cal.get(Calendar.FIELD);
```

```java
int minutes = cal.get(Calendar.MINUTE);
int hour    = cal.get(Calendar.HOUR_OF_DAY);
int month   = cal.get(Calendar.MONTH);
```

### ⚠️ Atenção: meses começam em 0

| Valor | Mês |
|---|---|
| 0 | Janeiro |
| 1 | Fevereiro |
| ... | ... |
| 5 | Junho |

Para obter o mês no formato convencional, some 1:

```java
int month = 1 + cal.get(Calendar.MONTH);
```

---

## 124.4 Resumo

| Operação | Como fazer |
|---|---|
| Associar `Date` ao `Calendar` | `cal.setTime(d)` |
| Adicionar/subtrair tempo | `cal.add(Calendar.FIELD, n)` |
| Extrair parte da data | `cal.get(Calendar.FIELD)` |
| Recuperar o `Date` atualizado | `d = cal.getTime()` |
| Corrigir mês | `1 + cal.get(Calendar.MONTH)` |

---

## 124.5 Aplicação no código

[Ir para código](../../../workspace/aula122a124_date_e_calendar/src/application/Program.java)

## Observação Final — Boas Práticas

Tanto `Date` quanto `Calendar` são considerados **API legada**. Para projetos novos, utilize sempre:

```
java.time → LocalDate, LocalDateTime, Instant
```

