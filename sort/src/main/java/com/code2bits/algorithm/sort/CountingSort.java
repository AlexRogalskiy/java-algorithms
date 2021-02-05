/**
 * MIT License
 * 
 * Copyright (c) 2018 André Maré
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
 * The CountingSort class implements the Counting Sort algorithm for sorting an array of integers. Counting 
 * Sort is an integer sorting algorithm. Counting Sort are unlike other sorting algorithms in that it makes 
 * certain assumptions about the data. It counts the number of objects with a distinct key value, and use 
 * arithmetic to determine the position of each key. This algorithm does not make use of comparisons to sort 
 * the values. In simplistic terms, the algorithm counts the number of occurrences of each value in order to 
 * sort it.
 * 
 * @author  André Maré
 */
public final class CountingSort {

    
    public void sort(int[] collection) {
        if (collection != null) {
            int maxValue = findMaxValue(collection);
            countingSort(collection, maxValue);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
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
