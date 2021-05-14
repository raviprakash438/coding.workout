package com.example.coding.workout.Algo;

import java.util.ArrayList;
import java.util.List;

public class PickingNumber {
    public static void main(String[] args) {
        List<Integer> lst= new ArrayList<>();
        lst.add(1);
        lst.add(1);
        lst.add(2);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        System.out.println(pickingNumbers(lst));
    }
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index=a.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;
    }

}
