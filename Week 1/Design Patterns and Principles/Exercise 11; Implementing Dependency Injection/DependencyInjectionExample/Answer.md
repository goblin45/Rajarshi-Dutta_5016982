# Exercise 11: Implementing Dependency Injection

## Create a New Java Project:
- **Project Name:** DependencyInjectionExample

## Define Repository Interface:

### CustomerRepository Interface:
- **Methods:**
  - `void findCustomerById(int id)`: Finds a customer by their ID.

## Implement Concrete Repository:

### CustomerRepositoryImpl Class:
- **Attributes:**
  - `List<Customer> customers`: A list to store `Customer` objects.
- **Constructor:**
  - `CustomerRepositoryImpl()`: Initializes the `customers` list and adds some predefined customers.
- **Methods:**
  - `void findCustomerById(int id)`: Searches for a customer in the list by ID and displays the customer if found; otherwise, prints a message indicating the customer was not found.

## Define Service Class:

### Customer Class:
- **Attributes:**
  - `int id`: Customer ID.
  - `String name`: Customer name.
- **Constructor:**
  - `Customer(int id, String name)`: Initializes the `Customer` object with the given `id` and `name`.
- **Methods:**
  - `void display()`: Displays the customer details.

## Implement Dependency Injection:

### Constructor Injection:
- Dependency injection is implemented using constructor injection in the `Main` class, where an instance of `CustomerRepositoryImpl` is passed to the `CustomerRepository` interface.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Dependency Injection Implementation:

### Main Class:
- **Scenario:** Demonstrate creating a `CustomerRepositoryImpl`, injecting it into the `CustomerRepository`, and using it to find and display customer details.
