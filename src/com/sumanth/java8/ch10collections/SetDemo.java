package com.sumanth.java8.ch10collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //HashSet
        //LinkedHashSet preserves insertion order
        //TreeSet   RBTree    maintains sorted order (slower than hashset)
        //not thread safe

        //work on hashset
        Set<String> hashSet = new HashSet<>();
        hashSet.add("B");
        hashSet.add("A");


        //finally create TreeSet and iterate
        for(String s : new TreeSet<>(hashSet)){
            System.out.println(s);
        }

    }
}
