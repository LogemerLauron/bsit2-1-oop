public class Library {
    private Book[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 10;

    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.borrowBook()) {
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book is not available for borrowing.");
            }
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.returnBook()) {
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Book is already in the library.");
            }
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("All books in library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].getTitle() + " | Author: " + books[i].getAuthor() + " | ISBN: " + books[i].getIsbn() + " | Year: " + books[i].getYearPublished() + " | Status: " + (books[i].isAvailable() ? "Available" : "Borrowed"));
        }
    }

    public void displayAvailableBooks() {
        if (bookCount == 0) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println("Title: " + books[i].getTitle() + " | Author: " + books[i].getAuthor() + " | ISBN: " + books[i].getIsbn() + " | Year: " + books[i].getYearPublished() + " | Status: " + (books[i].isAvailable() ? "Available" : "Borrowed"));
            }
        }
    }
