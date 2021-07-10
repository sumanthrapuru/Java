package com.practice.java8.datetime;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.getOffset());
        System.out.println(zonedDateTime.getZone());
        ZoneId.getAvailableZoneIds();
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));
        LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    }
}
