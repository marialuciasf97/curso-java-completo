# Aula 116 – Padrão ISO 8601

O **ISO 8601** é o padrão internacional utilizado para representar **datas e horários em texto**, garantindo que sistemas diferentes interpretem essas informações de forma consistente em qualquer lugar do mundo.

É amplamente adotado em **APIs, bancos de dados, aplicações web, logs e formatos de troca de dados** (JSON, XML, etc.).

---

## 116.1 Formatos do Padrão

| Conceito | Formato | Exemplo |
|---|---|---|
| **Data** | `AAAA-MM-DD` | `2022-07-23` |
| **Data-hora local** | `AAAA-MM-DDTHH:mm` | `2022-07-23T14:52` |
| **Com segundos** | `AAAA-MM-DDTHH:mm:ss` | `2022-07-23T14:52:09` |
| **Com fração de segundos** | `AAAA-MM-DDTHH:mm:ss.SSS` | `2022-07-23T14:52:09.4073` |
| **Data-hora global (UTC)** | `AAAA-MM-DDTHH:mm:ssZ` | `2022-07-23T14:52:09Z` |
| **Data-hora com fuso** | `AAAA-MM-DDTHH:mm:ss-HH:mm` | `2022-07-23T14:52:09-03:00` |

> O **`T`** é o separador entre data e hora. O **`Z`** indica horário UTC (Zulu Time).

---

## 116.2 Detalhes Importantes

### 116.2.1 Data simples
O formato `AAAA-MM-DD` evita ambiguidades comuns entre convenções regionais:

```
23/07/2022   ← DD/MM/AAAA (Brasil)
07/23/2022   ← MM/DD/AAAA (EUA)
2022-07-23   ← ISO 8601 ✔
```

### 116.2.2 Fuso horário com deslocamento

O sufixo `-03:00` indica que o horário está **3 horas atrás do UTC**, como ocorre no horário de São Paulo:

```
2022-07-23T14:52:09-03:00
```