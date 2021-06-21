package com.sumanth.multithreading;

public class WaitNotifyExample {
    synchronized void waitingMethod() {
        Thread t = Thread.currentThread();
        System.out.println("wating method exe by " + t.getName());
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread woke up after waiting");
    }

    synchronized void notifingMethod() {
        Thread t = Thread.currentThread();
        System.out.println("notify method exe by " + t.getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         notify();

    }

    public static void main(String[] args) {
        WaitNotifyExample wne = new WaitNotifyExample();
        new Thread(()->wne.waitingMethod()).start();
        new Thread(()->wne.notifingMethod()).start();
        for (int i = 0; i < 10000; i++) {
            
        }

    }
}
