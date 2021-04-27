package com.sumanth.algorihms.sorting;

import java.util.*;

public class SortingInJava {
    static class Point implements Comparable<Point>{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point p) {
            return this.x - p.x;
        }

        @Override
        public String toString() {
            return "x=" + x +
                    ", y=" + y;
        }
    }
    public static void main(String[] args) {
        /*
        Sort Arrays
        */
        //DualPivot QuickSort (non stable)
        //merge sort (stable) adaptation of tim sort
        Arrays.sort(new int[]{10});//can't pass comparator for primitives
        Arrays.sort(new Integer[]{}, Comparator.comparingInt(i -> i%2));//use wrapper classes if comparator is needed
        Arrays.sort(new int[10], 2, 5);//can sort range
        Point[] arr = new Point[]{
                new Point(10, 20),
                new Point(3, 12),
                new Point(5,7)
        };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /*
        Arrays.sort(arr, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.x - o2.x;
            }
        });
        Arrays.sort(arr, (o1, o2) -> o1.x - o2.x);*/
        Arrays.sort(arr, Comparator.comparingInt(o -> o.x));
        Arrays.sort(arr, Collections.reverseOrder());

        //non stable (primitives can be sorted in only natural order)
        int[] intArr = new int[]{5,20,10,3,12};
        //Arrays.sort(intArr, (o1, o2) -> o1%2-o2%2);
        System.out.println(Arrays.toString(intArr));

        //stable merge sort
        Integer[] integerArr = new Integer[]{5,20,10,3,12};
        Arrays.sort(integerArr, Comparator.comparingInt(i -> i % 2));
        System.out.println(Arrays.toString(integerArr));

        /*
        Sorting list
         */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(7);

        Collections.reverse(integerList);//reverses list
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.sort(integerList, Collections.reverseOrder());//comparator reverses natural ordering
        System.out.println(integerList);

        /*
        Stability in Sorting: Bubble sort, Insertion sort, Merge sort
        Instability in sorting: quick sort, heap sort, selection sort
         */

    }
}
