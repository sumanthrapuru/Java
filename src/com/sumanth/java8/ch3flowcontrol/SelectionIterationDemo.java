package com.sumanth.java8.ch3flowcontrol;

import java.util.ArrayList;
import java.util.List;

public class SelectionIterationDemo {
    //if else switch
    //for for each while do while
    //break continue return try catch assert
    public static void main(String[] args) {
        //selection statements
        if(true)
            if(true)
                System.out.println("hello");
       else// associated to nearest if
                System.out.println("hi");

       int i = 9;
       switch(i){//till int & its wrapper class obj & enum & string
           case 1://always constant exp but not variable
               System.out.println(

               );
           case 2:
               break;
           default://default can be defined any where
               break;

       }
       switch(i){
           //empty switch is valid statement
       }

       //iterative statements
        do;//; is valid statement
        while(false);
        for(/*only one type var int i=0, j=0 or sop()*/;i > 10/*boolean exp*/;/*valid stmt*/);

        List<Integer> list = new ArrayList<>();
        list.add(15);
        for(Integer e : list) //list must be Iterable
            System.out.print(e);

        //break(inside switch, loop, labelled break)
        l1:{
            System.out.println("start of block");
            if(i<10)
                break l1;
            System.out.println("end of block");
        }

        //continue(loops, labelled loops)
        l1:
        for(int k = 0; k<3; k++){
            for(int j=0; j<3; j++){
                if(k==j)
                    //break;
                    //continue;
                    break l1;
                    //continue l1;
                else
                    System.out.printf("%d%d ",k,j);
            }
        }

        int x = 0;
        do{
            x++;
            System.out.print(x+" ");
            if(++x < 5)
                continue;
            x++;
            System.out.print(x+" ");
        }while(++x < 10);

    }
}
