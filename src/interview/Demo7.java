//package interview;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Demo7 {
//    static class Employee{
//        public Employee(String name, Double salary) {
//            this.name = name;
//            this.salary = salary;
//        }
//
//        String name;
//        private Double salary;
//
//        public Double getSalary() {
//            return salary;
//        }
//
//        @Override
//        public String toString() {
//            return "Employee{" +
//                    "name='" + name + '\'' +
//                    ", salary=" + salary +
//                    '}';
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Employee> list = Arrays.asList(new Employee("sumanth", 500.0),
//                new Employee("hemanth", 100.0));
//        List<Employee> sortedList = list.stream()
//                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//                .collect(Collectors.toList());
//        System.out.println(sortedList);
//
//        Map<Employee, Double> map = new HashMap();
//        map.put(new Employee("sumanth", 500.0), 500.0);
//        map.put(new Employee("tarun", 10.0), 10.0);
//        map.put(new Employee("barun", 10.0), 200.0);
//
//        ArrayList<Employee, new ArrayList(map.entrySet())
//
//
//                .stream().sorted(Comparator.comparingDouble(x -> x.)
//                .collect(Collectors.toList());
//
//        System.out.println(map);
//
//
//
//
//
//
//    }
//
//}
