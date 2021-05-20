package com.example.coding.workout.Multithreading;


import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Greeting {
    void greet(String name,String lName);
}

public class MethodReference {

    public void wishing(String name,String lName) {
        System.out.println("Hi, "+ name+" "+ lName);
    }

    public static void main(String[] args) {
        MethodReference mr = new MethodReference();
        //Greeting greeting = mr::wishing;
        //Greeting greeting = (name,lName)->mr.wishing(name,lName);
        Greeting greeting = (name,lName)-> System.out.println("Hi, "+ name+" "+ lName);
        greeting.greet("Ravi","Prakash !!");


    }
}
