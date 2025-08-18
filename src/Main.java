public class Main {
    public static void mai (string[] args) {
        GradeCalculator gc = new GradeCalculator();

        String StudentName = "Logemer Lauron";
        double average = gc.calculatorAverage(  85.5, 92.0, 78.5, 90.0 );
        String letterGrade = gc.getLetterGrade(average);

        gc.displayResult(studentName, average);
        gc.displayResult(studentName, average, letterGrade);

    }
}