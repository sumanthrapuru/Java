package com.practice.java8.fi;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> even = i -> i % 2 == 0;
    static Predicate<Integer> divisibleByFive = i -> i % 5 == 0;
    static Predicate<Student> gradeTwoFinishedStudentsPredicate = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> atleast3Point9GpaPredicate = student -> student.getGpa() >= 3.9;
    static BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
    Consumer<Student> consumer = student -> biConsumer.accept(student.getName(), student.getActivities());

    void printNameActivities(List<Student> students) {
        students.forEach(student -> {
//            if (gradeTwoFinishedStudentsPredicate
//                    .and(atleast3Point9GpaPredicate)
//                    .test(student)) {
//                consumer.accept(student);
//            }
            if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
                //consumer.accept(student);
                biConsumer.accept(student.getName(), student.getActivities());
            }
        });
    }

    public static void main(String[] args) {
        System.out.println(even.and(divisibleByFive).test(10));
        System.out.println(even.and(divisibleByFive).test(9));

        even.or(divisibleByFive).test(10);
        even.or(divisibleByFive).negate().test(10);

        new PredicateExample().printNameActivities(StudentDataBase.getAllStudents());
    }
}
