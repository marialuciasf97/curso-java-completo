package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {
    	 
        // ============================================================
        // 1. CURRENT MOMENT (.now())
        // ============================================================
 
        // Obtém apenas a data atual, sem hora e sem fuso horário
        LocalDate currentDate = LocalDate.now();
        System.out.println("LocalDate.now()     -> " + currentDate);
 
        // Obtém a data e hora atuais, sem fuso horário
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.now() -> " + currentDateTime);
 
        // Obtém o instante global atual, sempre armazenado em UTC
        Instant currentInstant = Instant.now();
        System.out.println("Instant.now()       -> " + currentInstant);
 
        System.out.println();
 
        // ============================================================
        // 2. Texto no formato ISO 8601 (.parse())
        // ============================================================
 
        // Converte uma string de texto ISO 8601 em um objeto de data
        LocalDate dateFromText = LocalDate.parse("2022-07-20");
        System.out.println("LocalDate.parse()     -> " + dateFromText);
 
        // Converte uma string de texto ISO 8601 em um objeto de data e hora
        LocalDateTime dateTimeFromText = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println("LocalDateTime.parse() -> " + dateTimeFromText);
 
        // Converte uma string ISO 8601 com UTC (Z) em um instante global
        Instant instantFromText = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("Instant.parse() (Z)   -> " + instantFromText);
 
        // Converte um texto com deslocamento de fuso horário — o Java converte para UTC automaticamente
        Instant instantWithOffset = Instant.parse("2022-07-20T01:30:26-03:00");
        System.out.println("Instant.parse() (-03) -> " + instantWithOffset);
 
        System.out.println();
 
        // ============================================================
        // 3. Texto em formato customizado (DateTimeFormatter)
        // ============================================================
 
        // Define um formatter customizado para ler datas no formato brasileiro (dd/MM/yyyy)
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 
        // Converte a string usando o formatter customizado
        LocalDate dateCustom = LocalDate.parse("20/07/2022", fmt1);
        System.out.println("LocalDate  (dd/MM/yyyy)       -> " + dateCustom);
 
        // Define um formatter customizado para ler data e hora (dd/MM/yyyy HH:mm)
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
 
        // Converte a string de data e hora usando o formatter customizado
        LocalDateTime dateTimeCustom = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println("LocalDateTime (dd/MM/yyyy HH:mm) -> " + dateTimeCustom);
 
        System.out.println();
 
        // ============================================================
        // 4. Instanciando a partir de valores separados (.of())
        // ============================================================
 
        // Cria uma data a partir de valores individuais: ano, mês, dia
        LocalDate dateOf = LocalDate.of(2022, 7, 20);
        System.out.println("LocalDate.of(2022, 7, 20)            -> " + dateOf);
 
        // Cria uma data e hora a partir de valores individuais: ano, mês, dia, hora, minuto
        LocalDateTime dateTimeOf = LocalDateTime.of(2022, 7, 20, 14, 30);
        System.out.println("LocalDateTime.of(2022, 7, 20, 14, 30) -> " + dateTimeOf);
        
    }
}
