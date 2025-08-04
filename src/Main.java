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
