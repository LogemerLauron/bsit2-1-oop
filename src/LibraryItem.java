abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;
    protected String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
        this.borrowerName = "";
    }

    public String getItemInfo() {
        return getItemType() + ": " + title + " by " + author + " (" + getBorrowingStatus() + ")";
    }

    public void checkOut(String borrowerName) {
        this.isCheckedOut = true;
        this.borrowerName = borrowerName;
    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.borrowerName = "";
    }

    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);

    public String getBorrowingStatus() {
        return isCheckedOut ? "Currently borrowed" : "Available for borrowing";
    }
}
