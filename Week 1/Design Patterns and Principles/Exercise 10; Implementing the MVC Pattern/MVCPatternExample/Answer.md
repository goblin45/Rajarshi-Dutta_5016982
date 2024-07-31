# Exercise 10: Implementing the MVC Pattern

## Create a New Java Project:
- **Project Name:** MVCPatternExample

## Define Model Class:

### Student Class:
- **Attributes:**
  - `int id`: Student ID.
  - `String name`: Student Name.
  - `String grade`: Student Grade.
- **Constructor:**
  - `Student(int id, String name, String grade)`: Initializes the `Student` object with the given `id`, `name`, and `grade`.

## Define View Class:

### StudentView Class:
- **Methods:**
  - `void displayStudentDetails(Student student)`: Displays the student details by accessing the `Student` object.

## Define Controller Class:

### StudentController Class:
- **Attributes:**
  - `Student model`: Holds a reference to the `Student` model.
  - `StudentView view`: Holds a reference to the `StudentView`.
- **Constructor:**
  - `StudentController(Student model, StudentView view)`: Initializes the controller with the given `model` and `view`.
- **Methods:**
  - `void updateView()`: Updates the view by calling `displayStudentDetails()` on the `view` object with the current `model`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the MVC Implementation:

### Main Class:
- **Scenario:** Demonstrate the MVC pattern by creating a `Student`, updating its details using `StudentController`, and displaying them using `StudentView`.
  