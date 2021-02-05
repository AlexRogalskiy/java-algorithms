# Sorting Algorithms
Sorting algorithms is a process of organising a collection of data in an ascending or descending order. Sorting algorithms can be used as standalone algorithms or as part of other algorithms like search algorithms. The binary search algorithm is a very efficient way to search large collections of data. Sorting is a pre-requisite for most searching algorithms.

## Why Study Sorting Algorithms
The question always come up, why do we study sorting algorithms and why even care? The sorting algorithms are all very different to each other but with the same pre- and post-conditions. There are many ways to implement an algorithm to sort an array of integer values where the pre-condition and the post-conditions will be the exact same, but the behaviour and complexity of the algorithm is different. We would like to have a way to measure an algorithm to determine which is a good algorithm and which is best.

## Classification
**Internal vs. External Sorting**

Sorting algorithms can be classified into two types of algorithms: internal and external. Internal sorting algorithms require the full data set to fit into main memory whereas external sort is used when the full data set does not fit and have to reside on external storage during the sorting process.

**Stable vs. Unstable Sorting**

A stable sorting algorithm is when two objects with equal keys appear in the same order in the unsorted input array and the sorted output array. Examples of stable sorting algorithms are Insertion sort, Merge Sort and Bubble Sort.

An unstable sorting algorithm is when two objects with equal keys doesn't appear in the same order in the unsorted input array and the sorted output array. Examples of unstable sorting algorithms are Heap Sort and Quick Sort.

**Time vs. Space Complexity**

Time Complexity is the computational complexity that describes the amount of time it takes to run an algorithm.

Space Complexity is the computational complexity that describes the amount of memory space required by an algorithm.

## List of Sort Algorithms
The following algorithms are examples of internal sorting algorithms:

| Algorithm Name | Time Complexity: Best | Time Complexity: Average | Time Complexity: Worst | Space Complexity: Worst |
| --- | :---: | :---: | :---: | :---: |
| [Bubble Sort][0] | Ω(n) | Θ(n<sup>2</sup>) | O(n<sup>2</sup>) | O(1) |
| Bucket Sort | Ω(n+k) | Θ(n+k) | O(n<sup>2</sup>) |  O(n) |
| [Counting Sort][2] | Ω(n+k) | Θ(n+k) | O(n+k) | O(k) |
| Cube Sort | Ω(n) | Θ(n log(n)) | O(n log(n)) | O(n) |
| Heap Sort | Ω(n log(n)) | Θ(n log(n)) | O(n log(n)) | O(1) |
| [Insertion Sort][5] | Ω(n) | Θ(n<sup>2</sup>) | O(n<sup>2</sup>) | O(1) |
| [Merge Sort][6] | Ω(n log(n)) | Θ(n log(n)) | O(n log(n)) | O(n) |
| [Quick Sort][7] | Ω(n log(n)) | Θ(n log(n)) | O(n<sup>2</sup> | O(n log(n)) |
| Radix Sort | Ω(nk) | Θ(nk) | O(nk) | O(n+k) |
| [Selection Sort][9] | Ω(n<sup>2</sup>) | Θ(n<sup>2</sup>) | O(n<sup>2</sup>) | O(1) |
| [Shell Sort][10] | Ω(n log(n)) | Θ(n log<sup>2</sup>n)  | O(n<sup>2</sup>) | O(1) |
| Timsort | Ω(n) | Θ(n log(n)) | Θ(n log(n)) | O(n) |
| Tree Sort | Ω(n log(n))  | Θ(n log(n)) | O(n<sup>2</sup>) | O(n) |

## Conclusion
Sorting algorithms are common in introductory computer science classes. Sorting Algorithms provides an introduction to core algorithms concepts such as Big O notation, data structures and understanding algorithm complexity in context of time and space.

[0]: https://www.javanibble.com/bubble-sort-algorithm-in-java/
[1]: #
[2]: https://www.javanibble.com/counting-sort-in-java/
[3]: #
[4]: #
[5]: https://www.javanibble.com/insertion-sort-algorithm-in-java/
[6]: https://www.javanibble.com/merge-sort-algorithm-in-java/
[7]: https://www.javanibble.com/quick-sort-algorithm-in-java/
[8]: #
[9]: https://www.javanibble.com/selection-sort-algorithm-in-java/
[10]: https://www.javanibble.com/shell-sort-algorithm-in-java/
[11]: #
[12]: #
