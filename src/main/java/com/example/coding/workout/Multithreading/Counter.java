package com.example.coding.workout.Multithreading;

import java.io.IOException;
import java.util.Comparator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    Lock lock = new ReentrantLock(true);

    int i;

    //public synchronized void increment() {
    public void increment() {
        lock.lock();
            i++;
            System.out.println("i-->" + i);
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread Name-->" + threadName + " The value of i-->" + i);
        lock.unlock();
    }

    public static void main(String[] args) throws IOException {
//        String str1 = "Ravi";
//        String str2 = "Ravi";
//        String str3 = new String("Ravi");
//        System.out.println(str1 == str2); //true
//        System.out.println(str2 == str3); //false;
//        System.out.println(str1.substring(0) == str2);  //true
        Counter counter = new Counter();
        Runnable runnable = ()->counter.increment();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(() -> counter.increment());
        Thread t3 = new Thread(() -> counter.increment());

        t1.start();
        t2.start();
        t3.start();

        Comparable comparable= new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        Comparable comparable1= (Object i)-> 0;

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }


}

