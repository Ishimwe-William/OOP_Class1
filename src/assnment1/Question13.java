package assnment1;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 13: Write a program to count letters, spaces, numbers, and other characters in an input string.
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question13 {
    public static void main(String[] args) {
        String inputString = "Hello 123 World!";

        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isSpaceChar(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Letter count: " + letterCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Other character count: " + otherCount);
    }
}
