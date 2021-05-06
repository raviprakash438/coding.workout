package com.example.coding.workout.Services;

import java.io.FileNotFoundException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo {

    private static ExecutorService executorService= Executors.newFixedThreadPool(2);
    private ReentrantReadWriteLock lock= new ReentrantReadWriteLock();
    private ReentrantLock lock1= new ReentrantLock();

    public static void main(String[] args) throws FileNotFoundException {

        for(int i=1;i<3;i++){
            int id=i;
            executorService.submit(()->{
                Thread thread= Thread.currentThread();
                String bdate= new UserService(id).birthDate();
                System.out.println(thread+": "+bdate);
            });
        }





    }

}