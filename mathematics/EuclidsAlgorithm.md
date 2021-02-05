# Algorithm: Euclid's Algorithm

## Overview
Euclid's algorithm is used to find the greatest common divisor (gcd) of two positive integers.

## Algorithm Classification
The following table contains information about the analysis of the Bucket Sort algorithm. It defines the worst, average and best cases in terms of time complexity and also the worst case in space complexity.

| Classification | Value|
| --- | --- |


Please use the following [link][0] for an explanation on Big-O notation and what is good, fair and bad.

## Pseudocode
The following is the pseudocode for the Euclid's algorithm to determine the gcd.
```
* Precondition: Consider two positive integers 'm' and 'n' such that m ≥ n ≥ 0.
* Step 1: Divide m by n, and let the remainder be r.
* Step 2: If r = 0, the algorithm ends, n is the GCD.
* Step 3: Set m -> n, n -> r, repeat from step 1 until r = 0;
```

## Euclid's Algorithm In Java
The Bucket Sort class implements the Bucket Sort algorithm for sorting an array of integers.

```java
```
### Sample Code (GitHub)
* The details of the BucketSort class can be viewed [here][1].
* The details of the BucketSort JUnit Test class can be viewed [here][2].

## Conclusion


[0]: http://www.bigocheatsheet.com/img/big-o-cheat-sheet-poster.png
[1]: #
[2]: #
