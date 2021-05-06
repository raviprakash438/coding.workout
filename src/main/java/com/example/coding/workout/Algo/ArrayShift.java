package com.example.coding.workout.Algo;

import java.util.ArrayList;
import java.util.List;

public class ArrayShift {

    public static void main(String[] args) {
        List<Integer> intarr=new ArrayList<>();
        intarr.add(10);
        intarr.add(-5);
        intarr.add(-1);
        intarr.add(-1);
        intarr.add(20);
        intarr.add(1);
        journey(intarr,3);
        String str="asdf";

    }
    public static void journey(List<Integer> path, int maxStep) {
        long result=path.get(0);
        // Map<Integer,Integer> mp=new HashMap<>();

        for(int i=1;i<path.size();i++){

            long maxValue=0;
            int index=0;
            for(int j=i;j<i+maxStep;j++){
                if(j==i){
                    maxValue=result+path.get(j);
                    index=j;
                }
                if(j<path.size()){

                    long tempresult= result+path.get(j);
                    if(tempresult>maxValue){

                        maxValue=tempresult;
                        index=j;
                    }
                }
            }
            result = maxValue;
            i =index;

            // System.out.println("i-->"+path.get(i));
        }
        // System.out.println("max step-->"+maxStep);
        System.out.println("result: "+result);
    }

}

