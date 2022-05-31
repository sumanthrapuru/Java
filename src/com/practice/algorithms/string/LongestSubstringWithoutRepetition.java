package com.practice.algorithms.string;

public class LongestSubstringWithoutRepetition {
    //O(N^3) time
    static class BruteForceApproach {//time O(n^3)

        //find all substrings(n * n-1)/2 and check uniqueness for each substring n
        public static void main(String[] args) {
            String str = "abcacbz";
            int maxLength = 0;
            String maxLengthSubStr = "";
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    //print all substrings
                    /*String substr = "";
                    for (int k = i; k <= j; k++) {
                        substr += str.charAt(k);
                    }
                    System.out.println(substr);*/
                    if (areDistinct(i, j, str)) {
                        if (maxLength < (j - i) + 1) {
                            String temp = "";
                            for (int k = i; k <= j; k++) {
                                temp += str.charAt(k);
                                maxLengthSubStr = temp;
                                maxLength = temp.length();
                            }
                            System.out.println(maxLengthSubStr);
                        }
                    }
                }
            }
        }

        static boolean areDistinct(int start, int end, String str) {
            //are distinct chars
            boolean[] visited = new boolean[26];
            for (int z = start; z <= end; z++) {
                if (visited[str.charAt(z) - 'a'] == true) {
                    return false;
                }
                visited[str.charAt(z) - 'a'] = true;
            }
            return true;
        }
    }

    static class SlidingWindowApproach {
        public static void main(String[] args) {
            String str = "abcacbz";
            for(int i = 0; i < str.length(); i++){
                boolean[] visited = new boolean[26];
                for(int j = i; j < str.length(); j++){
                    //visited[str.]
                }
            }
        }
    }
}
