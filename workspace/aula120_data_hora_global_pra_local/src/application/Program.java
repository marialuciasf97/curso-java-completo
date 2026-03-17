package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

    public static void main(String[] args) {

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        // ============================================================
        // 1. LISTANDO FUSOS HORÁRIOS DISPONÍVEIS
        // ============================================================

        // Se quiser ver todos os fusos horários disponíveis no Java
        System.out.println("=== Fusos disponíveis (primeiros 5) ===");
        ZoneId.getAvailableZoneIds()
                .stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println();

        // ============================================================
        // 2. CONVERTENDO Instant PARA LocalDate
        // ============================================================

        // Se quiser converter um Instant para LocalDate usando o fuso da máquina
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("Instant -> LocalDate (fuso da máquina): " + r1);

        // Se quiser converter um Instant para LocalDate usando um fuso específico (Portugal)
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("Instant -> LocalDate (Portugal):        " + r2);
        
        System.out.println();

        // ============================================================
        // 3. CONVERTENDO Instant PARA LocalDateTime
        // ============================================================

        // Se quiser converter um Instant para LocalDateTime usando o fuso da máquina
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("Instant -> LocalDateTime (fuso da máquina): " + r3);

        // Se quiser converter um Instant para LocalDateTime usando um fuso específico (Portugal)
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("Instant -> LocalDateTime (Portugal):        " + r4);
        
        LocalDateTime r9 = LocalDateTime.ofInstant(d06, ZoneId.of("Europe/London"));
        System.out.println("Instant -> LocalDate (London):        " + r9);

        System.out.println();

        // ============================================================
        // 4. EXTRAINDO INFORMAÇÕES DE UM LocalDate
        // ============================================================

        System.out.println("=== Extraindo dados de LocalDate ===");

        // Se quiser extrair o dia do mês de uma data
        System.out.println("Dia:  " + d04.getDayOfMonth());

        // Se quiser extrair o mês de uma data
        System.out.println("Mês:  " + d04.getMonthValue());

        // Se quiser extrair o ano de uma data
        System.out.println("Ano:  " + d04.getYear());

        System.out.println();

        // ============================================================
        // 5. EXTRAINDO INFORMAÇÕES DE UM LocalDateTime
        // ============================================================

        System.out.println("=== Extraindo dados de LocalDateTime ===");

        // Se quiser extrair o dia do mês de uma data com hora
        System.out.println("Dia:    " + d05.getDayOfMonth());

        // Se quiser extrair o mês de uma data com hora
        System.out.println("Mês:    " + d05.getMonthValue());

        // Se quiser extrair o ano de uma data com hora
        System.out.println("Ano:    " + d05.getYear());

        // Se quiser extrair a hora de um LocalDateTime
        System.out.println("Hora:   " + d05.getHour());

        // Se quiser extrair os minutos de um LocalDateTime
        System.out.println("Minuto: " + d05.getMinute());
    }
}