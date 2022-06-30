package interview2;

import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMax(new int[]{1,2,2, 3,3,3,3}, 2)));
    }


    static int[] getMax(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Integer, Integer>> comparator = Map.Entry.comparingByValue();
        //Collections.sort(list, comparator.reversed());//
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(comparator);
        for (Map.Entry<Integer, Integer> entry : list){
            queue.add(entry);//O(1)
        }

        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}
