package june27;

import java.util.*;

public class Demo17 {
    static class Employee{
        Integer id;
        String name;
        Set<String> skills;

        public Employee(Integer id, String name, Set<String> skills) {
            this.id = id;
            this.name = name;
            this.skills = skills;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<String> getSkills() {
            return skills;
        }

        public void setSkills(Set<String> skills) {
            this.skills = skills;
        }
    }
    public static void main(String[] args) {
        Set<String> temp = new HashSet(Arrays.asList("skill1", "skill2"));
        Set<String> temp2 = new HashSet(Arrays.asList("skill1", "skill2", "skill3"));

        List<Employee> list = Arrays.asList(new Employee(1, "abc", temp),
                new Employee(2, "xyz", temp2));
        Set<String> mandatorySkills = new HashSet(Arrays.asList("skill1", "skill2"));

        Comparator<Employee> comparator = Comparator.comparingInt(e -> e.skills.size());
        Optional<Employee> employee = list.stream()
                .filter(e -> e.skills.containsAll(mandatorySkills))
                .max(comparator);

        employee.ifPresent(System.out::println);
    }
}
