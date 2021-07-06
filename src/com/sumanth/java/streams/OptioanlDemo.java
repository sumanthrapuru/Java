package com.sumanth.java.streams;

import java.util.Optional;

public class OptioanlDemo {
    public static void main(String[] args) {
        Optional<String> petNameOpt = Optional.empty();
        System.out.println(petNameOpt);
        //petNameOpt = Optional.of(null);//NPE
        petNameOpt = Optional.ofNullable(null);
        System.out.println(petNameOpt);
        System.out.println(petNameOpt.isPresent());//false
//        System.out.println(petNameOpt.get());//CE NoSuchElementException
        System.out.println(petNameOpt.orElse("jerry"));
        petNameOpt = Optional.ofNullable("tommy");
        System.out.println(petNameOpt);
        System.out.println(petNameOpt.isPresent());//true
        System.out.println(petNameOpt.get());
        petNameOpt.orElseGet(() -> "supplier res");

        Person p = new Person(Optional.ofNullable(new Passport(Optional.ofNullable(new Stamp("Indian Stamp")))));

        String stampOfCountry = p.passport.flatMap(pt -> pt.stamp.map(s -> s.stampOfCountry)).orElse("unknown stamp");
        System.out.println(stampOfCountry);
    }
}


class Stamp {
    String stampOfCountry;

    public Stamp(String stampOfCountry) {
        this.stampOfCountry = stampOfCountry;
    }
}

class Passport {
    Optional<Stamp> stamp;

    public Passport(Optional<Stamp> stamp) {
        this.stamp = stamp;
    }
}

class Person {
    Optional<Passport> passport;

    public Person(Optional<Passport> passport) {
        this.passport = passport;
    }
}