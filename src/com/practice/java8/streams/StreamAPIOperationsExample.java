package com.practice.java8.streams;

import com.practice.java8.data.Student;
import com.practice.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIOperationsExample {
    public List<String> studentNames(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

    }

    public List<String> studentNameSet(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    public List<String> studentActivityList(List<Student> students) {
        return students.stream()
                //.flatMap(s -> s.getActivities().stream())
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());

    }

    public long studentActivitiesCount(List<Student> students) {
        return students.stream()
                //.flatMap(s -> s.getActivities().stream())
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

    }

    public List<String> studentActivities(List<Student> students) {
        return students.stream()
                //.flatMap(s -> s.getActivities().stream())
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }

    //sort students
    public List<Student> sortStudentsByGpaReverse(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public String studentNameChain(List<String> students) {
        return students.stream()
                .reduce("", (a, b) -> a + "-" + b);
    }

    public Optional<String> studentNameChainOpt(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .reduce((a, b) -> a + " " + b);
    }

    public int totalNotebooks(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGradeLevel() >= 3)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public List<Integer> topTen() {
        return Arrays.asList(1, 2, 5, 4, 6)
                .stream()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());
    }

    public boolean allStudentsPassed(List<Student> students) {
        return students.stream()
                .allMatch(s -> s.getGpa() > 3.5);
    }

    public boolean anyTopper(List<Student> students) {
        return students.stream()
                .anyMatch(s -> s.getGpa() >= 3.9);
    }

    public Optional<Student> findTopper(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGpa() >= 3.9)
                .findFirst();
    }

    public Optional<Student> findAnyThirdGradeStudent(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGradeLevel() == 3)
                .findAny();
    }

    public boolean allPassed(List<Student> students) {
        return students.stream()
                .noneMatch(s -> s.getGpa() < 3.5);
    }

    //following methods are short circuit operations
    //limit     finaAny findFirst       allMatch anyMatch noneMatch

    public static void main(String[] args) {
        System.out.println(new StreamAPIOperationsExample().studentNameChainOpt(StudentDataBase.getAllStudents()));

    }
}
