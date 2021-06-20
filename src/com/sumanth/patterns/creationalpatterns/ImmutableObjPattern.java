package com.sumanth.patterns.creationalpatterns;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableObjPattern {

}

class Person{
    private final String name;
    private final int age;
    private final Collection<String> friends;

    public Person(String name, int age, List<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Collection<String> getFriends() {
        return Collections.unmodifiableCollection(this.friends);
    }
}
