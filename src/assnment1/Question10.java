package assnment1;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 10: Write a program to convert a hexadecimal value into an octal number.
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question10 {
    public static void main(String[] args) {
        String hexadecimalValue = "1F"; // Example hexadecimal value
        int decimalValue = Integer.parseInt(hexadecimalValue, 16);
        String octalValue = Integer.toOctalString(decimalValue);

        System.out.println("Hexadecimal value: " + hexadecimalValue);
        System.out.println("Octal equivalent: " + octalValue);
    }
}
