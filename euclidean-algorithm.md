# Algorithm: Euclidean algorithm

## What is the Euclidean algorithm?
> "In mathematics, the Euclidean algorithm, or Euclid's algorithm, is an efficient method for computing the greatest common divisor (GCD) of two integers (numbers), the largest number that divides them both without a remainder. It is named after the ancient Greek mathematician Euclid, who first described it in his Elements (c. 300 BC). It is an example of an algorithm, a step-by-step procedure for performing a calculation according to well-defined rules, and is one of the oldest algorithms in common use. It can be used to reduce fractions to their simplest form, and is a part of many other number-theoretic and cryptographic calculations." ~ [Wikipedia][0]


## Pseudocode
The following is the pseudocode for the Euclid's algorithm to determine the greatest common divisor (GCD) between two numbers. 
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


[0]: https://en.wikipedia.org/wiki/Euclidean_algorithm
[1]: #
[2]: #
