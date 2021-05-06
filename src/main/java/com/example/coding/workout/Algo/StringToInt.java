package com.example.coding.workout.Algo;

import java.util.Arrays;
import java.util.HashSet;

public class StringToInt {

    public static void main(String[] args) {
        char[] str = "1243321".toCharArray();
        int num = 0;
        for (char c : str) {
            //System.out.println("c: " + (int) c);
            int ascci = (int) c;
            //48 is the ascci value of 0;
            num = num * 10 + (ascci - 48);

        }
        System.out.println("num: " + num);
        arrayAssignment();
    }

   static volatile int[] arr= new int[]{1,2,3};
    static int[] arr1 = new int[]{4,5,6,7,8,6};
    static int[] arr2;
    public static void arrayAssignment(){
        arr2=arr1;
        System.out.println("arr2: "+ Arrays.toString(arr2));
        arr2=arr;
        System.out.println("arr2: "+ Arrays.toString(arr2));

        HashSet<String> hs= new HashSet<>();

    }


}
