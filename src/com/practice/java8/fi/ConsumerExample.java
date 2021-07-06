package com.practice.java8.fi;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    Consumer<String> consumer = s -> System.out.println(s + " i am appended in consumer");
    Consumer<Student> printNameConsumer = student -> System.out.print(student.getName() + " ");
    Consumer<Student> printActivitiesConsumer = student -> System.out.print(student.getName() + " ");

    void printNames() {
        StudentDataBase.getAllStudents().forEach(printNameConsumer);
    }

    void printNameAndActivities() {
        StudentDataBase.getAllStudents().forEach(student -> {
            printNameConsumer.andThen(printActivitiesConsumer).accept(student);
        });
    }

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + i);
        biConsumer.accept("Java", 8);

        BiConsumer<Integer, Integer> multiply = (i1, i2) -> System.out.println(i1 * i2);
        BiConsumer<Integer, Integer> divide = (i1, i2) -> System.out.println(i1 / i2);
        multiply.andThen(divide).accept(10, 5);

        BiConsumer<String, List<String>> printNameAndActivities = (s, act) -> {
            System.out.println(s + " : " + act);
        };
        StudentDataBase.getAllStudents().forEach(stu -> printNameAndActivities.accept(stu.getName(), stu.getActivities()));
    }
}
