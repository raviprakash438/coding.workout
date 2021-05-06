package com.example.coding.workout.Multithreading;

public class SimpleTask implements Runnable {
    private String str;
    public SimpleTask(String str) {
        this.str=str;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName()+" : " + str+" Simple task is running...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+" : " + str+" Simple task is completed!!");
    }
}
