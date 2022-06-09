package interview;

public class Demo3 {
    public static void main(String[] args) {
        //17 1 8 2 23 16    17 1 8      8 2 16  1 2 23

        //26







    }
    //18

    //hash set
    //iterate i
    //new target = 3 element target 26 -ith value 17 = 9
    //array with 2 elements exclude ith index
    //2 element solution


//    static solution(int[] array, ){
//
//    }

    String str = "abac";

    //problem: shortest palindrom
    //op: aa
    //abac op: aba



    boolean palindrome(String s){
        for(int i=0,j=s.length()-1; i<j; i++,j--){// O(N)
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }


    void subString(String str){
        char[] strChar = str.toCharArray();
        for(int i = 0; i < strChar.length; i++){
            for(int j = 0; j<strChar.length; j++){
                //swap i j
                //swap j i
            }
        }
    }


    //@SpringBootApplication
    //build.gradle
    // spring-starter-web proj
    // spring jdbc
    // mysql
    // @Controller
    // @RequestMapping()
    // Response<>
    //application.

    // spring boot deploy in weblogic server by creting war file

}
