package assnment1;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 11: Write a program to compute the area of a hexagon.
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question11 {
    public static void main(String[] args) {
        double sideLength = 7.0; // Example side length of the hexagon
        double area = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;

        System.out.println("Area of the hexagon: " + area);
    }
}
