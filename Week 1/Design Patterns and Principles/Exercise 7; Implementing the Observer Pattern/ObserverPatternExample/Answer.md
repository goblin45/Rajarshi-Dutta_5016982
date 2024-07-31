# Implementing the Observer Pattern

## Create a New Java Project:
- **Project Name:** ObserverPatternExample

## Define Subject Interface:

### Stock Interface:
- **Methods:** 
  - `register(Observer observer)`: Registers an observer.
  - `deregister(Observer observer)`: Deregisters an observer.
  - `notifyObserver()`: Notifies all registered observers of changes.

## Implement Concrete Subject:

### StockMarket Class:
- **Implements:** `Stock`
- **Attributes:**
  - `List<Observer> observers`: Maintains a list of registered observers.
- **Methods:**
  - `register(Observer observer)`: Adds an observer to the list.
  - `deregister(Observer observer)`: Removes an observer from the list.
  - `notifyObserver()`: Notifies all observers by calling their `update()` method.

## Define Observer Interface:

### Observer Interface:
- **Methods:** 
  - `update()`: Called when the subject's state changes.

## Implement Concrete Observers:

### MobileApp Class:
- **Implements:** `Observer`
- **Methods:**
  - `update()`: Prints "Mobile App Updated" when notified.

### WebApp Class:
- **Implements:** `Observer`
- **Methods:**
  - `update()`: Prints "Web App Updated" when notified.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Observer Implementation:

### Testing:
- **Scenario:** Demonstrate registration and notification of observers.
  - **Register Observers:** MobileApp and WebApp are registered with the StockMarket.
  - **Notify Observers:** StockMarket notifies all registered observers of changes.