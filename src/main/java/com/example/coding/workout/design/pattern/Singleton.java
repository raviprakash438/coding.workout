package com.example.coding.workout.design.pattern;

import com.example.coding.workout.Models.counter;

import java.io.Serializable;

public class Singleton implements Serializable {
    //How to prevent Singleton Pattern from Reflection, Serialization and Cloning?
    //https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/
    //1. Use enum to prevent from reflection.
    //2. User readResolve() to over coming serialization issue.
    //3. Override the clone() method to over come cloning issue.

    private static  Singleton instance;
    private static int counter;
    private Singleton(){}

    protected Object readResolve(){
        return getInstance();
    }


    public static Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
            counter++;
        }
        return instance;
    }
    private static void printCounter(){
        System.out.println("Counter value is : "+ counter);
    }

}
