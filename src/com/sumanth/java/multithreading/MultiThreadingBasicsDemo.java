package com.sumanth.java.multithreading;

public class MultiThreadingBasicsDemo {
    static int counter = 0;

    //static synchronized void increment() {
    static void increment() {
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
    }

    static void printNumbers(int n) {
        synchronized (MultiThreadingBasicsDemo.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println("printing num  " + n * i);
            }
        }
    }

    public static void main(String[] args) {
//        new Thread(MultiThreadingBasicsDemo::run).start();

        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner2());
        //t1.start();
        //t2.start();

        Thread t3 = new Thread(MultiThreadingBasicsDemo::increment);
        t3.start();
        Thread t4 = new Thread(MultiThreadingBasicsDemo::increment);
        t4.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);

        new Thread(() -> printNumbers(5)).start();
        new Thread(() -> printNumbers(1)).start();

    }

    static void run() {
        System.out.format(" thread name %s thread id %d", Thread.currentThread().getName(), Thread.currentThread().getId());
    }
}

class Runner1 implements Runnable {

    Runner1() {
        //stackoverflow
        // new Runner1();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner 1 is printing " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner 2 is printing " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}