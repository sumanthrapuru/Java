package java8;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ThirdHighestNumberUsingStream {
    static class Employee{
        String dept;
        int salary;

        Employee(int salary, String dept){
            this.dept = dept;
            this.salary = salary;
        }

        int getSalary(){
            return salary;
        }

        String getDept(){
            return dept;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "dept='" + dept + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 6, 5, 3, 9);
        Optional<Integer> opt = list.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst();
        System.out.println(opt);


        List<Employee> employeesList = Arrays.asList(new Employee(20, "account"), new Employee(40, "account"),
                new Employee(70, "engg"), new Employee(40, "engg"));


//        Map<String, Optional<Employee>> map = employeesList.stream()
//                .collect(Collectors.groupingBy(Employee::getDept,
//                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        Map<String, Employee> map = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));

        System.out.println(map);




    }
}
