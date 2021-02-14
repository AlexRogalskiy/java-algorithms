package com.javanibble.algorithm.sequence.sort;


/**
 * The InsertionSort class implements the InsertionSort algorithm for sorting an array of integers. Insertion 
 * sort is a sorting algorithm that builds the final sorted array (or list) one item at a time. The algorithm 
 * iterates over the list and removes the current element, finds the location within the sorted part of the 
 * list, and inserts it there.  This process is repeated until the whole list is sorted.
 */
public final class InsertionSort {

    public void sort(int[] collection) {
        if (collection != null) {
            insertionSort(collection);
        } else {
            throw new IllegalArgumentException("Input parameter for array to sort is null.");
        }
    }
    
    private void insertionSort(int[] collection) {
        int arrayLength = collection.length;
        
        for (int unsortIndex = 1; unsortIndex < arrayLength;  unsortIndex++) {
            int newElement = collection[unsortIndex];
            int iterator = 0;

            for (iterator = unsortIndex; iterator > 0 && collection[iterator - 1] > newElement; iterator--) {
                collection[iterator] = collection[iterator - 1];
            }
            collection[iterator] = newElement;
        }
    }

}