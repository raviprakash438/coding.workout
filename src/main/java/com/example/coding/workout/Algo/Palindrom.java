package com.example.coding.workout.Algo;

public class Palindrom {
    public static void main(String[] args) {
        String A="Ravi";

        char[] charArr=A.toCharArray();
        int len=charArr.length;
        boolean isPalindrom=true;
        for(int i=0;i<len/2;i++){
            if(charArr[i]!=charArr[len-1-i]){
                isPalindrom=false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
