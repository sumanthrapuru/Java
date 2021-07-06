package com.practice.java8.fi;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomIntegerSupplier = () -> random.nextInt();
        Supplier<List<Student>> allStudentSupplier = () -> StudentDataBase.getAllStudents();
    }
}
