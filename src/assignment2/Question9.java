package assignment2;

import java.util.Scanner;

/**
 * 9. A student will not be allowed to sit in exam if his/her attendance is less than 75%.
 * Take following input from user
 * Number of classes held
 * Number of classes attended.
 * And print
 * percentage of class attended
 * Is student is allowed to sit in exam or not.
 */
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of classes held and attended
        System.out.println("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.println("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        // Calculate the attendance percentage
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        // Display the percentage of classes attended
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        // Check if the student is allowed to sit in the exam
        if (attendancePercentage >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam due to low attendance.");
        }

        // Close the scanner
        scanner.close();
    }
}
