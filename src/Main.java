import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Student ID: ");

        String studentID = scanner.nextLine();

        System.out.print("Enter First Name: ");

        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");

        String lastName = scanner.nextLine();

        System.out.print("Enter Student Course: ");

        String studentCourse = scanner.nextLine();

        System.out.print("Enter Student Section: ");

        String studentSection = scanner.nextLine();


        System.out.println("\nSTUDENT INFORMATION");

        System.out.println("Student ID: " + studentID);

        System.out.println("Student Name: " + firstName + " " + lastName);

        System.out.println("Student Course: " + studentCourse);

        System.out.println("Student Section: " + studentSection);


        System.out.print("\nEnter Midterm Exam Score: ");

        int midterm = scanner.nextInt();

        System.out.print("Enter Final Exam Score: ");

        int finals = scanner.nextInt();

        System.out.print("Enter Project Score: ");

        int project = scanner.nextInt();

        System.out.print("Enter Attendance Score: ");

        int attendance = scanner.nextInt();


        System.out.println("\nSTUDENT SCORE");

        System.out.println("Midterm Exam Score: " + midterm);

        System.out.println("Final Exam Score: " + finals);

        System.out.println("Project Score: " + project);

        System.out.println("Attendance Score: " + attendance);


        int allOverScore = midterm + finals + project + attendance;

        float averageScore = allOverScore / 400.0f * 100;


        if(averageScore * 100 >= 75){

            System.out.println("\nAverage Score: " + averageScore);

            System.out.println("PASSED");

        } else{

            System.out.println("\nAverage Score: " + averageScore);

            System.out.println("FAILED");

        }

    }

}