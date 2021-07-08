package com.practice.java8.interfaceenhancements;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> list);

    //impl will be given more priority
    default int size(List<Integer> list){
        return list.size();
    }

    static boolean isEmpty(List<Integer> list){
        return !(list != null && list.size()>0);
    }
}
