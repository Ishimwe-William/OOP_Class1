package assnment1;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 7: Write a program to print the area and perimeter of a rectangle.
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question7 {
    public static void main(String[] args) {
        double length = 8.0;
        double width = 4.0;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
