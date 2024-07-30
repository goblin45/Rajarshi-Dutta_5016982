# Exercise 7: Financial Forecasting

## Understand Recursive Algorithms:

### Concept of Recursion:
- **Definition:** Recursion is a technique where a method calls itself in order to solve smaller instances of the same problem. This approach often simplifies complex problems by breaking them down into simpler sub-problems.
- **Base Case:** The condition under which the recursion stops. Without a base case, the recursion would continue indefinitely.
- **Recursive Case:** The part of the function where the recursion happens. It usually involves solving a smaller problem and making a recursive call.

## Setup:
Create a method to calculate the future value using a recursive approach.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Analysis:

### Time Complexity:
- **Time Complexity:** `O(n)`, where n is the number of years. This is because the recursive method makes a recursive call for each year.

### Optimization:
- **Memoization:** To avoid redundant calculations, store the results of previous calculations and reuse them when needed. This can significantly reduce the number of recursive calls.
- **Iterative Approach:** For problems like financial forecasting where each step only depends on the previous step, an iterative approach can be more efficient. The iterative approach avoids the overhead associated with recursive calls and can achieve the same result with a time complexity of `O(n)` and constant space complexity.
