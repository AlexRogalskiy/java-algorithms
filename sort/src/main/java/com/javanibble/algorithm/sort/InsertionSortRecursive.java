package com.javanibble.algorithm.sort;


/**
 * Insertion sort is a sorting algorithm that builds the final sorted array (or list) one item at a time. 
 * The algorithm iterates over the list and removes the current element, finds the location within the 
 * sorted part of the list, and inserts it there.  This process is repeated until the whole list is 
 * sorted.
 * 
 * The InsertionSortRecursive class implements the InsertionSort algorithm by making use of recursion.
 */
public final class InsertionSortRecursive {
	
    public void sort(int[] collection) {
        if (collection != null) {
            insertionSort(collection);
        } else {
            throw new IllegalArgumentException("Input parameter for array to sort is null.");
        }
    }

	private void insertionSort(int[] collection) {
	    int arrayLength = collection.length;
	    insertionSort(collection, arrayLength);
	}
	
	private void insertionSort(int[] collection, int recursiveValue) {
	    if (recursiveValue <= 1) {
	        return;
	    }
	    
	    insertionSort( collection, recursiveValue - 1);
	
	    int last = collection[recursiveValue-1];
	    int j = recursiveValue-2;
	  
	    while (j >= 0 && collection[j] > last) {
	        collection[j+1] = collection[j];
	        j--;
	    }
	    collection[j+1] = last;
	}

}