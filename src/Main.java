
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Logemer", 20, "BSIT", 85, 90, 88);
        Student student2 = new Student("Ashton", 21, "BSCS", 60, 65, 58);
        Student student3 = new Student("Johnden", 19, "BSIS", 70, 75, 72);

        Student[] students = {student1, student2, student3};

        int passingCount = 0;

        for (Student student : students) {
            System.out.println("\n===== STUDENT INFORMATION =====");
            student.displayInfo();
            double avg = student.calculateAverage();
            System.out.printf("Average Grade: %.2f\n", avg);
            System.out.println("Letter Grade: " + Student.getLetterGrade());
            String status = student.isPassing() ? "PASSING" : "FAILING";
            System.out.println("Status: " + status);

            if (student.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("\nTotal number of PASSING students: " + passingCount);
    }
}


