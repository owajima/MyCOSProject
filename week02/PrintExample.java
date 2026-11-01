/*
 * File:    PrintExample.java
 * Course:  COS 201 - Computer Programming I
 * Week 2:  Development Environment and First Java Program
 * Student: Emmanuel Johnson Owajima (25/16530)
 *
 * Shows the difference between print() and println(), how escape
 * sequences work, and how the + operator joins text together.
 */
public class PrintExample {

    public static void main(String[] args) {
        // 1. print() keeps the cursor on the same line.
        System.out.print("COS 201 ");
        System.out.print("- Computer Programming I");
        System.out.println(); // an empty println() just moves to a new line

        // 2. println() moves to a new line after printing.
        System.out.println("This line was printed with println().");
        System.out.println("So this one starts on a new line.");

        // 3. Escape sequences.
        System.out.println("Tab (\\t):       Name\tMatric No.");
        System.out.println("New line (\\n):  first line\n                second line");
        System.out.println("Quote (\\\"):     Java is \"case-sensitive\".");
        System.out.println("Backslash (\\\\): C:\\COS201\\week02");

        // 4. Joining text with +.
        System.out.println("Student: " + "Emmanuel Johnson Owajima");
        System.out.println("2 + 3 inside text gives " + 2 + 3);
        System.out.println("2 + 3 in brackets gives " + (2 + 3));
    }
}
