package assnment1;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 6: Write a program to print the area and perimeter of a circle.
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question6 {
    public static void main(String[] args) {
        double radius = 5.0;

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
