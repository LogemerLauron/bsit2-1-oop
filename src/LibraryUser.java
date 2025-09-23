interface LibraryUser {
    String getUserType();
    void borrowMedia(Media media);
    void returnMedia(Media media);
    int getMaxBorrowLimit();
}

class Student implements LibraryUser {
    private String name;
    private String studentId;
    private int borrowedCount = 0;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getUserType() {
        return "Student";
    }

    public int getMaxBorrowLimit() {
        return 3;
    }

    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            borrowedCount++;
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    public void returnMedia(Media media) {
        media.returnItem();
        borrowedCount--;
    }
}

class Teacher implements LibraryUser {
    private String name;
    private String employeeId;
    private int borrowedCount = 0;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getUserType() {
        return "Teacher";
    }

    public int getMaxBorrowLimit() {
        return 5;
    }

    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            borrowedCount++;
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    public void returnMedia(Media media) {
        media.returnItem();
        borrowedCount--;
    }
}

class Librarian implements LibraryUser {
    private String name;
    private String employeeId;
    private int borrowedCount = 0;

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getUserType() {
        return "Librarian";
    }

    public int getMaxBorrowLimit() {
        return 10;
    }

    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            borrowedCount++;
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    public void returnMedia(Media media) {
        media.returnItem();
        borrowedCount--;
    }
}
