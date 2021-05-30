package com.example.coding.workout.Algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoffeeChange {
    static int[] q1 = new int[]{5,10};
    static int[] q2 = new int[]{5, 5, 10, 10, 20};
    static int coffeePrice = 5;

    public static void main(String[] args) {
        System.out.println(getChange(q1));
    }

    private static boolean getChange(int[] arr) {
        boolean isChangeAvailable = true;
      //  List<Integer> income = new ArrayList<>();
        // int[] cash= new int[arr.length];
        HashMap<Integer, Integer> cash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!isChangeAvailable) return false;

            int change = arr[i] - coffeePrice;
            //income.add(arr[i]);

            if (cash.containsKey(arr[i])) {
                cash.put(arr[i], (cash.get(arr[i]) + 1));
            } else {
                cash.put(arr[i], 1);
            }
            if (change > 0) {
                isChangeAvailable = isChangePresent(cash, change);
            }
        }
        return isChangeAvailable;
    }

    private static boolean isChangePresent(HashMap<Integer, Integer> cash, int change) {
        // boolean isPresent=false;
        if (cash.containsKey(change)) {
            cash.put(change, (cash.get(change) - 1));
            return true;
        } else {
            if (change == 15 && cash.containsKey(10) && cash.containsKey(5)) {
                if (cash.get(10) > 0 && cash.get(5) > 0) {
                    cash.put(10, (cash.get(10) - 1));
                    cash.put(5, (cash.get(5) - 1));
                    return true;
                } else {
                    return false;
                }

            } else {
                int numberOfFives = change / 5;
                while (numberOfFives > 0) {
                    if (cash.containsKey(5)  && cash.get(5) > 0) {
                        cash.put(5, (cash.get(5) - 1));
                    } else {
                        return false;
                    }
                    numberOfFives--;

                }
            }
        }
        return false;
    }
}
