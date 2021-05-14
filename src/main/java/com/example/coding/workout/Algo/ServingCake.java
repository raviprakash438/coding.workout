package com.example.coding.workout.Algo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ServingCake {

    public static void main(String[] args) {

        // int[] radiusArr = new int[]{1, 1, 1, 2, 2, 3};
        int[] radiusArr = new int[]{4, 3, 3};
        int noOfGuest = 4;
        maxAreaServingCake(radiusArr, noOfGuest);
    }

    private static void maxAreaServingCake(int[] radiusArr, int noOfGuest) {

        Arrays.sort(radiusArr);
        List<Double> areaList = new ArrayList<>();

        for (int r : radiusArr) {
            areaList.add(Math.PI * r * r);
        }
        System.out.println(Arrays.toString(radiusArr));
        System.out.println(Arrays.toString(areaList.toArray()));

        for (int i = noOfGuest; i > 0; i--) {
            int counter = i;
            double piesize = areaList.get(areaList.size() - 1) / i;
            for (int j = 0; j < areaList.size() - 1; j++) {
                double cakeArea = areaList.get(j);
                if (piesize < cakeArea) {
                    int noOfPieces = (int) (cakeArea / piesize);
                    counter = counter + noOfPieces;
                }
            }
            if (counter == noOfGuest) {
                DecimalFormat df = new DecimalFormat("###.####");
                System.out.println("The max Pie size: " + df.format(piesize));
                break;
            }
        }

    }


}
