package interview2;

import java.util.HashMap;

public class Main11 {
    public static void main(String[] args) {
        String str = "jijki";
        //k=1 j=2 i=2
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : arr){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }
        }
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }

    /**
     *          select salary
     *          from employee
     *          group by salary
     *          order by desc
     *          limit 1 skip 1
     */
}
