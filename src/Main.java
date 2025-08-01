import javautil.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int number;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();
            total += number;
        }


        System.out.println("\nTotal Number: " + total);
        scanner.close();
    }.
}
