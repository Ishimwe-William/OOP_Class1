package assnment1;

import java.util.Scanner;

/**
 * Object-Oriented Programming Assignment 1
 *
 * Question 12: Write a program to compute the area of a polygon.
 * (Note: The formula for area calculation depends on the type of polygon)
 *
 * Version 1.0
 * Date: 07 Feb 2024
 *
 * @author William Ishimwe
 *
 */

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of sides from the user
        System.out.print("Enter the number of sides of the polygon (5 and up): ");
        int numberOfSides = scanner.nextInt();

        if (numberOfSides < 5) {
            System.out.println("Number of sides should be 5 and up.");
            return;
        }

        // Get the length of each side from the user
        System.out.print("Enter the length of each side: ");
        double sideLength = scanner.nextDouble();

        // Calculate the area using the formula for a regular polygon
        double area = (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        // Display the calculated area
        System.out.println("Area of the polygon: " + area);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
