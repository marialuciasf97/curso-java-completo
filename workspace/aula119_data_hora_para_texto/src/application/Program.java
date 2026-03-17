package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());

        System.out.println("=== toString() — formato ISO padrão ===");

        // Se quiser converter um LocalDate para texto no formato ISO 8601
        System.out.println(d04);

        // Se quiser converter um LocalDateTime para texto no formato ISO 8601
        System.out.println(d05);

        // Se quiser converter um Instant para texto no formato ISO 8601 (com Z)
        System.out.println(d06);

        System.out.println();
        System.out.println("=== .format() — formato customizado ===");

        // Se quiser converter um LocalDate para texto em formato brasileiro (dd/MM/yyyy)
        System.out.println(d04.format(fmt1));

        // Se quiser converter um LocalDateTime para texto apenas com data (dd/MM/yyyy)
        System.out.println(d05.format(fmt1));

        // Se quiser converter um LocalDateTime para texto com data e hora (dd/MM/yyyy HH:mm)
        System.out.println(d05.format(fmt2));

        // Se quiser converter um Instant para texto com fuso horário local (dd/MM/yyyy HH:mm)
        System.out.println(fmt3.format(d06));

        System.out.println();
        System.out.println("=== Formatadores prontos da API (ISO_*) ===");

        // Se quiser converter um LocalDateTime para texto usando o formatador ISO pronto
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(fmt4.format(d05));

        // Se quiser converter um Instant para texto usando o formatador ISO_INSTANT pronto
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(fmt5.format(d06));
    }
}