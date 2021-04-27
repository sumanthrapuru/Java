package com.sumanth.java8.ch10collections;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/** Collections are
 * growable
 * heterogeneous
 * underlying ds operations support
 */
public class Basics {
    Collection col;
    static List list;
    static Set set;
    static Queue queue;
    static Map<String, String> map;

    public static void main(String[] args) {
        Collections.sort(list);
        Arrays.sort(new int[]{});

        //Enumeration Iterator ListIterator

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<String>();
        Vector<String> vector = new Vector<>();
        Stack<String> stack = new Stack<>();
        vector = stack;

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        hashSet = linkedHashSet;
        TreeSet<String> treeSet = new TreeSet<>();
        NavigableSet<String> navigableSet = treeSet;
        SortedSet<String> sortedSet = navigableSet;
        set = sortedSet;

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<String> blockingQueue = priorityBlockingQueue;
        blockingQueue = linkedBlockingQueue;

        HashMap hashMap = new HashMap();
        hashMap = new LinkedHashMap();

        map = new WeakHashMap<>();
        map = new IdentityHashMap<>();

        Hashtable hashtable = new Hashtable<>();
        hashtable = new Properties();
        Dictionary dictionary = hashtable;

        TreeMap<String, String> treeMap = new TreeMap<>();
        NavigableMap navigableMap = treeMap;
        SortedMap sortedMap = navigableMap;
        map = sortedMap;
    }
}
