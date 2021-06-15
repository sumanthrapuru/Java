package com.sumanth.java8.ch11innerclasses;

public class InnerClassesDemo {
    //inner class, local IC, anonymous IC, static nested classes
    int i = 10;
    static int j = 100;

    public static void main(String[] args) {
        InnerClassesDemo innerClassesDemo = new InnerClassesDemo();
        innerClassesDemo.new InnerClass().m1();
        innerClassesDemo.instanceMethod();
        InnerClassesDemo.StaticNestedClass staticNestedClass = new InnerClassesDemo.StaticNestedClass();
        staticNestedClass.m1();
    }

    class InnerClass {
        void m1() {
            i = 20;
            System.out.println(i);
        }
    }

    void instanceMethod(){
        class LocalInnerClass {
            void m1() {
                i = 20;
                System.out.println(i);
            }
        }
        new LocalInnerClass().m1();
    }

    static class StaticNestedClass{
        void m1(){
            System.out.println(j);
        }
    }
}
