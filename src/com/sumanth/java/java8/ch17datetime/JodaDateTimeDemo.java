package com.sumanth.java.java8.ch17datetime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.TimeZone;

public class JodaDateTimeDemo {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        LocalDate date = LocalDate.now();
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        System.out.format("%d-%d-%d", dd, mm, yy);
        LocalTime time = LocalTime.now();
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int nanoSec = time.getNano();
        System.out.printf("\n%d:%d:%d:%d", h, m, s, nanoSec);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime.of(2021, Month.APRIL, 5, 19, 15, 30);

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);
        System.out.println(zt);

        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(2000, 01, 01);
        Period p = Period.between(bday, today);
        System.out.printf("age is %d years %d months", p.getYears(), p.getMonths());


    }

    static String getDateString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        return sdf.format(new Date(System.currentTimeMillis()));
    }
}
