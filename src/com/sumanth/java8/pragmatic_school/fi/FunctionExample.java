package com.sumanth.java8.pragmatic_school.fi;



import com.sumanth.java8.pragmatic_school.data.Student;
import com.sumanth.java8.pragmatic_school.data.StudentDataBase;

import java.util.Locale;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> func = s -> s.toUpperCase(Locale.ROOT);
        System.out.println(func.apply("sumanth"));

        java.util.function.Consumer<Student> studentConsumer = FunctionExample::printStudentActivities;
        StudentDataBase.getAllStudents().forEach(studentConsumer);

    }
    static void printStudentActivities(Student student){
        System.out.println(student.getActivities());
    }
}

interface Function<T, R>{
    R apply(T t);

    default Function<T, R> andThen(Function<R, R> after){
        return t -> after.apply(apply(t));
    }
}