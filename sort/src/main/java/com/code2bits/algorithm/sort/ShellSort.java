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
 * The ShellSort class implements the Shell Sort algorithm used for sorting an array of integers. Shell Sort 
 * is an in-place comparison sort algorithm. Shell Sort is a generalization of insertion sort that allows 
 * the exchange of items that are far apart. The algorithm starts by sorting pairs of elements far apart from
 * each other. The algorithm progressively reduce the gap between elements to be compared.
 * 
 * @author  André Maré
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
