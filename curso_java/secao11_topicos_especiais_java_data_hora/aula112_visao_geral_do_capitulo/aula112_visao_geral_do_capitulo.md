# Aula 112 – Tópicos Especiais em Java: Data e Hora

Embora pareça simples à primeira vista, trabalhar corretamente com **data, hora, fuso horário e duração** envolve diversos detalhes. Por isso, o Java possui uma **API específica** para esse tipo de operação, introduzida a partir do **Java 8**.

---

## 112.1 Objetivo do Capítulo

Ao final desta seção, o objetivo é compreender:

- Como **representar** datas e horários em Java
- Como trabalhar com **instantes globais** e **datas locais**
- Como lidar com **fusos horários** (timezones)
- Como **converter** datas para texto e vice-versa
- Como realizar **operações e cálculos** com datas
- A diferença entre a **API moderna (Java 8+)** e o **modelo antigo**

> Esses conceitos são fundamentais em aplicações que envolvem **registro de eventos**, **sistemas distribuídos**, **logs**, **bancos de dados** e **aplicações web**.

---

## 112.2 Estrutura do Capítulo

O capítulo está dividido em **duas partes**:

### 112.1 Parte 1 — API Moderna: `java.time` (Java 8+)

O pacote `java.time` foi introduzido no **Java 8** para substituir as abordagens antigas, oferecendo:

- Melhor organização
- **Classes imutáveis**
- Maior segurança contra erros
- Suporte completo a fusos horários

**Tópicos abordados:**

- Introdução a data, hora e duração
- Fusos horários (timezone)
- Padrão **ISO 8601**
- Instanciação de objetos de data-hora
- Conversão entre data-hora e texto
- Conversão entre data-hora **global** e **local**
- Cálculos com datas

### 112.2 Parte 2 — Modelo Antigo (pré-Java 8)

Nas ultimas aulas do capítulo será apresentada a forma **legada** de manipular datas em Java, com as classes:

- `Date`
- `Calendar`

> Embora existam alternativas modernas, esse modelo ainda aparece em **sistemas legados** — por isso, conhecê-lo é útil em contextos profissionais.

---

## 112.3 Importância do Capítulo

- Datas e horários estão presentes em **praticamente todos os sistemas reais**
- Operações aparentemente simples podem gerar **erros complexos**, especialmente com fusos horários
- `java.time` é o **padrão moderno** em aplicações Java atuais
- Conhecer `Date` e `Calendar` permite lidar com **código legado**