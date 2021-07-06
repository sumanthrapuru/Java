package com.sumanth.java.java8.ch10collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //HashMap not thread safe fast less memory no duplicate keys, duplicate values allowed
        //Hashtable doesn't allow duplicate values
        //LinkedHashMap preserves insertion order
        //TreeMap   sorted RB tree
        //put(k,v) get(k)   size() clear()  entrySet()

        Map<Integer, String> hashMap = new HashMap<>();//no order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//insertion order
        Map<Integer, String> treeMap = new TreeMap<>();//sorted order

    }
}
