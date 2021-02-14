package com.javanibble.algorithm.sort;


/**
 * The ShellSort class implements the Shell Sort algorithm used for sorting an array of integers. Shell Sort 
 * is an in-place comparison sort algorithm. Shell Sort is a generalization of insertion sort that allows 
 * the exchange of items that are far apart. The algorithm starts by sorting pairs of elements far apart from
 * each other. The algorithm progressively reduce the gap between elements to be compared.
 */
public final class ShellSort {

    
    public void sort(int[] collection) {
        if (collection != null) {
            shellSort(collection);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    }
    
    
    private void shellSort(int[] collection) {
        int arrayLength = collection.length;
        
        for (int gap = arrayLength / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arrayLength; i++) {
                int newElement = collection[i];
                
                int j = i;
                while (j >= gap && collection[j - gap] > newElement) {
                    collection[j] = collection[j - gap];
                    j -= gap;
                }
                collection[j] = newElement;
            }
        }
    } 
    
}
