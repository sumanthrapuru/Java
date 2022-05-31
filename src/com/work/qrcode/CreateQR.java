package com.work.qrcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class CreateQR {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(simpleDateFormat.parse("2023-05-11"));

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println(simpleDateFormat2.parse("2023-05-11"));

        System.out.println(LocalDateTime.now());
        System.out.println(System.currentTimeMillis());


    }
}
