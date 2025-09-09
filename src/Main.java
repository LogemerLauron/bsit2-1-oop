import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
        System.out.println("Rating " + rating + " added successfully");
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.size();
    }

    public String getRatingLevel() {
        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        else if (avg >= 4.0) return "Good";
        else if (avg >= 3.0) return "Average";
        else return "Poor";
    }

    public void displayBookInfo() {
        System.out.printf("Book: %s by %s, Average Rating: %.2f, Level: %s%n",
                title, author, getAverageRating(), getRatingLevel());
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
