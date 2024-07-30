# Exercise 2: E-commerce Platform Search Function

## Understand Asymptotic Notation:
### Big O Notation:
Big O notation is a mathematical notation used to describe the upper bound of an algorithm's running time. It helps in analyzing the efficiency of algorithms by providing a high-level understanding of their time or space complexity in relation to the input size.

### Best, Average, and Worst-Case Scenarios for Search Operations:
- **Best Case:** The scenario where the operation takes the least amount of time. For example, finding the target element at the first position in a linear search (O(1)).
- **Average Case:** The scenario representing the expected running time for an operation over all possible inputs.
- **Worst Case:** The scenario where the operation takes the longest amount of time. For example, finding the target element at the last position in a linear search (O(n)).

## Setup:
Create a class `Product` with attributes for searching, such as `productId`, `productName`, and `category`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as this markdown file.

## Time Complexity Analysis:
### Linear Search:
**Operation:** `linearSearchById(List<Product> products, int productId)`  
**Time Complexity:** O(n)  
**Explanation:** Linear search checks each element one by one, leading to a time complexity of O(n) in the worst case.

### Binary Search:
**Operation:** `binarySearchById(List<Product> products, int productId)`  
**Time Complexity:** O(log(n))  
**Explanation:** Binary search repeatedly divides the search interval in half, resulting in a time complexity of O(log(n)) for sorted arrays.

## Comparison and Suitability:
### Comparison:
- **Linear Search:** O(n)
- **Binary Search:** O(log(n))

### Suitability:
Binary search is more suitable for the e-commerce platform as it provides significantly faster search times compared to linear search, especially for large datasets. However, it requires the data to be sorted, which can add additional overhead during the insertion of new products.

## Optimization Discussion:
### Data Access Patterns:
Understanding how products are accessed and updated can help optimize data structures. For example, if frequent range queries are needed, a different structure like a balanced binary search tree might be more appropriate.

### Memory Usage:
HashMap can be memory-intensive. If memory usage becomes a concern, alternative structures like linked lists (for small inventories) or tree-based maps (like TreeMap) might be considered.

### Concurrency:
For multi-threaded environments, concurrent data structures like `ConcurrentHashMap` can be used to handle simultaneous updates efficiently.
