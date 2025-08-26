public class GradeCalculator {
    static class calculateAverage(double... grades)
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "BSIT", 85, 90, 88);
        Student student2 = new Student("Bob", 21, "BSCS", 60, 65, 58);
        Student student3 = new Student("Carol", 19, "BSIS", 70, 75, 72);

        Student[] students = {student1, student2, student3};

        int passingCount = 0;

        for (Student student : students) {
            System.out.println("\n===== STUDENT INFORMATION =====");
            student.displayInfo();
            double avg = student.calculateAverage();
            System.out.printf("Average Grade: %.2f\n", avg);
            System.out.println("Letter Grade: " + student.getLetterGrade());
            String status = student.isPassing() ? "PASSING" : "FAILING";
            System.out.println("Status: " + status);

            if (student.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("\nTotal number of PASSING students: " + passingCount);
    }
}
