package corejava;

public class Loops {
    /*
    * 1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
* */
    public static void main(String[] args) {
        printFizzBuzz(15);
    }
    static void printFizzBuzz(int n){
        String s = "";
        for(int i = 1, j = 3, k = 5; i <= n; i++){
            if(j == 3){
                s += "Fizz";
                j = 1;
            }
            if(k == 5){
                s += "Buzz";
                k = 1;
            }
            if(s == ""){
                s += i;
            }
            System.out.println(s);
            s = "";
        }

    }
}
