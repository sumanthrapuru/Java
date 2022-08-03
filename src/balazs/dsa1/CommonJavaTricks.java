package balazs.dsa1;

import java.util.Arrays;

public class CommonJavaTricks {
    public static void main(String[] args) {
        //print array
        Arrays.toString(new int[]{});

        //comparator example
        //Comparator.comparing(Person::getName)
        //                .thenComparingInt(Person::getAge).compare(this, o);
    }
}
