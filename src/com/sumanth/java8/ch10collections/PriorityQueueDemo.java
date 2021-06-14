package com.sumanth.java8.ch10collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //Use full in breadth first search
        //Dikstra Algorithm relies heavily on this data structure
        //add(obj)
        //offer(obj)
        //remove(obj)
        //element()
        //peek() doesn't remove returns null if head is empty
        //poll() remove

        Queue<AccessCard> queue = new PriorityQueue<>();
        queue.add(new AccessCard("sum", 4));//RE ClassCastException if Comparable is not implemented
        queue.add(new AccessCard("bum", 7));
        queue.add(new AccessCard("rum", 3));

        System.out.println(queue.poll());


    }
}

class AccessCard implements Comparable{
    String name;
    int id;

    public AccessCard(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return -(this.id - ((AccessCard) o).id);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id;
    }
}