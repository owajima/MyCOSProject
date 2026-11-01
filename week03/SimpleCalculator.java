import java.util.Scanner;

/*
 * File:    SimpleCalculator.java
 * Course:  COS 201 - Computer Programming I
 * Week 3:  Variables, Data Types, Expressions and Input/Output
 * Student: Emmanuel Johnson Owajima (25/16530)
 *
 * Reads two numbers from the keyboard and displays their sum, difference,
 * product, quotient and remainder. The second number is checked before
 * dividing, so the program never divides by zero.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=========== SIMPLE CALCULATOR ===========");

        // Input: read two numbers. hasNextDouble() checks that the user
        // typed a number before nextDouble() tries to read it.
        System.out.print("Enter the first number: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double secondNumber = input.nextDouble();

        // Processing: arithmetic expressions.
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Output: printf("%.2f") shows each answer to 2 decimal places.
        System.out.println();
        System.out.println("---------------- RESULTS ----------------");
        System.out.printf("Sum        : %.2f%n", sum);
        System.out.printf("Difference : %.2f%n", difference);
        System.out.printf("Product    : %.2f%n", product);

        // Division by zero is not allowed, so check the divisor first.
        if (secondNumber == 0) {
            System.out.println("Quotient   : Cannot divide by zero.");
            System.out.println("Remainder  : Cannot divide by zero.");
        } else {
            double quotient = firstNumber / secondNumber;
            double remainder = firstNumber % secondNumber;
            System.out.printf("Quotient   : %.2f%n", quotient);
            System.out.printf("Remainder  : %.2f%n", remainder);
        }
        System.out.println("=========================================");

        input.close();
    }
}
