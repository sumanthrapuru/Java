package com.sumanth.java.fundamentals;
/*
	Instance & Static:
	- Cannot be re-initialized directly within class

	Instance & static variables are also referred to as fields or attributes.
	Attributes is probably more commonly associated with instance variables.
*/
public class VariablesDemo {
    //multi variable declaration
    double fees = 10.0, addiFees = 20.0;
    int count, anotherCount = count + 1;
    //int c = d = 10;//CE d
    int d;
    int c = d = 10;
    public static void main(String[] args) {
        String gender, height;
        gender = "m";
        height = "6";
        int count = 0, anotherCount = count + 1;

        byte b = 10;
        short s = 1000;
        char c = 'a';
        s = (short) c;
        c = (char) s;
        b = (byte) c;
        c = (char) b;//widened to int narrowed to char

        double avg = (2+3)/2;//2.0
        System.out.println(avg);
        avg = (double)(2+3)/2;//2.5
        System.out.println(avg);

        //new VariablesDemo().m(((byte)10), 10);
        new VariablesDemo().m(((byte)10));

    }

    void m(int i){
        System.out.println("i method");
    }
    void m(short s){
        System.out.println("s method");
    }
    void m(short s, double d){
        System.out.println("s d");
    }
    void m(int i, float f){
        System.out.println("i f");
    }
}
