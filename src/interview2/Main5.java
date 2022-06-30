package interview2;

import java.util.HashSet;
import java.util.Set;

public class Main5 {
    /**
     * Goal: find the first unique character in a sequence of characters.
     * Examples: "abcdabceabcdf" -> e
     *           "abcbad" -> c
     *           "abcabcabc" -> "" or null
     */

    static char firstUnique(String str){
        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();
        char firstUnique = '@';
//        set.add(arr[0]);
        for(int i = arr.length-1; i >=0; i--){
            if(!set.contains(arr[i])){
                firstUnique = arr[i];
                set.add(arr[i]);
            }


        }
        return !set.contains(firstUnique) ? firstUnique : '@';
    }

    public static void main(String[] args) {
        char c = firstUnique("abcdabceabcdf");
        char c2 = firstUnique("abcbad");
        char c3 = firstUnique("abcabcabc");
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
    }


}
