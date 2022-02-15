package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93_DataJava8 {

    public static void main(String[] args) {

        // LocalDate
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2019, 2, 1)); //setando data
        System.out.println(LocalDate.parse("2020-02-01")); //setando data

        System.out.println(agora.plusDays(30)); //adicionando 30 dias

        System.out.println(agora.minus(1, ChronoUnit.MONTHS)); //diminuindo 1 mês

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());

        System.out.println(LocalDate.parse("2020-02-01").isLeapYear()); //ano bissexto

        System.out.println("-----------------------------");

        // hora formato ISO
        //LocalTime
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        System.out.println(LocalTime.of(20, 18)); //setando hora
        System.out.println(LocalTime.parse("20:18")); //setando hora

        System.out.println(hAgora.plusMinutes(50)); //adicionando 50 minutos
        System.out.println(hAgora.minus(40, ChronoUnit.MINUTES)); //diminuindo 40 minutos

        System.out.println(hAgora.getHour());
        System.out.println(hAgora.getMinute());
        System.out.println(hAgora.getSecond());

        System.out.println("-----------------------------");


        // data completa = data + hora
        //LocalDateTime
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
        System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));
        System.out.println(agoraCompleto.plusYears(20));

        System.out.println("-----------------------------");

        //ZoneId
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();
//		for (String f : fusos) {
//			System.out.println(f);
//		}

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp);
        System.out.println(zdt);
        System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetdt);

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(ldtDate);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
    }
}
