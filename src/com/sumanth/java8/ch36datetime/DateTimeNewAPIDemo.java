package com.sumanth.java8.ch36datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeNewAPIDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate.of(2020, Month.MARCH, 1);
        LocalDate.of(2020,3, 1);
        LocalTime.of(9, 0, 0);
        LocalDateTime.of(2020, 1, 1, 9, 0, 0);
        LocalDateTime.of(localDate, localTime);

        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);

        localDate.plusDays(2);
        localDate.withYear(2020);
        localDateTime.minusDays(10).minusHours(12);//chaining


    }
}
