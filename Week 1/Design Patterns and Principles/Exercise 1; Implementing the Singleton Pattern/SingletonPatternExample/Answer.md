# Exercise 1: Implementing the Singleton Pattern

## Create a New Java Project:
- **Project Name:** SingletonPatternExample

## Define a Singleton Class:

### Logger Class:
- **Private Static Instance:** The `Logger` class contains a private static variable `logger` to hold the single instance.
- **Private Constructor:** The constructor `Logger()` is private to prevent direct instantiation from outside the class.
- **Public Static Method:** The `getInstance()` method provides a global point of access to the `Logger` instance and ensures that only one instance is created.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Singleton Implementation:

### Testing:
- **Obtain Instances:** Two references, `logger1` and `logger2`, are obtained using the `getInstance()` method.
- **Instance Check:** The test checks if `logger1` and `logger2` refer to the same instance.
  - **Expected Output:** Since only one instance should be created, the output confirms that `logger1` and `logger2` refer to the same instance.


## Analysis:
- **Ensuring Singleton:** The use of a private constructor and a static `getInstance()` method ensures that only one instance of the `Logger` class is created and used throughout the application.
- **Usage:** This pattern is useful in scenarios where a single instance of a class is needed, such as for logging or configuration management.