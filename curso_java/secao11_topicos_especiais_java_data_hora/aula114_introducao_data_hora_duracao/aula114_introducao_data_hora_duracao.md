# Aula 114 – Introdução a Data-Hora e Duração

Antes de utilizar as classes de data e hora em Java, é necessário compreender alguns **conceitos fundamentais** sobre como o tempo é representado em sistemas computacionais.

---

## 114.1 Conceitos Principais

| Conceito | Descrição |
|---|---|
| **Data** | Representa apenas dia, mês e ano |
| **Hora** | Representa um horário específico |
| **Data-hora local** | Data e hora **sem** fuso horário |
| **Data-hora global** | Data e hora **com** fuso horário |
| **Duração** | Tempo decorrido entre dois instantes |

---

## 114.2 Data-Hora Local

Uma **data-hora local** é armazenada **sem informação de fuso horário** — representa apenas a data e o horário em um contexto local, sem indicar em qual região do mundo foi registrada.

```
2022-07-23 14:30
```

### 114.2.1 Quando utilizar

É adequada quando o momento exato **não precisa ser interpretado por usuários de outros fusos horários**. Casos comuns:

- Sistemas utilizados em uma **única região**
- Aplicações **sem dependência de internet**

**Exemplos práticos:**

- **Data de nascimento** → `15/06/2001` — a data é a mesma independentemente da localização
- **Registro de venda local** → `23/07/2022 14:30` — se o sistema opera em uma única loja, o fuso é irrelevante

---

## 114.3 Data-Hora Global

Uma **data-hora global** inclui informação de fuso horário, permitindo que sistemas convertam corretamente o horário para diferentes regiões.

```
2022-07-23T14:30Z
```

| Parte | Significado |
|---|---|
| `2022-07-23` | Data |
| `T` | Separador entre data e hora |
| `14:30` | Horário |
| `Z` | Fuso UTC (Londres) |

### 114.3.1 Conversão entre fusos

O mesmo instante `2022-07-23T14:30Z` é exibido de forma diferente para cada usuário:

| Localização | Horário exibido |
|---|---|
| Londres (UTC) | 14:30 |
| Portugal | 15:30 |
| Brasil | 11:30 |

### 114.3.2 Quando utilizar

É necessária quando o momento exato precisa ser compreendido por pessoas em **diferentes fusos horários**. Exemplos:

- **Eventos online** — uma live às `20:00 (São Paulo)` precisa ser convertida para outros fusos
- **Redes sociais** — o sistema registra o instante exato para exibir *"17 minutos atrás"*
- **Sistemas internacionais** — vendas, logs, transmissões e eventos entre países

---

## 114.4 Duração

A **duração** representa o **tempo decorrido entre dois instantes**.

```
Início:  10/01/2022 20:00
Fim:     11/01/2022 01:00
─────────────────────────
Duração: 5 horas
```

---

## 114.5 Conclusão

> Esses conceitos são a base para entender a API `java.time` (Java 8+), que será utilizada nas próximas aulas para representar datas, manipular horários, converter fusos e calcular durações.