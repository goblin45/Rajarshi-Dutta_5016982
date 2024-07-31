# Exercise 4: Implementing the Adapter Pattern

## Create a New Java Project:
- **Project Name:** AdapterPatternExample

## Define Target Interface:

### PaymentProcessor Interface:
- **Methods:** `PaymentProcessor` interface defines a method `processPayment(double amount)`.

## Implement Adaptee Classes:

### Payment Gateways:
- **UPIPaymentGateway:** A class with a method `makePayment(double amount)`.
- **CreditCardPaymentGateway:** A class with a method `makeTransaction(double amount)`.

## Implement the Adapter Class:

### Adapter Classes:
- **UPIAdapter:** Implements `PaymentProcessor` and translates `processPayment` to `makePayment`.
- **CreditCardAdapter:** Implements `PaymentProcessor` and translates `processPayment` to `makeTransaction`.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Adapter Implementation:

### Testing:
- **Demonstrate:** Use the adapters to process payments through different gateways.
  - **Example:** `UPIAdapter` and `CreditCardAdapter` are used to process payments of 100.0.
