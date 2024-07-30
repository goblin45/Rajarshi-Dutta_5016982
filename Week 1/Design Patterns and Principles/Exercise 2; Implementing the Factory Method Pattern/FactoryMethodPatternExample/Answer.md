# Exercise 2: Implementing the Factory Method Pattern

## Create a New Java Project:
- **Project Name:** FactoryMethodPatternExample

## Define Document Classes:

### Abstract Document Class:
- **Document Class:** The `Document` class is defined as an abstract class with an abstract method `createDocument()`.

## Create Concrete Document Classes:

### WordDocument Class:
- **WordDocument:** Implements the `createDocument()` method and prints "Word document created".

### ExcelDocument Class:
- **ExcelDocument:** Implements the `createDocument()` method and prints "Excel document created".

### PDFDocument Class:
- **PDFDocument:** Implements the `createDocument()` method and prints "PDF document created".

## Implement the Factory Method:

### DocumentFactory Class:
- **Abstract DocumentFactory:** Create an abstract class `DocumentFactory` with an abstract method `createDocument()`.

### Concrete Factory Classes:
- **WordDocumentFactory:** Extends `DocumentFactory` and implements `createDocument()` to return a new instance of `WordDocument`.
- **ExcelDocumentFactory:** Extends `DocumentFactory` and implements `createDocument()` to return a new instance of `ExcelDocument`.
- **PDFDocumentFactory:** Extends `DocumentFactory` and implements `createDocument()` to return a new instance of `PDFDocument`.

The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Factory Method Implementation:

### Testing:
- **Create Document Instances:** Demonstrate the creation of different document types using the factory method.
  - **Word Document:** Created and prints "Word document created".
  - **Excel Document:** Created and prints "Excel document created".
  - **PDF Document:** Created and prints "PDF document created".