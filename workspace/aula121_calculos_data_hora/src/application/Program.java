package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

    public static void main(String[] args) {

        LocalDate localDate           = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTime   = LocalDateTime.parse("2022-07-20T01:30:00");
        Instant instant               = Instant.parse("2022-07-20T01:30:26Z");

        // ============================================================
        // 1. IMUTABILIDADE — o objeto original nunca é alterado
        // ============================================================

        // Se quiser subtrair 7 dias de um LocalDate (gera um novo objeto)
        LocalDate pastWeekLocalDate = localDate.minusDays(7);
        System.out.println("LocalDate original:  " + localDate);
        System.out.println("LocalDate -7 dias:   " + pastWeekLocalDate);

        // Se quiser adicionar 7 dias a um LocalDate (gera um novo objeto)
        LocalDate nextWeekLocalDate = localDate.plusDays(7);
        System.out.println("LocalDate +7 dias:   " + nextWeekLocalDate);

        System.out.println();

        // ============================================================
        // 2. CÁLCULOS COM LocalDateTime
        // ============================================================

        // Se quiser subtrair 7 dias de um LocalDateTime
        LocalDateTime pastWeekLocalDateTime = localDateTime.minusDays(7);
        System.out.println("LocalDateTime -7 dias:  " + pastWeekLocalDateTime);

        // Se quiser adicionar 7 dias a um LocalDateTime
        LocalDateTime nextWeekLocalDateTime = localDateTime.plusDays(7);
        System.out.println("LocalDateTime +7 dias:  " + nextWeekLocalDateTime);

        // Se quiser adicionar 3 horas a um LocalDateTime
        LocalDateTime plusThreeHoursLocalDateTime = localDateTime.plusHours(3);
        System.out.println("LocalDateTime +3 horas: " + plusThreeHoursLocalDateTime);

        // Se quiser subtrair 30 minutos de um LocalDateTime
        LocalDateTime minusThirtyMinutesLocalDateTime = localDateTime.minusMinutes(30);
        System.out.println("LocalDateTime -30 min:  " + minusThirtyMinutesLocalDateTime);

        System.out.println();

        // ============================================================
        // 3. CÁLCULOS COM Instant (usa ChronoUnit)
        // ============================================================

        // Se quiser subtrair 7 dias de um Instant usando ChronoUnit
        Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
        System.out.println("Instant -7 dias: " + pastWeekInstant);

        // Se quiser adicionar 7 dias a um Instant usando ChronoUnit
        Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);
        System.out.println("Instant +7 dias: " + nextWeekInstant);

        System.out.println();

        // ============================================================
        // 4. CALCULANDO DURAÇÃO ENTRE DATAS — Duration
        // ============================================================

        // Se quiser calcular a duração em dias entre dois LocalDateTime
        Duration durationLocalDateTime = Duration.between(pastWeekLocalDateTime, localDateTime);
        System.out.println("Duração (LocalDateTime) em dias:  " + durationLocalDateTime.toDays());
        System.out.println("Duração (LocalDateTime) em horas: " + durationLocalDateTime.toHours());

        // Se quiser calcular a duração em dias entre dois Instant
        Duration durationInstant = Duration.between(pastWeekInstant, instant);
        System.out.println("Duração (Instant) em dias:        " + durationInstant.toDays());

        // Se quiser calcular a duração entre dois LocalDate
        // É necessário converter para LocalDateTime com atStartOfDay() antes
        Duration durationLocalDate = Duration.between(
                pastWeekLocalDate.atStartOfDay(),
                localDate.atStartOfDay()
        );
        System.out.println("Duração (LocalDate) em dias:      " + durationLocalDate.toDays());

        System.out.println();

        // ============================================================
        // 5. DURAÇÃO NEGATIVA — quando inicio é posterior ao fim
        // ============================================================

        // Se a data inicial for maior que a data final, o resultado será negativo
        Duration durationNegative = Duration.between(instant, pastWeekInstant);
        System.out.println("Duração negativa (Instant) em dias: " + durationNegative.toDays());
    }
}