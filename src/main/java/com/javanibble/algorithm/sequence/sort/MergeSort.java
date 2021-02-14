package com.javanibble.algorithm.sequence.sort;


/**
 * The MergeSort class implements the Merge Sort algorithm used for sorting an array of integers. Merge Sort 
 * is a divide and conquer algorithm as the algorithm split the original array into smaller logical sections.
 * No new arrays are created. The algorithm can be implemented making use of loops or recursions. The two 
 * distinct phases are a splitting phase and secondly a merging phase.
 * 
 * Splitting Phase: Divide the array into two unsorted arrays. Each of the split arrays are continuously 
 * split into smaller arrays until only multiple single element arrays exist. Single element arrays are 
 * sorted as they only have one element in them.
 * 
 * Merging Phase: Each of the single element arrays are now merged back into a larger array. During the merge
 * phase the two arrays are merged so that the elements are sorted within the new larger sorted array. This 
 * process is repeated until a single sorted array is left. This is not an in-place algorithm as temporary 
 * arrays are used.
 */
public final class MergeSort {

    public void sort(int[] collection) {
        if (collection != null) {
            mergeSort(collection, 0 , collection.length);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    }

    
    public  void mergeSort(int[] collection, int minIndex, int maxIndex) {
        if (maxIndex - minIndex < 2) {
            return;
        }
        
        int centre = (minIndex + maxIndex) / 2;
        mergeSort(collection, minIndex, centre);
        mergeSort(collection, centre, maxIndex);
        mergeBack(collection, minIndex, centre, maxIndex);
    }

    
    public void mergeBack(int[] collection, int minIndex, int centre, int maxIndex) {
        if (collection[centre - 1] <= collection[centre]) {
            return;
        }
        int tempMinIndex = minIndex;
        int tempCentre = centre;
        
        int tempIndex = 0;
        int[] tempArray = new int[maxIndex - minIndex];
        
        while ((tempMinIndex < centre) && (tempCentre < maxIndex)) {
            if(collection[tempMinIndex] <= collection[tempCentre]) {
                tempArray[tempIndex++] = collection[tempMinIndex++];    
            } else {
                tempArray[tempIndex++] = collection[tempCentre++];
            }
        }

        System.arraycopy(collection, tempMinIndex, collection, minIndex + tempIndex, centre - tempMinIndex);
        System.arraycopy(tempArray, 0, collection, minIndex, tempIndex);
    }
    
}
