package com.practice.java8.streams;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Collections
 * Parallel Operations
 * Arrays
 * IO
 */
public class StreamsBasicsDemo {
    //Stream: sequence of elements
    //fixed data set
    //can't add or modify elements in stream
    //only sequential access(only once)(internal iteration IllegalStateException)
    //lazily constructed


    public static void main(String[] args) {
        Map<String, List<String>> studentActivityMap = StudentDataBase.getAllStudents()
                .stream()
                .peek(s -> System.out.println("all students: "+s.getName()))
                .filter(s -> s.getGpa()>=3.9)
                .peek(s -> System.out.println("gpa >= 3.9 students: "+s.getName()))
                .filter(s -> s.getGradeLevel()>=3)
                .peek(s -> System.out.println("grade >= 3 students: "+s.getName()))
                .map(s -> {
                    return s;
                })
                .peek(s -> System.out.println("after map students: "+s.getName()))
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getActivities
                ));
        System.out.println(studentActivityMap);

    }
}
