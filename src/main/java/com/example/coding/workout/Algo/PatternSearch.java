package com.example.coding.workout.Algo;

public class PatternSearch {
    public static void main(String[] args) {
        String str="AABAACAADAABAABA";//"THIS IS A TEST TEXT";
        String pat="AABA    ";

        FindPatternIndex(str,pat);
    }
    public static void FindPatternIndex(String str,String pat){

        if(str.length()<pat.length()){
            System.out.println("Pattern not found!!");
        }

        char[] charStr=str.toCharArray();
        char[] charPat=pat.toCharArray();

        for(int j=0,i=0;i<charStr.length;i++){
            if(charStr[i]==charPat[j]){
                if(j==charPat.length-1){
                    System.out.println("Pattern found at index: "+(i-j));
                    j=0;
                }
                else{
                    j++;
                }
            }
            else{
                j=0;
            }
        }


    }

}


