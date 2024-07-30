# Exercise 3: Sorting Customer Orders

## Understand Sorting Algorithms:
### Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort):

**Bubble Sort:**  
- Simple comparison-based algorithm.
- Swaps adjacent elements if they are in the wrong order.
- Time complexity: `O(n^2)`.

**Insertion Sort:**  
- Builds the sorted array one item at a time.
- Time complexity: `O(n^2)` for average and worst cases, `O(n)` for best case.

**Quick Sort:**  
- Divide-and-conquer algorithm.
- Picks a pivot element and partitions the array around the pivot.
- Time complexity: `O(n log n)` on average, `O(n^2)` in the worst case.

**Merge Sort:**  
- Divide-and-conquer algorithm.
- Divides the array into halves, sorts them, and merges them.
- Time complexity: `O(n log n)`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as this markdown file.

## Analysis:
### Compare the performance (time complexity) of Bubble Sort and Quick Sort:
**Bubble Sort:**  
- Time Complexity: `O(n^2)` for all cases.
- Space Complexity: `O(1)`(in-place sorting).

**Quick Sort:**  
- Time Complexity: `O(n log n)` on average, `O(n^2)` in the worst case.
- Space Complexity: `O(log n)` for recursive calls.

### Discuss why Quick Sort is generally preferred over Bubble Sort:
- Quick Sort is generally faster than Bubble Sort for large datasets due to its average-case time complexity of `O(n log n)`.
- Bubble Sort's `O(n^2)` time complexity makes it inefficient for large datasets.
- Quick Sort is more efficient in terms of comparisons and swaps compared to Bubble Sort.
