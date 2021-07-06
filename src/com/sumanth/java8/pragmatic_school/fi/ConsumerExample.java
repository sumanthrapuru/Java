package com.sumanth.java8.pragmatic_school.fi;

import com.sumanth.java8.pragmatic_school.data.Student;
import com.sumanth.java8.pragmatic_school.data.StudentDataBase;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.BiConsumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s.toUpperCase(Locale.ROOT));
        stringConsumer.accept("sumanth");

        List<Student> studentList = StudentDataBase.getAllStudents();
        Consumer<Student> printNameConsumer = s -> System.out.print(s.getName()+" ");
        Consumer<Student> printActivitiesConsumer = s -> System.out.println(s.getActivities());

        studentList.forEach(s -> printNameConsumer.andThen(printActivitiesConsumer).accept(s));

        BiConsumer<String, String> nameConcatConsumer = (fName, lName) -> fName.concat(lName);
        nameConcatConsumer.accept("sumanth", "rapuru");

        BiConsumer<String, List<String>> studentActivitiesPrintConsumer =
                (String name, List<String> acti) -> {
                    System.out.print(name+" ");
                    System.out.println(acti);
                };
        studentList.forEach(s -> studentActivitiesPrintConsumer.accept(s.getName(), s.getActivities()));

    }
}


interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T> after){
        Objects.requireNonNull(after);
        return (T t) -> {
            accept(t);
            after.accept(t);
        };
    }
}