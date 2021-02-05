/**
 * MIT License
 * 
 * Copyright (c) 2017 André Maré
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.code2bits.algorithm.sort;


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
 * 
 * @author  André Maré
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
