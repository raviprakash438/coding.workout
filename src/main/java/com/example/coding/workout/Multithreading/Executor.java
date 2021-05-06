package com.example.coding.workout.Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor {
    private static final ExecutorService executorService= Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Future<Integer> future= executorService.submit(new SimpleTaskCallable(4));
        executorService.execute(new SimpleTask("using executor method"));
        executorService.submit(new SimpleTask("using submit method"));
        executorService.shutdown();
        System.out.println("Execcutor is shutdown!!");
        System.out.println("Factorical of 4 is " + future.get());
    }

}
