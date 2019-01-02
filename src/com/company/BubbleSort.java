package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int swap = 1;
        int temp;
        while (swap > 0){
            swap = 0;
            for (int i = 1;i < arr.length; i++){
                if (arr[i-1]>arr[i]){
                    temp = arr[i];
                    arr[i]= arr[i-1];
                    arr[i-1]=temp;
                    swap++;
                }
            }
        }
    }
}
