package com.example.coding.workout.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class SimpleTaskCallable implements Callable {
    private int i;

    public SimpleTaskCallable(int i) {
        this.i = i;
    }

    @Override
    public Integer call() throws Exception {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": Start executing Factorical!!");
        int fact=1;
        for(int j=i;j>1;j--){
            fact *=j;
        }
        Thread.sleep(3000);
        return fact;
    }

    public static void main(String[] args) {
        SimpleTaskCallable simpleTaskCallable = new SimpleTaskCallable(1);
        Thread t1= new Thread(() -> {
            try {
                simpleTaskCallable.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        t1.start();
    }
}
