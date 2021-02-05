package com.javanibble.algorithm.sort;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


/**
 * The CountingSortTest class forms part of the Test Driven Development approach to test the CountingSort 
 * class.
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