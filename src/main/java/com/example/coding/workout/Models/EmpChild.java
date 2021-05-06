package com.example.coding.workout.Models;

public class EmpChild extends Emp {

    //String name ="Aarav";
    public String GetEmpName() {
        System.out.println("Child class "+name);
        return name;
    }

    public void M1(String str){
        System.out.println("String param method called.");
    }

    public void M1(Object obj){
        System.out.println("Object param method called.");
    }

    public void M1(int i){
        System.out.println("int param method called.");
    }

    public void M1(Integer i){
        System.out.println("long param method called.");
    }
    public void M1(long i){
        System.out.println("long param method called.");
    }
    public void M1(double i){
        System.out.println("double param method called.");
    }
}
