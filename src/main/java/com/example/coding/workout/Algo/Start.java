package com.example.coding.workout.Algo;

public class Start {
    public static void main(String[] args) {
        A a= new B();
       // B b =  new A();
        a.a();
        a.x();
        //b.a();
        //b.x();
    }
}

class A{
    int x=4;
    public void a(){
        System.out.println("A");
    }
    public void x(){
        System.out.println(x);
    }
}

class B extends A{
   int x=5;
   public void a(){
       System.out.println("B");
   }
   public void x(){
       System.out.println(x);
   }
}