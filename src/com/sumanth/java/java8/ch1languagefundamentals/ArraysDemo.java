package com.sumanth.java.java8.ch1languagefundamentals;

public class ArraysDemo {
    //public, protected, <default>, private, static, transient, volatile
    public static void main(String[] args) {
        //space ignored by compiler
        int[] []a, b[];//a2 b3//c style array declaration of b
        //int[] []c, []d;//identifier expected but found []
        //int[] intArr = new int[-1];//RE (max array size max of int)
        //int[] intArr = new int[2.5];//CE
        int[] intArr4 = {10, 20};
        //intArr4 = {30, 40};//CE can't do this way
        System.out.println(intArr4.length);

        //primitive type: implicitly promoted to declared type
        //object type: obj type or its subclasses
        //interface type: implementation of type interface
        intArr4 = new int[]{10};
        intArr4[0] = (short) 10;
        Object[] objArr = new Object[5];
        objArr[0] = "any subtype object";
        Runnable[] runArr = new Runnable[3];
        runArr[0] = new Thread("implementation of runnable");

        //for primitive array var assignments (types and dimensions must be matched).
        String[] strArr = new String[9];
        strArr[0] = "su";
        objArr = strArr;
        for(Object o : objArr) System.out.print(o);

        //primitive, reference, instance, static, local variables
        try{
            int i = 0;
        }catch (Exception e){
            //i = 9;//CE i is not in scope
        }finally {
            //i = 8;//CE i is not in scope
        }

        final int localVar;
        //System.out.println(localVar);//CE initialize first if localVar is used
        //only applicable modifier for local variables is: final

        Integer.parseInt("10");

    }
    //for a method only one var arg parameter is allowed that to at the end
    //var arg will be converted into array
    //var arg will have least priority
    //can replace arrays with var args but not other way around
    void m1(int x, int... y){}
    //void m1(int x, int[] y){}

    //all allowed modifiers for main method
    public static strictfp synchronized final void main2(String[] args){}


}
class p {
    public static void main(String[] args) {
        System.out.println("parent main");
    }
}

class c extends p{
    public static void main(String[] args) {
        System.out.println("child main");
    }
}

class PrintWithOutMain{
    static{
        System.out.println("printing with out main");
        System.exit(0);
    }
}