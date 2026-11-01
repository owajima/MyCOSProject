import java.util.Scanner;

/*
 * File:    AverageCalculator.java
 * Course:  COS 201 - Computer Programming I
 * Week 3:  Variables, Data Types, Expressions and Input/Output
 * Student: Emmanuel Johnson Owajima (25/16530)
 *
 * Reads a student's name and scores in three courses, then displays the
 * total and the average score.
 *
 * Extension: every score must be between 0 and 100. Any other value is
 * rejected with a message instead of giving a wrong average.
 */
public class AverageCalculator {

    public static void main(String[] args) {
        // Constants (final) hold values that never change.
        final int NUMBER_OF_COURSES = 3;
        final double MIN_SCORE = 0.0;
        final double MAX_SCORE = 100.0;

        Scanner input = new Scanner(System.in);

        System.out.println("=========== AVERAGE CALCULATOR ===========");

        // The name is read first with nextLine(), which reads the whole
        // line, so names with spaces work.
        System.out.print("Enter student name: ");
        String studentName = input.nextLine().trim();
        if (studentName.isEmpty()) {
            System.out.println("Invalid input. Student name cannot be empty.");
            input.close();
            return;
        }

        System.out.print("Enter score for Course 1: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double score1 = input.nextDouble();

        System.out.print("Enter score for Course 2: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double score2 = input.nextDouble();

        System.out.print("Enter score for Course 3: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double score3 = input.nextDouble();

        // Extension: reject any score below 0 or above 100.
        if (score1 < MIN_SCORE || score1 > MAX_SCORE
                || score2 < MIN_SCORE || score2 > MAX_SCORE
                || score3 < MIN_SCORE || score3 > MAX_SCORE) {
            System.out.println("Invalid score. Each score must be between 0 and 100.");
            input.close();
            return;
        }

        // Processing: total and average.
        double total = score1 + score2 + score3;
        double average = total / NUMBER_OF_COURSES;

        // Output
        System.out.println();
        System.out.println("----------------- RESULT -----------------");
        System.out.println("Student Name   : " + studentName);
        System.out.printf("Course 1 Score : %.2f%n", score1);
        System.out.printf("Course 2 Score : %.2f%n", score2);
        System.out.printf("Course 3 Score : %.2f%n", score3);
        System.out.printf("Total Score    : %.2f%n", total);
        System.out.printf("Average Score  : %.2f%n", average);
        System.out.println("==========================================");

        input.close();
    }
}
