abstract class Media {
    protected String title;
    protected String itemId;
    protected boolean isAvailable;

    public Media(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() {
        isAvailable = false;
        System.out.println(title + " has been borrowed");
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned");
    }

    public abstract String getMediaType();
    public abstract void displayInfo();
}

class Book extends Media {
    private String author;

    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    public String getMediaType() {
        return "Book";
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Item ID: " + itemId);
    }
}

class DVD extends Media {
    private String director;

    public DVD(String title, String itemId, String director) {
        super(title, itemId);
        this.director = director;
    }

    public String getMediaType() {
        return "DVD";
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Director: " + director + ", Item ID: " + itemId);
    }
}

class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    public String getMediaType() {
        return "Magazine";
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Issue Number: " + issueNumber + ", Item ID: " + itemId);
    }
}
