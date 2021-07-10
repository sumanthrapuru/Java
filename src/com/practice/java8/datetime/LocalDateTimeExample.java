package com.practice.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime.of(2018, Month.APRIL, 22, 22, 55, 50);
        LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime.withHour(14));
        localDateTime.get(ChronoField.DAY_OF_MONTH);
        localDateTime.plusHours(12);
        localDateTime.minusDays(15);
        localDateTime.withMonth(12);
        LocalDateTime fromLocalDate = LocalDate.now().atTime(23, 33);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

    }
}
