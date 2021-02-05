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


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


/**
 * The CountingSortTest class forms part of the Test Driven Development approach to test the CountingSort 
 * class.
 * 
 * @author  André Maré
 */
public class CountingSortTest {

    
    @Test(expected = IllegalArgumentException.class)
    public void testCountingSortNull() {
        int[] unsortedArray = null;
        new CountingSort().sort(unsortedArray);
    } 
 
    
    @Test
    public void testCountingSort() {
        int input[] = new int[]{6,1,7,9,3,8,2,5,4,0};
        int sorted[] = {0,1,2,3,4,5,6,7,8,9};
        CountingSort sort = new CountingSort();
        sort.sort(input);

        assertEquals(true, Arrays.equals(input, sorted));
    }
    
}