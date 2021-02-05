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
 * The QuickSort class implements the QuickSort algorithm for sorting an array of integers. 
 * QuickSort, also known as partition-exchange sort, is an efficient divide and conquer sorting algorithm. 
 * 
 * The algorithm divides the array into two smaller sub-arrays. To divide the algorithm into two array, an 
 * pivot or element within the array is chosen. The partition phase consist of reordering the array so that 
 * all elements with values less than the pivot come before the pivot, while all elements with values greater
 * than the pivot come after it. After the partition phase, the pivot is in its final position. The pivot 
 * logically splits the original array into two sub-arrays. The QuickSort algorithm then recursively sort the
 * sub-arrays by selecting a new pivot and move the values accordingly.
 * 
 * @author	André Maré
 */
public final class QuickSort {
	
	
    public void sort(int[] collection) {
        if (collection != null) {
            quickSort(collection, 0, collection.length-1);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    } 
	

    private void quickSort(int[] collection, int firstPosition, int lastPosition) {
        if (firstPosition >= lastPosition) {
            return;
        } else {			
            int pivotIndex = partition(collection, firstPosition, lastPosition);
            quickSort(collection, firstPosition, pivotIndex-1);
            quickSort(collection, pivotIndex+1, lastPosition);
        } 		
    } 
	

    private int partition(int[] collection, int firstPosition, int lastPosition) {	
        int pivotIndex = selectPivot(firstPosition, lastPosition);
        swap (collection, pivotIndex, lastPosition);
        int store = firstPosition;
        pivotIndex = lastPosition;
        for (int i = firstPosition; i <= lastPosition-1 ; i++) {
            if (collection[i] <= collection[pivotIndex]) {
                swap (collection, i, store);
                store++;
            }
        }
        swap (collection, store, pivotIndex);
        pivotIndex = store;
        return pivotIndex;
    } 	
	
	
    private void swap(int[] collection, int x, int y) {
        int temp = collection[x];
        collection[x] = collection[y];
        collection[y] = temp;
    } 
	

    private int selectPivot(int first, int last) {
        return (first+last)/2;
    } 

	
} 
