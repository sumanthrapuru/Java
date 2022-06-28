package java8;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

    //grouping by example
    static void printCharCount(String str){
        Map<String, Long> map = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    static class Employee{
        String name;
        String dept;
        int salary;

        public Employee(String name, String dept, int salary) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDept() {
            return dept;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {
        //printCharCount("sumantha");


//        List<Employee> employeeList = Arrays.asList(new Employee("sumanth", "engg", 10),
//                new Employee("suma", "engg", 100),
//                new Employee("rama", "engg", 50));
//
//        Map<String, Optional<Employee>> temp = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//
//        System.out.println(temp);


//        IntStream.rangeClosed(1, 10).forEach(value -> System.out.println(Thread.currentThread().getName()+" "+value));
//        IntStream.rangeClosed(1, 10).parallel().forEach(value -> System.out.println(Thread.currentThread().getName()+" "+value));




    }
}
