# Exercise 3: Implementing the Builder Pattern

## Create a New Java Project:
- **Project Name:** BuilderPatternExample

## Define a Product Class:

### Computer Class:
- **Attributes:** The `Computer` class has attributes `RAM`, `Storage`, and `CPU`.

## Implement the Builder Class:

### Nested Builder Class:
- **Builder Class:** A static nested `Builder` class inside `Computer` with methods to set each attribute.
- **Build Method:** The `Builder` class provides a `build()` method that returns an instance of `Computer`.

## Implement the Builder Pattern:

### Private Constructor:
- **Private Constructor:** The `Computer` class has a private constructor that takes the `Builder` as a parameter and assigns the attributes from the `Builder`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Builder Implementation:

### Testing:
- **Create Computer Instance:** Demonstrate the creation of a `Computer` object using the `Builder` pattern.
  - **Example Configuration:** Setting `RAM` to 16GB, `Storage` to 512GB, and `CPU` to "i5".
