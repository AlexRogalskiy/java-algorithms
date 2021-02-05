package com.javanibble.algorithm.sort;


/**
 * The CountingSort class implements the Counting Sort algorithm for sorting an array of integers. Counting 
 * Sort is an integer sorting algorithm. Counting Sort are unlike other sorting algorithms in that it makes 
 * certain assumptions about the data. It counts the number of objects with a distinct key value, and use 
 * arithmetic to determine the position of each key. This algorithm does not make use of comparisons to sort 
 * the values. In simplistic terms, the algorithm counts the number of occurrences of each value in order to 
 * sort it.
 */
public final class CountingSort {
    
    public void sort(int[] collection) {
        if (collection != null) {
            int maxValue = findMaxValue(collection);
            countingSort(collection, maxValue);
        } else {
            throw new IllegalArgumentException("Input parameter for array to sort is null.");
        }
    }
    
    private void countingSort(int[] collection, int maxValue) {
        int[] countArray = countOccurrences(collection, maxValue);
        reconstructArray(collection, countArray, maxValue);
    }

    private int findMaxValue(int[] collection) {
        int highest = collection[0];
        for (int index = 1; index < collection.length; index ++) {
            if (collection[index] > highest) {
                highest = collection [index];
            }
        }
        return highest;
    }

    private int[] countOccurrences(int[] collection, int maxValue) {
        int[] tempArray = new int[maxValue + 1];

        for (int i = 0; i < collection.length; i++) {
            int key = collection[i];
            tempArray[key]++;
        }
        
        return tempArray;
    }

    private void reconstructArray(int[] collection, int[] countArray, int maxValue) {
        int j = 0;
        for (int i = 0; i <= maxValue; i++) {
            while (countArray[i] > 0) {
                collection[j++] = i;
                countArray[i]--;
            }
        }
    }

}
