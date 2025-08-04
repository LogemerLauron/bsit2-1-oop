public class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;

        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("=== Book Details ===");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Pages      : " + pages);
        System.out.println("Available? : " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("'" + title + "' has been borrowed.");
        } else {
            System.out.println("'" + title + "' is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("'" + title + "' has been returned. It is now available.");
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }
}
public class BookApp {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book2 = new Book("1984", "George Orwell", 328);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        System.out.println();

        // Displaying book info
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Borrowing and returning books
        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();

        book2.borrowBook();
        book2.borrowBook();  // trying to borrow again
        book2.returnBook();

        book3.displayInfo(); // untouched book
    }
}
