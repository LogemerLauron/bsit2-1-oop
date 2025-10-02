import java.util.ArrayList;
import java.util.Map;

class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() { items = new ArrayList<>(); }

    public void addItem(Borrowable item) {
        items.add(item);
        if (item instanceof Book) {
            Book b = (Book) item;
            System.out.println("Added: Book - " + b.title + " by " + b.author);
        } else if (item instanceof Magazine) {
            Magazine m = (Magazine) item;
            System.out.println("Added: Magazine - " + m.title + " by " + m.author);
        } else if (item instanceof DVD) {
            DVD d = (DVD) item;
            System.out.println("Added: DVD - " + d.title + " by " + d.author);
        }
    }

    public void displayAllItems() {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                System.out.println(((LibraryItem) item).getItemInfo());
            }
        }
    }

    public void borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                if (libItem.itemId.equals(itemId) && item.isAvailable()) {
                    item.borrowItem(borrowerName);
                    System.out.println(borrowerName + " borrowed: " + libItem.title);
                    return;
                }
            }
        }
    }

    public void returnItem(String itemId) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                if (libItem.itemId.equals(itemId) && !item.isAvailable()) {
                    item.returnItem();
                    System.out.println(libItem.title + " has been returned.");
                    return;
                }
            }
        }
    }

    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable() && item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                System.out.println(libItem.getItemType() + ": " + libItem.title + " (" + item.getBorrowingStatus() + ")");
            }
        }
    }

    public void calculateTotalLateFees(Map<String, Integer> lateItems) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                if (lateItems.containsKey(libItem.title)) {
                    int daysLate = lateItems.get(libItem.title);
                    System.out.println(libItem.title + " - " + daysLate + " days late: $" + libItem.calculateLateFee(daysLate));
                }
            }
        }
    }
}