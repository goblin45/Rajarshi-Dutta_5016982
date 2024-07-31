# Exercise 5: Implementing the Decorator Pattern

## Create a New Java Project:
- **Project Name:** DecoratorPatternExample

## Define Component Interface:

### Notifier Interface:
- **Methods:** `Notifier` interface defines a method `send(String message)`.

## Implement Concrete Component:

### EmailNotifier Class:
- **Implements:** `Notifier`
- **send():** Sends a notification via email.

## Implement Decorator Classes:

### NotifierDecorator Abstract Class:
- **Extends:** `Notifier`
- **Composition:** Holds a reference to a `Notifier` object.
- **Purpose:** Provides a base for concrete decorators.

### Concrete Decorators:
- **SMSNotifier:** Extends `NotifierDecorator` to add SMS notification functionality.
- **SlackNotifier:** Extends `NotifierDecorator` to add Slack notification functionality.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Decorator Implementation:

### Testing:
- **Demonstrate:** Use decorators to send notifications via multiple channels.
  - **Example:** Combine `EmailNotifier`, `SMSNotifier`, and `SlackNotifier` to send a message through email, SMS, and Slack.
