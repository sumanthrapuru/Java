package com.practice.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        //LocalDate LocalTime LocalDateTime(all are immutable)
        //Instant, Duration, Period

        System.out.println(LocalDate.now());//2021-07-09
        System.out.println(LocalTime.now());//01:16:27.465566700
        System.out.println(LocalDateTime.now());//2021-07-09T02:00:09.405150600

        //static factory methods LocalDate LocalTime LocalDateTime
        LocalDate.of(1999, 1, 1);
        LocalDate milleniaEndDate = LocalDate.ofYearDay(1999, 365);//last day of the year dec 31
        System.out.println(milleniaEndDate);//1999-12-31
        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().minusDays(1);
        System.out.println("(localDate2.isBefore(localDate) "+localDate2.isBefore(localDate));
        LocalDate.ofYearDay(2020, 1).isLeapYear();
        localDate
                //.getMonth();
                //.getMonthValue();
                //.getDayOfMonth();
                .getDayOfYear();

        System.out.println(localDate.get(ChronoField.DAY_OF_YEAR));

        //modifying localdate
        localDate.plusDays(2);
        localDate.plusMonths(3);
        localDate.minusDays(5);
        localDate.withYear(2019);
        localDate.with(ChronoField.YEAR, 2020);
        localDate.with(TemporalAdjusters.firstDayOfMonth());
        localDate.minus(1, ChronoUnit.DAYS);
        //localDate.minus(1, ChronoUnit.MINUTES);//UnsupportedTemporalTypeException


        //comparing localDates
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate3 = localDate1.minusDays(10);
        Period diff = localDate3.until(localDate1);
        diff = Period.between(localDate1, localDate3);
        System.out.println(diff.getDays());
        Period.ofDays(10);
        Period.ofMonths(20);



    }
}
