import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of subjects
        int numberOfSubjects = 5;
        double total = 0.0;
        
        // Collect grades
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter grade for subject " + i + ": ");
            double grade = scanner.nextDouble();
            total += grade;
        }
        
        // Calculate average
        double average = total / numberOfSubjects;
        System.out.println("Average grade: " + average);
        
        // Determine final grade
        char finalGrade;
        if (average >= 90) {
            finalGrade = 'A';
        } else if (average >= 80) {
            finalGrade = 'B';
        } else if (average >= 70) {
            finalGrade = 'C';
        } else if (average >= 60) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }
        
        System.out.println("Final Grade: " + finalGrade);
        
        scanner.close();
    }
}