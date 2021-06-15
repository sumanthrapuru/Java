package com.sumanth.java8.ch34exceptions;

import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {
        Scanner  scr = new Scanner(System.in);
        try{
            int i = 20/Integer.parseInt(scr.nextLine());
        } catch (ArithmeticException | NumberFormatException ae){//both RE
            ae.printStackTrace();
        }
        scr.close();
        //parent throws no exception
        //child no exception or RE

    }
}
