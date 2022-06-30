package interview2;

import java.util.*;

public class Main16 {
    /*parentChildPairs = [
            [1, 3], [2, 3], [3, 6], [5, 6], [5, 7], [4, 5],
            [15, 21], [4, 8], [4, 9], [9, 11], [14, 4], [13, 12],
            [12, 9], [15, 13]
            ]*/



    public static void main(String[] args) {
        int[][] parentChildPairs = {
            {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5},
            {15, 21}, {4, 8}, {4, 9}, {9, 11}, {14, 4}, {13, 12},
            {12, 9}, {15, 13}
            };
//        new Main16().findParent(parentChildPairs);
//        new Main16().findChildWithOneParent(parentChildPairs);
        new Main16().commonParent(parentChildPairs, 6, 11);
    }

    void findParent(int[][] arr){
        Set<Integer> set = new HashSet<>();
        for(int[] e : arr){
            set.add(e[1]);
        }
        Set<Integer> parents = new HashSet<>();
        for(int[] e : arr){
            if(!set.contains(e[0])){
                parents.add(e[0]);
            }
        }
        for(int i : parents){
            System.out.print(i + " ");
        }
    }

    void findChildWithOneParent(int[][] arr){
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] e : arr){
            if(map.containsKey(e[1])){
                map.get(e[1]).add(e[0]);
            }else{
                Set<Integer> valueList = new HashSet<>();
                valueList.add(e[0]);
                map.put(e[1], valueList);

            }
        }
        map.entrySet().stream().filter(e-> e.getValue().size()==1).forEach(e -> System.out.println(e.getKey()));
    }//5 7 8 4 11 12 13 21

        /*parentChildPairs = [
            [1, 3], [2, 3], [3, 6], [5, 6], [5, 7], [4, 5],
            [15, 21], [4, 8], [4, 9], [9, 11], [14, 4], [13, 12],
            [12, 9], [15, 13]
            ]*/
    /**
     *                15
     *               / \
     *          14  13  21
     *          |   |
     * 1   2    4   12
     *  \ /   / | \ /
     *   3   5  8  9
     *    \ / \     \
     *     6   7     11
     */

    void commonParent(int[][] arr, int node1, int node2){
        List<Integer> list1 = getParentChain(arr, node1);
        System.out.println(list1);
        List<Integer> list2 = getParentChain(arr, node2);
        System.out.println(list2);
        Set<Integer> subset = new HashSet<>(list1);
        subset.retainAll(new HashSet<>(list2));
        for(int i : list1){
            if(subset.contains(i)){
                System.out.println(i);
                break;
            }
        }

    }

    List<Integer> getParentChain(int[][] arr, int node){
        List<Integer> list = new ArrayList<>();

        int temp = node;
        outer: while(temp != -1){
            int templocal = temp;
            inner: for(int i =0; i<arr.length; i++){
                if(arr[i][1] == temp){
                    temp = arr[i][0];
                    list.add(temp);
                    break inner;
                }
            }
            if(temp == templocal) temp = -1;
        }
        return list;
    }


}
