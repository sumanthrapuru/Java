package com.practice.java8.datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Instant instant2 = Instant.now();
        Duration.between(instant, instant2);
        System.out.println(instant.getEpochSecond());
        Instant.ofEpochSecond(0);


    }
}
