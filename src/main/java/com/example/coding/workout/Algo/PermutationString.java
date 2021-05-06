package com.example.coding.workout.Algo;

public class PermutationString
{
    public static void main(String[] args) {
        String str="ABC";
        int len=str.length();
        permute(str,0,len-1);
        //ABC,ACB, BAC,BCA, CAB,CBA
    }
    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        System.out.println("Printing Swap array"+String.valueOf(charArray));
        return String.valueOf(charArray);
    }
}
