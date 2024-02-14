package assnment1;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 9: Write a program to convert an octal number to a hexadecimal number.
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question9 {
    public static void main(String[] args) {
        String octalNumber = "35"; // Example octal number
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        System.out.println("Octal number: " + octalNumber);
        System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);
    }
}
