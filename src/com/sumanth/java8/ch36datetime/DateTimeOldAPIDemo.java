package com.sumanth.java8.ch36datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeOldAPIDemo {
    public static void main(String[] args) {
        //old way
        Date date = new Date();
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        cal.set(2015, 1, 1);
        Date date1 = cal.getTime();
        System.out.println(date1);//Sun Feb 01 14:03:10 IST 2015
        cal.add(Calendar.DATE, 2);
        Date date2 = cal.getTime();
        System.out.println(date1.compareTo(date2));
        System.out.println(date1.before(date2));

        GregorianCalendar gcal = new GregorianCalendar(2015, 1, 1);
        System.out.println(gcal.getTime());//time is 00:00:00

        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
        System.out.println(dateFormat.format(date));

        System.out.println(TimeZone.getDefault().getDisplayName());


    }
}
