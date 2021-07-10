package com.sumanth.java.patterns.creationalpatterns;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableObjPattern {

}

final class Person{
    private final String name;
    private final int age;
    private final Collection<String> friends;

    public Person(String name, int age, List<String> friends) {
        this.name = name;
        this.age = age;
        //deep copy
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Collection<String> getFriends() {//deep clone or unmodifiable list
        return Collections.unmodifiableCollection(this.friends);
    }
}
