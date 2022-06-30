package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main17 {
    static class Employee{
        Integer id;
        double salary;

        public Employee(Integer id, double salary) {
            this.id = id;
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("value1","value2",  "value1");
        Map<String, Long> temp = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        temp.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));

        //id odd
        //5000 inc
        //after inc total salary sum
        //print

        //1



        List<Employee> eList = Arrays.asList(new Employee(1, 1000), new Employee(2, 100),
                new Employee(3, 1500), new Employee(4, 200));
        Optional<Double> sum = eList.stream()
                .filter(e -> e.id % 2 == 1)
                .map(e -> e.salary + 5000)
                .reduce(Double::sum);
        sum.ifPresent(System.out::println);

        /**
         * employee
         * name
         * dept_name
         *
         * select dept_name, count(*)
         * from employee
         * group by dept_name
         * having count(*) > 10
         *
         * @Transactional(propegation type)
         *
         * saga archestration
         *
         * hystrix
         *
         *
         */


    }
}
