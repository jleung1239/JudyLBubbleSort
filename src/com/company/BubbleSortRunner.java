package com.company;

public class BubbleSortRunner {

    public static void main(String[] args) {
	// Print it before you sort
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
        System.out.print("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();

        //Sort it using bubbleSort
        BubbleSort.bubbleSort(testArr);

        //Print it out after you sort
        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();
    }
}
