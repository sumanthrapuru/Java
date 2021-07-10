package com.practice.java8.datetime;

import java.time.*;
import java.util.Date;

public class ConvertingBWDatesExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(5)));

        Date date = new Date();
        ZonedDateTime zonedDateTime1 = date.toInstant().atZone(ZoneId.systemDefault());
        LocalDate localDate = zonedDateTime1.toLocalDate();

    }
}
