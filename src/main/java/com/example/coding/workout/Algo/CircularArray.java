package com.example.coding.workout.Algo;

import java.util.Iterator;

public class CircularArray<T>  {
    private T[] items;
    private int head = 0;

    public CircularArray(int size) {
        items = (T[]) new Object[size];
    }

    private int convert(int index){
        if(index<0){
            index +=items.length;
        }
        return (head+index) % items.length;
    }
    public void rotate(int shiftRight){
        head= convert(shiftRight);
    }

    public  T get(int i){
        if(i<0 || i>=items.length){
            throw new java.lang.IndexOutOfBoundsException("Index out of bound");
        }
        return items[convert(i)];
    }
    public  void set(int i, T item){
        items[convert(i)]=item;
    }

    public static void main(String[] args) {
        CircularArray<Integer> circularArray= new CircularArray<>(5);
        circularArray.set(0,1);
        circularArray.set(1,2);
        circularArray.set(-2,3);
       // circularArray.set(3,4);
        //circularArray.set(4,5);
        circularArray.rotate(3);


    }
}
