package com.company;

public class randIntArr {
    // creates array of random integers from 0 to 1000
    // count = length of array
    public static int[] randintArr(int count){
        int arr[] = new int[count];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 1001);
        }
        return arr;
    }
}
