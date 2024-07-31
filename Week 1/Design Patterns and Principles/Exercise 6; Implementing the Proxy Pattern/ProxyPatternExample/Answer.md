# Exercise 7: Implementing the Proxy Pattern

## Create a New Java Project:
- **Project Name:** ProxyPatternExample

## Define Subject Interface:

### Image Interface:
- **Methods:** 
  - `display()`: Displays the image.
  - `getImage()`: Returns the image object.

## Implement Real Subject Class:

### RealImage Class:
- **Implements:** `Image`
- **Constructor:** Takes a URL as input and loads the image from the remote server.
- **Methods:**
  - `loadImage()`: Loads the image from the given URL.
  - `display()`: Displays the image.
  - `getImage()`: Returns the loaded image.

## Implement Proxy Class:

### ProxyImage Class:
- **Implements:** `Image`
- **Holds Reference:** To `RealImage`
- **Features:**
  - **Lazy Initialization:** Loads the image only when it is needed.
  - **Caching:** Stores the image after the first load to avoid reloading it.

## Implementation:
The implementation has already been provided in the `Main.java` file in the same folder as of this very markdown file.

## Test the Proxy Implementation:

### Testing:
- **Scenario:** Demonstrate lazy loading and caching by using `ProxyImage` to load and display images.
  - **First Load:** Image is loaded from the server.
  - **Second Load:** Image is displayed from cache.