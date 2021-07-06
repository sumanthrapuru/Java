package com.sumanth.java.java8.ch2operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic * / % + - ++ --
        // Assignment = += -= /= *= %=
        // Relational == != < > <= >=
        // Bitwise & ^ | ~
        // Logical or Boolean operator && || ! ^
        // Conditional Operator ? :
        // instanceof operator

        //1) increment decrement (can't apply to boolean)
        byte i = 10;
        i++;// i = (type of i) i + 1
        //++(++i);
        byte a = 10, b = 20;
        //byte c = a + b;//c = max(int, type of a, type of c)

        //2) arithmetic operators
        int x;
        //x = 10 / 0;//RE / by zero
        double d;
        d = 10 / 0.0;
        System.out.println(d);//Infinity
        System.out.println(-10.0 / 0);//-Infinity
        System.out.println(0.0 / 0);//NaN

        //3) Relational operators < > <= >= (can't apply to boolean, objects)
        //4) Equality operators == != (apply to all primitives, objs)
        Thread t = new Thread();
        String s = "";
        Object o = new Object();
        //System.out.println(t==s);//CE there should be parent child relationship

        //5) instanceof operator
        Object[] objArr = new Object[10];
        objArr[0] = "str";
        Object obj = objArr[0];
        if (obj instanceof String) {//CE there should be parent child relationship
            System.out.println((String) obj);
        }
        System.out.println(null instanceof String);//false

        //6) bitwise operators & | ^ (boolean and integral types)
        System.out.println(4 & 5);//100 101

        //bitwise complement operator ~ (integral type)
        System.out.println(~4);//-5

        //boolean complement operator !
        System.out.println(!true);

        //7) short circuit && ||

        System.out.println((byte) 130);//    1 0010110 | 1101001 + 1 | 1101010 | -106

        //8) assignment operators
        //%= /= *= += -= &= |= ^= >>= >>>=(unsigned right shift)

        //9) conditional operator ? :

        //10) new operator

        //11) [] operator

        //Operator precedence

        //unary
        //  [] x++ x--
        //  ++x --x ~ !
        //  new <type>
        //binary
        /*
            Arithmetic
            * / %
            + -

            shift
            >> >>> <<

            comparison
            < <= > >= instanceof

            equality
            == !=

            bitwise
            &
            ^
            |

            short circuit
            &&
            ||
         */
        //new(NoClassDefFoundError) newInstance(ClassNotFoundException) will always call no arg constructor
        try {
            Class.forName("com.sumanth.java.java8.ch2operators.OperatorsDemo").newInstance();
        } catch (InstantiationException e) {//when no arg constructor is not available
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //instanceof operator | isInstance()
        Thread thread = new Thread();
        System.out.println(thread instanceof Thread);
        try {
            Class.forName("com.sumanth.java.java8.ch2operators.OperatorsDemo").isInstance(thread);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
