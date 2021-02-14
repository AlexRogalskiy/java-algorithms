package com.javanibble.algorithm.sort;


/**
 * The BubbleSortRecursive class implements the BubbleSort algorithm for sorting an array of integers. The 
 * Bubble Sort algorithm repeatedly steps through the list and compare each adjacent item. The pair of values 
 * gets swapped if they are in the wrong order. The algorithm gets its name from the way smaller or larger 
 * elements "bubble" to the top of the list.
 * 
 * The BubbleSortRecursive class implements the BubbleSort algorithm by making use of recursion.
 */
public final class BubbleSortRecursive {

    public void sort(int[] collection) {
        if (collection != null) {
            bubbleSort(collection, collection.length);
        } else {
            throw new IllegalArgumentException("Input parameter for array to sort is null.");
        }
    }
	
    private void bubbleSort(int[] collection, int arrayLength) {
        if (arrayLength == 1) {
            return;
        }

        for (int i = 0; i < arrayLength - 1; i++) {
            if (collection[i] > collection[i + 1]) {
                swap(collection, i, i + 1);
            }
        }

        bubbleSort(collection, arrayLength - 1);
    }
    
    private void swap(int[] collection, int x, int y) {
        int temp = collection[x];
        collection[x] = collection[y];
        collection[y] = temp;
    }
    
}
