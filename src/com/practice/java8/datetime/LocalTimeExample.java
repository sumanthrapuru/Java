package com.practice.java8.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime.of(20, 30, 55);
        localTime.getHour();
        localTime.getMinute();
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay());

        //modify local time
        localTime.minusHours(15);
        localTime.minus(2, ChronoUnit.HOURS);
        localTime.with(LocalTime.MIDNIGHT);
        localTime.with(ChronoField.HOUR_OF_DAY, 22);
        localTime.plusMinutes(30);
        localTime.withHour(10);

        //Duration.of overloaded methods
        Duration.ofHours(3);
        Duration.between(LocalTime.of(20, 20), LocalTime.of(22, 22));
        localTime.until(localTime.minusHours(10), ChronoUnit.MINUTES);

    }
}
