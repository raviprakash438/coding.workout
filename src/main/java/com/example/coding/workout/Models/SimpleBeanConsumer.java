package com.example.coding.workout.Models;

import org.springframework.beans.factory.annotation.Autowired;

public class SimpleBeanConsumer {

    @Autowired
    SimpleBean simpleBean;

    public SimpleBeanConsumer(SimpleBean sb) {
        System.out.println("SimpleBean consumer Constructor called");
        sb.m();
    }
    public void M1(){
        System.out.println("Method M1 is called.");
    }
}
