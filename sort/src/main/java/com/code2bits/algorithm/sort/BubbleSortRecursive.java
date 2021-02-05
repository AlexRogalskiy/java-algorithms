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
 * The BubbleSortRecursive class implements the BubbleSort algorithm for sorting an array of integers. The 
 * Bubble Sort algorithm repeatedly steps through the list and compare each adjacent item. The pair of values 
 * gets swapped if they are in the wrong order. The algorithm gets its name from the way smaller or larger 
 * elements "bubble" to the top of the list.
 * 
 * The BubbleSortRecursive class implements the BubbleSort algorithm by making use of recursion.
 * 
 * @author	André Maré
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
		
        for (int i=0; i < arrayLength-1; i++) {
            if (collection[i] > collection[i+1]) {
                swap(collection, i, i+1);
            }
        }
		
        bubbleSort(collection, arrayLength-1);
    }
        
    
    private void swap(int[] collection, int x, int y) {
        int temp = collection[x];
        collection[x] = collection[y];
        collection[y] = temp;
    }
	
    
}
