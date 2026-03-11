# Aula 115 – Entendendo Timezone (Fuso Horário)

O **fuso horário** define como um determinado horário se relaciona com outros locais do mundo, permitindo que sistemas interpretem corretamente um instante de tempo independentemente da localização do usuário.

---

## 115.1 GMT e UTC — A Referência Global

As duas siglas mais comuns ao estudar fusos horários são **GMT** e **UTC**:

| Sigla | Significado |
|---|---|
| **GMT** | Greenwich Mean Time |
| **UTC** | Coordinated Universal Time |

Ambas representam o **horário base global**, utilizado como referência para converter horários entre regiões.  
Em programação, são tratadas de forma **intercambiável**.

A partir desse ponto de referência, os outros fusos são definidos como **adiantados (+)** ou **atrasados (−)**:

| Local | Fuso |
|---|---|
| Londres | GMT ±0 |
| Portugal | GMT +1 |
| São Paulo | GMT −3 |
| Manaus | GMT −4 |

**Exemplo:** se em Londres são 10:00, então:
- Portugal → **11:00**
- São Paulo → **07:00**
- Manaus → **06:00**

---

## 115.2 Zulu Time (Z)

Em formatos de data-hora, a letra **`Z`** representa o **Zulu Time**, que equivale ao horário UTC.

```
2022-07-23T14:30Z
```

> 23 de julho de 2022 às **14:30 no horário UTC**.

---

## 115.3 Time Zone IDs

Linguagens de programação utilizam **identificadores padronizados** de fusos horários no formato:

```
Region/City
```

Exemplos:

```
America/Sao_Paulo
Europe/Lisbon
America/New_York
Asia/Tokyo
```

Esses IDs são usados pela API `java.time` para realizar **conversões automáticas** entre fusos horários.

---

## 115.4 Por que Timezone Importa

Sem informação de fuso horário, diferentes usuários podem **interpretar o mesmo horário de formas incorretas**.  
Por isso, aplicações modernas armazenam datas utilizando:

- **Data-hora global** com o fuso explícito
- **Instantes baseados em UTC**, convertidos para o fuso local de cada usuário