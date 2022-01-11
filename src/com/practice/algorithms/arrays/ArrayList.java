package com.practice.algorithms.arrays;

public class ArrayList {

    static int capacity = 10;
    static int[] array = new int[capacity];
    static int size = 0;

    //{10, 5, 6, 2, 1}
    // 12, 3
    boolean insert(int value, int pos) {
        if (pos >= capacity) return false;
        for (int i = size - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = value;
        size++;
        return true;
    }

    boolean delete(int value) {
        int i = 0;
        while(i < array.length) {
            if (array[i++] == value) break;
        }
        if (i == capacity) return false;
        for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        return true;
    }
}
