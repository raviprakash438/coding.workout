package com.example.coding.workout.Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseTheVowels {

    static String str = "umbrella";

    public static void main(String[] args) {
        System.out.println("input: " + str);
        System.out.println("output: " + reverse(str));
    }

    public static String reverse(String str) {

        char[] chararr = str.toCharArray();
        for (int i = 0, j = chararr.length - 1; i < j; i++) {
            if (isVowel(chararr[i])) {

                while (j > i && !isVowel(chararr[j])) {
                    j--;
                }
                if (isVowel(chararr[j])) {
                    char temp = chararr[i];
                    chararr[i] = chararr[j];
                    chararr[j] = temp;
                    j--;
                }
            }

        }

        return String.valueOf(chararr);
    }

    private static boolean isVowel(char c) {

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        return vowels.contains(c);
    }
}
