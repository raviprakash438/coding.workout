package com.example.coding.workout.Algo;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

public class HashCodeFormula {

   static String str= "10";

    public static void main(String[] args) {
        int hcvalue=0;
       char[] chars= str.toCharArray();
       int len= chars.length;
       for(int i=0;i<len;i++){
           int ascci= chars[i];
           hcvalue += ascci*Math.pow(31,len-i-1);
       }

        System.out.format("The hash code of %s is : %s",str,str.hashCode());

        System.out.println("\n"+hcvalue);
    }
}
