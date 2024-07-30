# Exercise 4: Employee Management System

## Understand Array Representation:
### Explain how arrays are represented in memory and their advantages:

**Array Representation in Memory:**
- Arrays are contiguous blocks of memory where each element is stored sequentially.
- Each element in the array can be accessed using an index, which provides a constant time complexity, `O(1)`, for retrieval.

**Advantages of Arrays:**
- **Direct Access:** Allows direct access to any element using its index.
- **Cache Friendliness:** Due to contiguous memory allocation, arrays are cache-friendly.
- **Simplicity:** Easy to use and implement.

## Setup:
Create a class Employee with attributes like `employeeId`, `name`, `position`, and `salary`.

### Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Analysis:
### Time Complexity of Operations:
- **Add Operation:** 
  - **Time Complexity:** `O(1)` (when adding to the end if using an ArrayList) or `O(n)` (if resizing is needed).
  - **Explanation:** Adding an element to an array-based list is `O(1)` on average if the array has space. If resizing is required, it takes `O(n)`.

- **Search Operation:** 
  - **Time Complexity:** `O(n)` 
  - **Explanation:** In the worst case, each element may need to be checked, making it `O(n)`.

- **Traverse Operation:** 
  - **Time Complexity:** `O(n)`
  - **Explanation:** Each element must be visited once, leading to `O(n)`.

- **Delete Operation:**
  - **Time Complexity:** `O(n)`
  - **Explanation:** Searching for the element is `O(n)`, and removing it involves shifting elements, which can also be `O(n)`.

### Limitations of Arrays:
- **Fixed Size:** Arrays have a fixed size, which can lead to inefficiencies in memory usage.
- **Insertion/Deletion Costs:** Inserting or deleting elements (other than at the end) requires shifting elements, which can be costly in terms of time.
- **Static Nature:** Dynamic arrays like ArrayList in Java mitigate some of these issues, but resizing can still be costly.

### When to Use Arrays:
- Arrays are suitable when:
  - The number of elements is known in advance.
  - Frequent access to elements by index is required.
  - Memory layout and cache performance are important considerations.
