package ds.map;

import java.util.Comparator;
import java.util.TreeMap;

public class HashMapExample {

    class Employee{
        String firstName;
        String lastName;
        ///....


        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int hashCode() {
            return firstName.concat(lastName).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Employee){
                Employee empObj = (Employee) obj;
                return this.firstName.equals(empObj.firstName) && this.lastName.equals(empObj.lastName);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Comparator<Employee> comparator = (e1, e2) -> {
            if(!e1.firstName.equals(e2.firstName)){
                return e1.firstName.compareTo(e2.firstName);
            }else{
                return e1.lastName.compareTo(e2.lastName);
            }
        };
        TreeMap<Employee, Employee> map = new TreeMap<>(comparator);




    }
}
