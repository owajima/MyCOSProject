/*
 * File:    ErrorExample.java
 * Course:  COS 201 - Computer Programming I
 * Week 2:  Development Environment and First Java Program
 * Student: Emmanuel Johnson Owajima (25/16530)
 *
 * This is the CORRECTED version of a program that was first written with
 * deliberate mistakes, to practise reading and fixing compiler errors.
 *
 * Original code (with errors):
 *
 *   1  public class ErrorExample {
 *   2      public static void main(String[] args) {
 *   3          System.out.println("Learning to read compiler errors")
 *   4          system.out.println("Java is case-sensitive");
 *   5          System.out.println("Every string needs a closing quote);
 *   6      }
 *
 * First compile (javac ErrorExample.java) reported 3 errors:
 *   Line 3: error: ';' expected
 *           -> added the missing semicolon at the end of the statement.
 *   Line 5: error: unclosed string literal
 *           -> added the closing double quote before the bracket.
 *   Line 6: error: reached end of file while parsing
 *           -> added the closing brace } for the class.
 *
 * Second compile reported 1 more error:
 *   Line 4: error: package system does not exist
 *           -> changed "system" to "System". Java is case-sensitive.
 *
 * Lesson: javac checks spelling and punctuation (syntax) first, so some
 * errors only appear after the earlier ones are fixed. Fix the first
 * error, compile again, and repeat until there are no errors.
 */
public class ErrorExample {

    public static void main(String[] args) {
        System.out.println("Learning to read compiler errors");
        System.out.println("Java is case-sensitive");
        System.out.println("Every string needs a closing quote");
    }
}
