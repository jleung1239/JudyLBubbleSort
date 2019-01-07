package com.company;

public class SortingUtil {

    //sorts the list in order from least to greatest
    //if a number is out of place, it swaps them
    //if no swaps have been made when checking through a list, then it stops
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

    // creates array of random integers from 0 to 1000
    // count = length of array
    public static int[] randIntArr(int count){
        int arr[] = new int[count];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 1001);
        }
        return arr;
    }

    //check if arr is sorted from least to greatest
    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    //checks if the sum of arrays are the same
    public static boolean checkSum(int[] before, int[] after){
        int i;
        int beforeSum = 0;
        int afterSum = 0;
        for (i = 0; i < before.length; i++){
            beforeSum += before[i];
        }
        for (i=0; i < after.length; i++){
            afterSum += after[i];
        }
        if (beforeSum == afterSum){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void selectionSort(int[] arr){
        int i; //goes through the whole list
        int x = 0; //keeps track of the next smallest int
        int y = 0; //keeps track of where to start next
        int temp; //used to swap
        while (y < arr.length - 1){
            for (i = y ; i < arr.length; i++){
                if (arr[x] > arr[i]){
                    x = i;
                }
            }
            temp = arr[y];
            arr[y] = arr[x];
            arr[x] = temp;
            y++;
            x = y;
            
        }
    }
}
