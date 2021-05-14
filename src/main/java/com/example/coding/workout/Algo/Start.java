package com.example.coding.workout.Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Start<T> {
    public  void add(T t){

    }
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7).skip(5).forEach(num-> System.out.println(num+ " "));

//        Start<Number> s= new Start<>();
//        s.add(new Integer(5));
//        s.add(new Double(3.5));
//
//        A a= new B();
//       // B b =  new A();
//        a.a();
//        a.x();
//        //b.a();
        //b.x();
//        Object[] obj= {new Integer(5),new String("str"),new Integer(2),new Boolean(true)};
//        Arrays.sort(obj);
//        for (Object o: obj){
//            System.out.println(o);
//        }
//
//        List<A> lt= new ArrayList<>();
//        lt.add(new A());
//        Iterator<A> it= lt.iterator();
//        int i=0;
//        while(it.hasNext()){
//            lt.add(new A());
//            System.out.println("print!!"+ i);
//            i++;
//        }

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