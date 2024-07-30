import java.util.*; // for List for ArrayList

class Book {
    protected int bookId;
    protected String title, author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

class Library {
    protected List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                System.out.println("Book found: ");
                return book;
            }
        }   
        return null;
    }

    public Book linearSearchByAuthor(String author) {
        for (Book book : books) {
            if (book.author.equals(author)) {
                System.out.println("Book found: ");
                return book;
            }
        }   
        return null;
    }

    public Book binarySearchByTitle(String title) {
        int low = 0, high = books.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (books.get(mid).title.equals(title)) {
                System.out.println("Book found: ");
                return books.get(mid);
            } else if (books.get(mid).title.compareTo(title) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public Book binarySearchByAuthor(String author) {
        int low = 0, high = books.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (books.get(mid).author.equals(author)) {
                System.out.println("Book found: ");
                return books.get(mid);
            } else if (books.get(mid).author.compareTo(author) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public void printBook(Book b) {
        if (b == null) {
            System.out.println("Book not found");
            return;
        }
        System.out.println("Book Id: " + b.bookId);
        System.out.println("Book Title: " + b.title);
        System.out.println("Book Author: " + b.author);
        System.out.println();
    }
}

public class Main {
    // insert 5 books
    public static void insertBooks(Library library) {
        library.books.add(new Book(1, "Book 1", "Author 1"));
        library.books.add(new Book(2, "Book 2", "Author 2"));
        library.books.add(new Book(3, "Book 3", "Author 3"));
        library.books.add(new Book(4, "Book 4", "Author 4"));
        library.books.add(new Book(5, "Book 5", "Author 5"));
    }
    public static void main(String[] args) {
        Library library = new Library();
        insertBooks(library);

        // linear search by title
        library.printBook(library.linearSearchByTitle("Book 5"));

        // linear search by author
        library.printBook(library.linearSearchByAuthor("Author 1"));

        // binary search by title
        library.printBook(library.binarySearchByTitle("Book 5"));

        // binary search by author
        library.printBook(library.binarySearchByAuthor("Author 1"));
    }
}


/*

Output: 

Book found: 
Book Id: 5
Book Title: Book 5
Book Author: Author 5

Book found: 
Book Id: 1
Book Title: Book 1
Book Author: Author 1

Book found: 
Book Id: 5
Book Title: Book 5
Book Author: Author 5

Book found: 
Book Id: 1
Book Title: Book 1
Book Author: Author 1

*/