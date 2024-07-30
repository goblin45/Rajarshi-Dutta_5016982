# Exercise 1: Inventory Management System
## Understand the Problem:
### Importance of Data Structures and Algorithms:
Data structures and algorithms are essential in handling large inventories for several reasons:

**1. Efficiency:** They provide efficient ways to store, retrieve, and manipulate data. Operations such as searching, inserting, updating, and deleting can be optimized to reduce time complexity. \
**2. Scalability:** Proper data structures help manage large volumes of data without significant performance degradation, ensuring the system can scale as the inventory grows.
**3. Maintenance:** Well-chosen data structures can make the codebase easier to maintain and extend, enabling quick adaptation to changing requirements.

### Suitable Data Structures:
**1. ArrayList:** Provides dynamic array capabilities with quick access by index. Suitable for ordered collections but can be inefficient for frequent insertions and deletions. \
**2. HashMap:** Offers average `O(1)` time complexity for insertions, deletions, and lookups. It is ideal for managing inventory where fast access to products by their unique ID is required.

## Setup:
As this one was a short project, I preferred to make it simple and put all the three needed classes -> `Product`, `Inventory` and `Main` (driver) into a single file `Main.java`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Time Complexity Analysis:
### Add Product:

**Operation:** ` addProduct(Product p)` \
**Data Structure:** `HashMap` \
**Time Complexity:** `O(1)` on average \
**Explanation:** Adding a product to a HashMap involves calculating the hash and inserting the product, which is typically `O(1)`.

### Update Product:

**Operation:** `updateProduct(int productId, String productName, int price, int quantity)` \
**Data Structure:** `HashMap` \
**Time Complexity:** `O(1)` on average \
**Explanation:** Updating a product requires accessing the product by its ID, which is `O(1)` in a `HashMap`. Individual attribute updates `(name, price, quantity)` are also `O(1)`.

### Delete Product:

**Operation:** `deleteProduct(int productId)` \
**Data Structure:** `HashMap` \
**Time Complexity:** `O(1)` on average \
**Explanation:** Removing a product by its ID from a HashMap is `O(1)` on average, involving a hash calculation and removal.

# Optimization Discussion:

## Data Access Patterns: 
Understanding how products are accessed and updated can help optimize data structures. For example, if frequent range queries are needed, a different structure like a balanced `binary search tree` might be more appropriate.
## Memory Usage: 
HashMap can be memory-intensive. If memory usage becomes a concern, alternative structures like `linked lists` (for small inventories) or tree-based maps (like `TreeMap`) might be considered.
## Concurrency:
For multi-threaded environments, concurrent data structures like `ConcurrentHashMap` can be used to handle simultaneous updates efficiently.