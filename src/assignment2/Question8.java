package assignment2;

/**
 * 8. Take input of age of 3 people by user and determine oldest and youngest among them
*/
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the ages of three people
        System.out.println("Enter age of person 1: ");
        int age1 = scanner.nextInt();

        System.out.println("Enter age of person 2: ");
        int age2 = scanner.nextInt();

        System.out.println("Enter age of person 3: ");
        int age3 = scanner.nextInt();

        // Determine the oldest and youngest
        int oldest = Math.max(Math.max(age1, age2), age3);
        int youngest = Math.min(Math.min(age1, age2), age3);

        // Display the results
        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);

        // Close the scanner
        scanner.close();
    }
}
