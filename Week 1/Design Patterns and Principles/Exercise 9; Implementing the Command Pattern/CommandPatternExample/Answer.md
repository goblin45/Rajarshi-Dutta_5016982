# Exercise 9: Implementing the Command Pattern

## Create a New Java Project:
- **Project Name:** CommandPatternExample

## Define Command Interface:

### Command Interface:
- **Methods:** 
  - `execute()`: Defines the method to execute a command.

## Implement Concrete Commands:

### LightOnCommand Class:
- **Implements:** `Command`
- **Methods:**
  - `execute()`: Implements the logic to turn the light on.

### LightOffCommand Class:
- **Implements:** `Command`
- **Methods:**
  - `execute()`: Implements the logic to turn the light off.

## Implement Invoker Class:

### RemoteControl Class:
- **Attributes:**
  - `Command command`: Holds a reference to the current command.
- **Methods:**
  - `void execute()`: Executes the current command by calling its `execute()` method.

## Implement Receiver Class:
The implementation of the `Light` class with methods to turn on and off is omitted in this exercise, as the `LightOnCommand` and `LightOffCommand` classes directly execute their respective actions. 

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Command Implementation:

### Testing:
- **Scenario:** Demonstrate issuing commands using the `RemoteControl`.
  - **Commands:** `LightOnCommand`, `LightOffCommand`
  - **Execution:** The `RemoteControl` class holds and executes the commands.