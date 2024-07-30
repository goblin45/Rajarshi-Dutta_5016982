# Exercise 5: Task Management System

## Understand Linked Lists:
### Explain the different types of linked lists (Singly Linked List, Doubly Linked List):

**Singly Linked List:**
- Each node contains data and a reference (or link) to the next node in the sequence.
- **Advantages:** Simple to implement, efficient for append operations.
- **Disadvantages:** Only allows traversal in one direction, no direct access to the previous node.

**Doubly Linked List:**
- Each node contains data, a reference to the next node, and a reference to the previous node.
- **Advantages:** Allows traversal in both directions, easier to delete a node when given a pointer to it.
- **Disadvantages:** More complex to implement, requires extra memory for the additional backward link.

## Setup:
Create a class Task with attributes like `taskId`, `taskName`, and `status`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Analysis:
### Time Complexity of Operations:
- **Add Operation:**
  - **Time Complexity:** `O(1)` (if adding at the head) or `O(n)` (if adding at the end without a tail pointer).
  - **Explanation:** Adding a node to the head of the list is `O(1)`. Adding to the end of the list requires traversing the list, making it `O(n)` without a tail pointer.

- **Search Operation:**
  - **Time Complexity:** `O(n)`
  - **Explanation:** Each node may need to be checked in the worst case.

- **Traverse Operation:**
  - **Time Complexity:** `O(n)`
  - **Explanation:** Each node must be visited once.

- **Delete Operation:**
  - **Time Complexity:** `O(n)`
  - **Explanation:** Searching for the node to delete takes `O(n)`, and deleting it takes `O(1)` once found.

### Advantages of Linked Lists over Arrays for Dynamic Data:
- **Dynamic Size:** Linked lists can easily grow and shrink in size by adding or removing nodes, unlike arrays that have a fixed size.
- **Efficient Insertions/Deletions:** Inserting or deleting nodes is more efficient in linked lists, especially for operations at the beginning or middle, as it only involves changing references.
- **No Memory Wastage:** Linked lists do not require pre-allocation of memory, preventing memory wastage associated with arrays.

### Limitations of Linked Lists:
- **Memory Overhead:** Linked lists use extra memory for storing references to the next (and previous, in the case of doubly linked lists) nodes.
- **Sequential Access:** Linked lists do not allow direct access to elements by index, leading to linear time complexity for access operations.
- **Cache Inefficiency:** Due to non-contiguous memory allocation, linked lists are less cache-friendly compared to arrays.

