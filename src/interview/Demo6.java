package interview;

public class Demo6 {
    //Anbi nd Akin, aand -> Anbi nd

//    String sub(String s1, String s2){
//        x pow 2 + 1 = y
//
//        X = sqrt(Y - 1)
//
//
//    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(5-1));

        //fun(3-1, 3);
    }

    //f(3,3)
    //-1

    /*
    * Find the smallest window in a string containing all characters of another string

Given String: Taking an interview
Key: an,  -> an

Akin an -> akin

Anbi nd Akin, aand -> Anbi nd
s1=dakin s2=and ->







QUESTION
Assume a Special Family wherever a parent has 2 children. And all of them love sports in particular Chess, Badminton
So the liking pattern in the Family is that if the parent likes Chess then the first child likes chess and the second child likes Badminton.

And if the parent likes Badminton then the first child likes Badminton and the second child likes chess.

Assumptions :
  1. This is a complete binary tree
  2. The First parent likes badminton


3.   B                                   C
     /   \                               /         \
    B      C                        C          B

Given this a sample tree will be

                      B 0
                 /             \
              B     1            C 2
           /     \              /     \
        B  3       C  4      C  5       B 6
    /       \    /    \     /     \    /      \
B         C C     B C     B B        C
BC   CB CB BC CB BCBC CB

B 1 B 2 pow (L-1)
BC 2 pow 1
BCCB 2 pow 2
BCCBCBBC 2 pow 3
BCCBCBBCCBBCBCCB
0  3 56  910 12    15

0th

BCCBCBBC

x pow 2 + 1 = y

X = sqrt(Y - 1)


Given 2 inputs -
G → generation
O → order
f(G,O) → preference of sport
f(3,3) → C
f(3,4) → B
f(4,4) → B
f(4,5) → C
f(4,6) → B

f(n, n) —>

Write a program that predicts the correct preference of sport of the child


*/
}

