package com.practice.java8.optional;

import com.practice.java8.data.Bike;
import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalCreationExample {
    public static Optional<String> getPassionOpt(String passion) {
        return Optional.ofNullable(passion);
    }

    public static void main(String[] args) {
        Optional<String> nameOpt = Optional.of("sumanth");
        Optional<String> hobbyOpt = Optional.empty();
        Optional<String> passionOpt = getPassionOpt(null);

        String name = nameOpt.orElseThrow(() -> new RuntimeException("name can not be empty"));
        String hobby = hobbyOpt.map(String::toUpperCase).orElse("no hobby");
        String passion = passionOpt.orElseGet(() -> "no passion as of " + LocalDate.now());

        System.out.println(hobby);
        System.out.println(passion);

        if (nameOpt.isPresent()) {
            System.out.println(nameOpt.get());
        }
        //accepts consumer
        nameOpt.ifPresent(System.out::println);

        Optional<Student> studentOpt = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOpt.filter(student -> student.getGpa() >= 3.5)
                .map(Student::getName)
                .ifPresent(System.out::println);

        Optional<String> studentBikeName =
                StudentDataBase.getOptionalStudent()
                        .flatMap(Student::getBike)
                        .map(Bike::getName);
    }
}
