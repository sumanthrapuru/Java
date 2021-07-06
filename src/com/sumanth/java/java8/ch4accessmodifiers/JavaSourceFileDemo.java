package com.sumanth.java.java8.ch4accessmodifiers;

//import is compile time concept runtime no effect
//if a particular class is used then only it is loaded into memory
//import java.util.*;
//import java.sql.*;

//static import
//import static java.lang.Integer.*;
//import static java.lang.Byte.*;


public class JavaSourceFileDemo {
    private static final int MAX_VALUE = 0;
    //Date date = new Date();//ref to date is ambiguous
    //explicit
    //curent package
    //implicit

    //current static members
    //explicit
    //implicit
    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
    }

}
