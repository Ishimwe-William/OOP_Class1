package assnment1;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 8: Write a program to swap two variables.
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
