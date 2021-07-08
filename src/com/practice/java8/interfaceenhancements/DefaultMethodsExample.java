package com.practice.java8.interfaceenhancements;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "world", "whats", "up");
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        StudentDataBase.getAllStudents()
//                .sort(Comparator.comparing(Student::getName));
                .sort(Comparator.comparing(Student::getGradeLevel).thenComparingDouble(Student::getGpa));

        //nullsFirst nullsLast
        Comparator<Student> studentComparator = Comparator.nullsFirst((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));

    }
}
