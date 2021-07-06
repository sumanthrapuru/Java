package com.practice.java8.methodreference;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.function.*;

public class MethodRefExample {

    public static void main(String[] args) {
        Function<String, Integer> toLengthFunction = s -> s.length();//old way

        //use class name for static method ref


        //instance method ref
        MethodRefExample methodRefExample = new MethodRefExample();
        Function<String, Integer> toLengthFunction3 = methodRefExample::m;
        Consumer<Student> printConsumer = System.out::println;
        Predicate<Student> predicate = new MethodRefExample()::greaterThanLevel3;

        //if instance method is inside input type
        Function<String, Integer> toLengthFunction2 = String::length;
        System.out.println(toLengthFunction2.apply("java8"));
        Consumer<Student> printAllStudents = Student::printListOfActivities;

        //Supplier method reference
        Supplier<Student> studentSupplier = Student::new;
        Function<String, Student> studentFunction = Student::new;
        BiFunction<String, String, Student> studentBiFunction = Student::new;
    }

    int m(String s) {
        return s.length();
    }

    boolean greaterThanLevel3(Student s) {
        return s.getGradeLevel() >= 3;
    }
}
