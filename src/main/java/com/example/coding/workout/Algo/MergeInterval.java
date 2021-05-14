package com.example.coding.workout.Algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MergeInterval {

    public static void main(String[] args) {
        int[][] arr= new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.toString(merge(arr)));
    }
    private static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> ll= new LinkedList<>();
        for(int[] arr: intervals){
            if(ll.isEmpty() ||ll.getLast()[1]<arr[0]){
                ll.add(arr);
            }
            else{
                ll.getLast()[1]=Math.max(ll.getLast()[1],arr[1]);
            }
        }
        return ll.toArray(new int[ll.size()][]);
    }
}
