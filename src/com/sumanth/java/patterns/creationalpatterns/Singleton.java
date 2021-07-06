package com.sumanth.java.patterns.creationalpatterns;

//ensures one instance of a class exists in vm
//logging, drivers, caching, thread pool
public class Singleton {
//    private static volatile Singleton instance = new Singleton();//early initialization
    private static volatile Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                synchronized (Singleton.class) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
