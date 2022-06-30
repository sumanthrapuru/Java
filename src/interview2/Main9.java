package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main9 {
    static class Employee{
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return
                    "id=" + id ;
        }
    }
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1, "abc"), new Employee(2, "abc"));
        Map<String, List<Employee>> temp = list.stream()

                .collect(Collectors.groupingBy(Employee::getName, Collectors.toList()));

        System.out.println(temp);





    }
}
