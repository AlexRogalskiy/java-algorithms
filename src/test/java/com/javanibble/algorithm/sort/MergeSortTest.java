package com.javanibble.algorithm.sort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * The MergeSortTest class forms part of the Test Driven Development approach to test the MergeSort class.
 */
public class MergeSortTest {

    
    @Test(expected = IllegalArgumentException.class)
    public void testMergeSortNull() {
        int[] unsortedArray = null;
        new MergeSort().sort(unsortedArray);
    } 
 
    
    @Test
    public void testMergeSort() {
        int input[] = new int[]{6,1,7,9,3,8,2,5,4,0};
        int sorted[] = {0,1,2,3,4,5,6,7,8,9};
        MergeSort sort = new MergeSort();
        sort.sort(input);

        assertEquals(true, Arrays.equals(input, sorted));
    }
    
}
