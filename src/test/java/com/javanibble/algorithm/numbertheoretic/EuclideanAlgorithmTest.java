package com.javanibble.algorithm.numbertheoretic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EuclideanAlgorithmTest {

    private EuclideanAlgorithm euclid = null;

    @Before
    public void init() {
        euclid = new EuclideanAlgorithm();
    }

    @Test
    public void gcdRecursionTest() {
        Assert.assertEquals(6, euclid.gcdRecursion(54, 24));
        Assert.assertEquals(6, euclid.gcdRecursion(42, 18));
        Assert.assertEquals(2, euclid.gcdRecursion(354, 244));
        Assert.assertEquals(1, euclid.gcdRecursion(423, 128));
        Assert.assertEquals(1, euclid.gcdRecursion(555, 406));
        Assert.assertEquals(23, euclid.gcdRecursion(3289, 2415));
        Assert.assertEquals(46, euclid.gcdRecursion(8602, 4278));
    }

    @Test
    public void gcdLoopTest() {
        Assert.assertEquals(6, euclid.gcdLoop(54, 24));
        Assert.assertEquals(6, euclid.gcdLoop(42, 18));
        Assert.assertEquals(2, euclid.gcdLoop(354, 244));
        Assert.assertEquals(1, euclid.gcdLoop(423, 128));
        Assert.assertEquals(1, euclid.gcdLoop(555, 406));
        Assert.assertEquals(23, euclid.gcdLoop(3289, 2415));
        Assert.assertEquals(46, euclid.gcdLoop(8602, 4278));
    }

}
