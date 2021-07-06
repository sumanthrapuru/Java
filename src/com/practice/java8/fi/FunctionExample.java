package com.practice.java8.fi;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.*;

public class FunctionExample {
    static Function<String, String> concatFunction = (str) -> str.concat("default");
    static Function<String, String> upperFunction = (str) -> str.toUpperCase(Locale.ROOT);
    static UnaryOperator<String> upperFunction2 = str -> str.toUpperCase();

    static Function<List<Student>, Map<String, Double>> studentGpaFunction =
            students -> {
                Map<String, Double> map = new HashMap<>();
                students.forEach(student -> map.put(student.getName(), student.getGpa()));
                return map;
            };
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentGpaBiFunction =
            (students, predicate) -> {
                Map<String, Double> map = new HashMap<>();
                students.forEach(student -> {
                    if(predicate.test(student)) {
                        map.put(student.getName(), student.getGpa());
                    }
                });
                return map;
            };
    static BinaryOperator<String> binaryOperator = (str1, str2) -> str1.concat(str2);
    static BinaryOperator<Integer> maxByBinaryOperator =
            BinaryOperator.maxBy((n1, n2) -> n1.compareTo(n2));


    static Map<String, Double> getStudentGpaMap(List<Student> students){
        return studentGpaFunction.apply(students);
    }

    static Map<String, Double> getStudentGpaMapPredicate(List<Student> students){
        return studentGpaBiFunction.apply(students, s -> s.getGradeLevel() >= 3);
    }

    public static void main(String[] args) {
        System.out.println(concatFunction.andThen(upperFunction).apply("java8"));
        System.out.println(concatFunction.compose(upperFunction).apply("java8"));

        System.out.println(getStudentGpaMapPredicate(StudentDataBase.getAllStudents()));

        System.out.println(binaryOperator.apply("java", "8"));

        System.out.println(maxByBinaryOperator.apply(10, 50));
    }
}
