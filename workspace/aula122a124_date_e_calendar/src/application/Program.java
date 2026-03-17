package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        // ============================================================
        // 1. INSTANCIANDO DATAS
        // ============================================================

        // Se quiser obter a data e hora atuais do sistema
        Date dateNow = new Date();
        System.out.println("Data atual: " + sdf2.format(dateNow));

        // Se quiser obter a data atual usando milissegundos do sistema (equivalente ao anterior)
        Date dateCurrentMillis = new Date(System.currentTimeMillis());
        System.out.println("Data via currentTimeMillis: " + sdf2.format(dateCurrentMillis));

        // Se quiser criar uma data a partir do Epoch (01/01/1970 00:00:00 UTC)
        // No Brasil (UTC -3) será exibido como 31/12/1969 21:00:00
        Date dateEpoch = new Date(0L);
        System.out.println("Epoch (UTC -3): " + sdf2.format(dateEpoch));

        // Se quiser criar uma data com um cálculo de milissegundos (5 horas após o Epoch)
        Date dateFiveHoursAfterEpoch = new Date(1000L * 60 * 60 * 5);
        System.out.println("5h após o Epoch: " + sdf2.format(dateFiveHoursAfterEpoch));

        System.out.println();

        // ============================================================
        // 2. CONVERTENDO STRING → DATE (SimpleDateFormat)
        // ============================================================

        // Se quiser converter uma String com apenas data para um objeto Date
        Date dateFromStringDate = sdf1.parse("25/06/2018");
        System.out.println("String -> Date (só data): " + sdf2.format(dateFromStringDate));

        // Se quiser converter uma String com data e hora para um objeto Date
        Date dateFromStringDateTime = sdf2.parse("25/06/2018 15:42:07");
        System.out.println("String -> Date (data e hora): " + sdf2.format(dateFromStringDateTime));

        System.out.println();

        // ============================================================
        // 3. CONVERTENDO ISO 8601 → DATE (via Instant)
        // ============================================================

        // Se quiser converter uma String no formato ISO 8601 para um objeto Date
        Date dateFromIso = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("ISO 8601 -> Date (fuso local): " + sdf2.format(dateFromIso));

        System.out.println();

        // ============================================================
        // 4. CONTROLANDO FUSO HORÁRIO NA EXIBIÇÃO
        // ============================================================

        // Se quiser exibir a data no fuso UTC (GMT), independente do fuso da máquina
        System.out.println("Data em UTC (GMT): " + sdf3.format(dateFromIso));

        // Se quiser ver a diferença entre a impressão padrão do Java e a formatada
        System.out.println("Impressão padrão do Java: " + dateFromIso);
        System.out.println("Impressão formatada: " + sdf2.format(dateFromIso));

        System.out.println();

        // ============================================================
        // 5. MANIPULANDO DATE COM CALENDAR
        // ============================================================

        Date dateCalendar = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        Calendar cal = Calendar.getInstance();

        // Se quiser associar um objeto Date ao Calendar para poder manipulá-lo
        cal.setTime(dateCalendar);

        // Se quiser adicionar 4 horas à data
        cal.add(Calendar.HOUR_OF_DAY, 4);
        dateCalendar = cal.getTime();
        System.out.println("Date após +4 horas: " + sdf2.format(dateCalendar));

        // Se quiser subtrair 10 dias da data
        cal.add(Calendar.DAY_OF_MONTH, -10);
        dateCalendar = cal.getTime();
        System.out.println("Date após -10 dias: " + sdf2.format(dateCalendar));

        // Se quiser adicionar 2 meses à data
        cal.add(Calendar.MONTH, 2);
        dateCalendar = cal.getTime();
        System.out.println("Date após +2 meses: " + sdf2.format(dateCalendar));

        System.out.println();

        // ============================================================
        // 6. EXTRAINDO PARTES DA DATA COM CALENDAR
        // ============================================================

        // Se quiser extrair os minutos da data
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("Minutos: " + minutes);

        // Se quiser extrair a hora da data
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hora:    " + hour);

        // Se quiser extrair o dia do mês da data
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Dia:     " + day);

        // Se quiser extrair o mês da data
        // Atenção: Calendar.MONTH começa em 0 (janeiro = 0), por isso somamos 1
        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println("Mês:     " + month);

        // Se quiser extrair o ano da data
        int year = cal.get(Calendar.YEAR);
        System.out.println("Ano:     " + year);
    }
}