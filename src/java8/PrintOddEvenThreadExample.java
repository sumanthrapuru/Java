package java8;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrintOddEvenThreadExample implements Runnable {
    static Object obj;

    PrintOddEvenThreadExample(Object obj) {
        this.obj = obj;
    }

    static int i = 0;

    public static void main(String[] args) {
//        Object obj = new Object();
//        new Thread(new PrintOddEvenThreadExample(obj), "odd").start();
//        new Thread(new PrintOddEvenThreadExample(obj), "even").start();

        obj = new Object();
        Runnable evenThread = () -> {
            IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).forEach(PrintOddEvenThreadExample::print);
        };

        Runnable oddThread = () -> {
            IntStream.rangeClosed(1, 10).filter(i -> i % 2 != 0).forEach(PrintOddEvenThreadExample::print);
        };

//        new Thread(evenThread).start();
//        new Thread(oddThread).start();

        CompletableFuture.runAsync(evenThread);
        CompletableFuture.runAsync(oddThread);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    static void print(int no) {
        synchronized (obj) {
            System.out.println(Thread.currentThread().getName() + " : " + no);
            obj.notify();
            try {
                obj.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        while (i < 10) {
            if (i % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (obj) {
                    System.out.println("even : " + i++);
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (i % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (obj) {
                    System.out.println("odd : " + i++);
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

}
