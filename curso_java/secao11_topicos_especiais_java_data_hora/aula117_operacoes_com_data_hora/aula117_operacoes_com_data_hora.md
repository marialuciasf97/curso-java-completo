# Aula 117 – Operações Importantes com Data-Hora

Mais do que conhecer as classes de data-hora, é essencial saber quais **operações são mais comuns** no dia a dia do desenvolvimento — em bancos de dados, APIs, aplicações web e sistemas corporativos.

---

## 117.1 Resumo das Operações

| Operação | Descrição |
|---|---|
| **Instanciar data atual** | Obter o momento atual do sistema |
| **Converter texto → data (ISO 8601)** | Ler datas vindas de APIs ou arquivos |
| **Converter texto → data (formato customizado)** | Interpretar formatos específicos |
| **Criar data a partir de valores separados** | Combinar dia, mês, ano e hora |
| **Formatar data → texto** | Exibir datas para o usuário |
| **Extrair partes da data** | Obter dia, mês, ano, hora, minuto etc. |
| **Converter fuso horário** | Transformar data-hora global em local |
| **Realizar cálculos** | Somar ou subtrair períodos |
| **Calcular duração** | Medir intervalo entre dois instantes |

---

## 117.2 Detalhes de Cada Operação

### 117.2.1 Instanciar data atual
Utilizado sempre que o sistema precisa registrar **quando algo aconteceu** — pedidos, criação de usuários, logs, transações.

---

### 117.2.2 Converter texto em data

**Formato ISO 8601** — o mais comum ao consumir dados de APIs e requisições web:
```
2022-07-23T14:52:09Z
```

**Formato customizado** — presente em sistemas legados, entradas de usuário ou arquivos com formatação própria:
```
23/07/2022
23-07-2022 14:52
```

> Nessas situações, o programa precisa interpretar esse formato customizado e convertê-lo para um objeto de data-hora.

---

### 117.2.3 Instanciar Data-Hora a partir de valores separados

Comum em formulários web onde os campos chegam individualmente:

```
dia | mês | ano | hora (opcional)
```

O sistema combina esses valores para construir um objeto de data-hora.

---

### 117.2.4 Formatar Data-Hora para texto

Processo inverso da conversão — necessário para **exibir datas na interface**, gerar relatórios ou exportar dados. O formato pode ser ISO 8601 ou customizado.

---

### 117.2.5 Extrair partes da data

A partir de um objeto de data-hora, é possível obter partes específicas:

```
2022-07-23T14:52  →  dia: 23 | mês: 07 | ano: 2022 | hora: 14 | minuto: 52
```

---

### 117.2.6 Converter fuso horário (data global → local)

Quando uma data possui **fuso horário**, ela é considerada uma **data-hora global**.

Antes de extrair informações como **dia, mês ou hora**, muitas vezes é necessário **convertê-la para o fuso horário local do usuário**.

Exemplo:

```
2022-07-23T14:30Z
```

| Local | Horário |
|---|---|
| Londres (UTC) | 14:30 |
| Portugal | 15:30 |
| Brasil | 11:30 |

> Para converter, é necessário informar a **data-hora global** e o **timezone do usuário**.

---

### 117.2.7 Cálculos com datas

Adicionar ou subtrair períodos — dias, meses, anos. Muito usado em **prazos, vencimentos e agendamentos**.

```
Fabricação:  10/01/2022
Validade:    + 6 meses
─────────────────────────
Vencimento:  10/07/2022
```

---

### 117.2.8 Calcular duração

Medir o tempo decorrido entre dois instantes — útil para **tempo de execução, relatórios de uso e intervalos entre eventos**.

```
Início:   10/01/2022 20:00
Fim:      11/01/2022 01:00
──────────────────────────
Duração:  5 horas
```

---

## 117.3 Classes da API `java.time`

Essas operações serão implementadas nas próximas aulas com as seguintes classes:

| Classe | Uso |
|---|---|
| `LocalDate` | Data sem hora |
| `LocalDateTime` | Data e hora sem fuso |
| `Instant` | Instante global (UTC) |
| `ZonedDateTime` | Data-hora com fuso horário |
| `Duration` | Duração entre instantes |

## Segue o restante das aulas que abordam java.time
- [Aula 118 - Instanciando data-hora](../../../curso_java/secao11_topicos_especiais_java_data_hora/aula118_instanciando_data_hora/aula118_instanciando_data_hora.md)

- [Aula 119 - Converter data-hora para texto](../../../curso_java/secao11_topicos_especiais_java_data_hora/aula119_data_hora_para_texto/aula119_data_hora_para_texto.md)

- [Aula 120 - Data-hora global para data-hora local](../../../curso_java/secao11_topicos_especiais_java_data_hora/aula120_data_hora_global_para_local/aula120_data_hora_global_para_local.md)

- [Aula 121 - Calculos com data-hora](../../../curso_java/secao11_topicos_especiais_java_data_hora/aula121_calculos_com_data_hora/aula121_calculos_data_hora.md)