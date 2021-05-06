package com.example.coding.workout.Algo;

public class SubSequenceString {
    public static void main(String[] args) {
        String virus = "coronavirus";
        String[] sample = new String[]{"abcde", "crnas", "onarous"};
        for (String smpl : sample) {
            int j = 0;
            for (int i = 0; i < virus.length(); i++) {
                if (j < smpl.length() && smpl.charAt(j) == virus.charAt(i)) {
                    j++;
                }
            }
            if (smpl.length() == j) {
                System.out.println("Positive!!");
            } else {
                System.out.println("Negative");
            }
        }
    }
}
