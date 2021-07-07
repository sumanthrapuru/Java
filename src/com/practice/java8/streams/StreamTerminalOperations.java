package com.practice.java8.streams;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        //collect(Collector)
        //collect is accumulator
        //Collectors.joining()
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
//                .map(Student::getName)
//                .collect(Collectors.joining()));
//                .collect(Collectors.joining("-")));
//                .collect(Collectors.joining("-", "(", ")")));
//                .collect(Collectors.counting()));
//                .collect(Collectors.mapping(String::toUpperCase, Collectors.toSet())));
//                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa))));
//                .collect(Collectors.summingInt(Student::getNoteBooks)));
//                .collect(Collectors.averagingInt(Student::getNoteBooks)));
//                .collect(Collectors.groupingBy(Student::getGender)));//returns map
//                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
//                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"))));
//                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks))));
//                .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks))));
                .collect(Collectors.groupingBy(Student::getName, Collectors.toSet())));

        LinkedHashMap<String, Set<Student>> x = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
        System.out.println(x);

        //calculate top gpa in each grade
        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        Predicate<Student> gpaPredicate = s -> s.getGpa()>=3.8;
        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.toSet()));



    }
}
