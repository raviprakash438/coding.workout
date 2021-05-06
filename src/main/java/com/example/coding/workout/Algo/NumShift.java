package com.example.coding.workout.Algo;

import java.util.Arrays;

public class NumShift {

    static int num = 2;
    static int[] arr = new int[]{1, 2, 4, 3, 2, 5, 1, 2};
    //output: 1,4,3,5,1,2,2,2

    //1,4,2,3,2,5,1,2 -i=1, j=1
    //1,4,3,2,2,5,1,2 -i=2, j=2
    //1,4,3,5,2,2,1,2 -i=3, j=5
    //1,4,3,5,1,2,2,2 -i=4, j=6


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortNum(arr, num)));

    }

    public static int[] sortNum(int[] arr, int num) {

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                if (j < i) {
                    j = i;
                }
                while (j < arr.length - 1 && arr[j] == num) {
                    j++;
                }
                arr[i] = arr[j];
                arr[j] = num;
            }
        }
        return arr;
    }

}
