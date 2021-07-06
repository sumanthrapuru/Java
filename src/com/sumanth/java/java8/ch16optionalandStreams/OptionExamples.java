package com.sumanth.java.java8.ch16optionalandStreams;

import java.util.Optional;

public class OptionExamples {
    public static void main(String[] args) {
        Optional<String> name = Optional.empty();
        name = Optional.ofNullable(null);
        name = Optional.of("sumanth");
        if (name.isPresent()) {
            name.get();
        }
        name.orElse("dummy");
        name.orElseGet(OptionExamples::getDummyString);
    }

    public static String getDummyString(){
        return "dummy";
    }
}
