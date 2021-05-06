package com.example.coding.workout.Multithreading;

public class OddEvenNumber {

    int counter=1;
    int N;

    public OddEvenNumber(int n) {
        N = n;
    }

    public  void PrintOdd() {
        synchronized (this){
            while (counter<N){
                if (counter%2==0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter +" is Odd number");
                counter++;
                notify();
            }

        }
    }

    public  void PrintEven() {
        synchronized (this){
            while (counter<N){
                if (counter%2!=0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter +" is even number");
                counter++;
                notify();
            }

        }
    }
}
