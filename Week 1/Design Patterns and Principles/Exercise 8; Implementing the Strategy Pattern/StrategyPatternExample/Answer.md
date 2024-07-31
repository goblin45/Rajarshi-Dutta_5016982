# Implementing the Strategy Pattern

## Create a New Java Project:
- **Project Name:** StrategyPatternExample

## Define Strategy Interface:

### PaymentStrategy Interface:
- **Methods:** 
  - `pay(double amount)`: Method to process the payment of a specified amount.

## Implement Concrete Strategies:

### CreditCardPayment Class:
- **Implements:** `PaymentStrategy`
- **Methods:**
  - `pay(double amount)`: Implements the payment process using a credit card.

### PayPalPayment Class:
- **Implements:** `PaymentStrategy`
- **Methods:**
  - `pay(double amount)`: Implements the payment process using PayPal.

## Implement Context Class:

### PaymentContext Class:
- **Attributes:**
  - `PaymentStrategy paymentStrategy`: Holds a reference to the current payment strategy.
- **Methods:**
  - `void executeStrategy()`: Executes the current payment strategy with a default amount (e.g., 100).

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Strategy Implementation:

### Testing:
- **Scenario:** Demonstrate selecting and using different payment strategies at runtime.
  - **Select Payment Strategy:** Choose between `CreditCardPayment` and `PayPalPayment`.
  - **Execute Payment:** Process the payment using the selected strategy.