package com.javanibble.algorithm.sort;


/**
 * The SelectionSort class implements the Selection algorithm for sorting an array of integers. The algorithm
 * divides the input list into two parts, sorted and unsorted. The algorithm looks for the largest element in
 * the unsorted section and swap it with the last position in the unsorted partition.
 */
public final class SelectionSort {
	
	
    public void sort(int[] collection) {
        if (collection != null) {
            selectionSort(collection);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    }
	
	
    private void selectionSort(int[] collection) {
        int arrayLength = collection.length;
        
        for (int unsortIndex = arrayLength - 1; unsortIndex > 0; unsortIndex--) {
            int largest = 0;
            for (int i = 1; i <= unsortIndex; i++) {
                if (collection[i] > collection[largest]) {
                    largest = i;
                }
            }
            swap(collection, largest, unsortIndex);
        }
    } 
	

    private void swap(int[] collection, int x, int y) {
        int temp = collection[x];
        collection[x] = collection[y];
        collection[y] = temp;
    } 
	
	
}