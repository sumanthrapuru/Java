package com.practice.java8.datetime;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

    private static final String DATE_FORMAT = "dd-MM-yyyy hh:mm";

    public static void main2(String[] args) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        SimpleDateFormat americaSDF = new SimpleDateFormat(DATE_FORMAT);
        americaSDF.setTimeZone(TimeZone.getTimeZone("America/New_York"));

//        String sDateInAmerica = americaSDF.format(formatter.parse("22-01-2015 10:15:55 AM")); // Convert to String first
        String sDateInAmerica = americaSDF.format(new Date()); // Convert to String first
        Date dateInAmerica = formatter.parse(sDateInAmerica); // Create a new Date object


        System.out.println("Date (New York) (String) : " + sDateInAmerica);
        System.out.println("Date (New York) (Object) : " + formatter.format(dateInAmerica));

    }

    public static void main(String[] args) {
//        System.out.println(new Date());
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//        System.out.println(new Date());
//        String s = formatToIndiaDate(new Date(), "dd/MM/yyyy HH:mm");
//        System.out.println(s);
//
//        String s1 = formatDate(new Date(), "dd MMM yyyy");
//        System.out.println("s1 : "+s1 );

        double amt = 100.0;
        for(int i = 0; i < 12; i++){
            amt = amt * 1.10;
            System.out.println(amt);
        }
    }

    public static String formatDate(Date date, String format) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(format);
        return dateFormatter.format(date);
    }
//12 May 2022
    public static String formatToIndiaDate(Date date, String format) {
        SimpleDateFormat indiaDateFormatter = new SimpleDateFormat(format);
        indiaDateFormatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        return indiaDateFormatter.format(date);
    }

    public static void main4(String[] args) throws ParseException {

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdfIndia = new SimpleDateFormat(DATE_FORMAT);
        sdfIndia.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String dateStringIndia = sdfIndia.format(date);

        System.out.println("dateStringIndia : " + dateStringIndia);


    }

}