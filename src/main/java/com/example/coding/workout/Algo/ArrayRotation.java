package com.example.coding.workout.Algo;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int d = 3;
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int ar1[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arrRotate(arr, d, n)));
        System.out.println(Arrays.toString(arrRotationInPlace(ar1, d, n)));
    }

    public static int[] arrRotate(int[] arr, int d, int len) {
        int[] tmparr = new int[d];

        for (int i = 0; i < len; i++) {
            if (i < d) {
                tmparr[i] = arr[i];
            }
            if (i < len - d) {
                arr[i] = arr[i + d];
            } else {
                arr[i] = tmparr[i - len + d];
            }
        }
        return arr;
    }

    public static int[] arrRotationInPlace(int[] arr, int d, int len) {

        while (d > 0) {
            int temp=0;
            for (int i = 0; i < arr.length-1; i++) {
                if (i == 0) temp = arr[i];

                arr[i] = arr[i + 1];
            }
            arr[arr.length-1]=temp;

            d--;
        }

        return arr;
    }
}
