package com.sumanth.java8.ch10collections;

import java.util.*;

public class ArrayListLinkedListDemo {
    public static void main(String[] args) {
        //Random Index
        //Insertion Order
        //null allowed
        //Manipulation slow
        //not for primitives
        ArrayList al = new ArrayList();
        ArrayList<String> alGeneric = new ArrayList<>();

        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Kate");
        list.add("Joe");
        list.add("Kevin");
        list.add("Daniel");

        list.remove(0);
        list.remove("Joe");

        list.add(1, "Second Joe");

        list.set(1, "Third Joe");

        list.size();
        list.isEmpty();

        list.equals(list);

        Collections.sort(list);//Merge Sort

        System.out.println(list);

        //LL is List and Queue both
        //DLL
        //fast Manipulation
        //slow Accessing

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        Iterator<String> listIterator = arrayList.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        for(String s : linkedList){
            System.out.println(s);
        }

        
    }
}
