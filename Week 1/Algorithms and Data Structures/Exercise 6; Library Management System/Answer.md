# Book Search System

## Understand Search Algorithms:

### Linear Search:
- **Description:** Linear search checks each element in the list sequentially until the desired element is found or the end of the list is reached.
- **Time Complexity:** O(n), where n is the number of elements in the list.
- **Advantages:** Simple to implement and works on unsorted data.
- **Disadvantages:** Inefficient for large lists as it may require checking every element.

### Binary Search:
- **Description:** Binary search divides the list into halves and repeatedly compares the target value with the middle element to narrow down the search range.
- **Time Complexity:** O(log n), where n is the number of elements in the list.
- **Advantages:** Much faster than linear search for large, sorted lists.
- **Disadvantages:** Requires the list to be sorted beforehand.

## Setup:
Create a class `Book` with attributes like `bookId`, `title`, and `author`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Analysis:

### Linear Search:
- **Time Complexity:** `O(n)` - In the worst case, each element in the list might need to be checked.
- **Suitable For:** Small or unsorted lists where sorting isn't feasible.

### Binary Search:
- **Time Complexity:** `O(log n)` - Efficient for large lists if the list is sorted.
- **Suitable For:** Large sorted lists where quick search performance is critical.

### Advantages of Linked Lists Over Arrays for Dynamic Data:
- **Dynamic Size:** Linked lists can easily grow or shrink in size as needed, unlike arrays which have a fixed size.
- **Efficient Insertions/Deletions:** Insertions and deletions in linked lists are more efficient because they only require updating pointers, whereas arrays may require shifting elements.
- **Memory Usage:** Linked lists use memory more efficiently for operations that frequently change the size of the dataset.
