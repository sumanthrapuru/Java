package com.sumanth.java8.ch35enum;

public class EnumDemo {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);
        for(Day d : Day.values()){
            System.out.println(d);
        }
        switch (day) {
            case MONDAY:
                System.out.println("mon day ");
                break;
            case TUESDAY:
                System.out.println("tue day");
                break;
        }
    }
}

enum Day{
    MONDAY,
    TUESDAY
}