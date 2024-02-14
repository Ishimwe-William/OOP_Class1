package assignment2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        double salary, bonus = 0;
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary amount: ");
        salary = scanner.nextDouble();

        System.out.println("Enter year of service: ");
        year = scanner.nextInt();

        // Input validation
        if (salary < 0 || year < 0) {
            System.out.println("Invalid input. Salary and year of service should be non-negative.");
            scanner.close();
            return;
        }

        if ((LocalDateTime.now().getYear() - year) >= 5) {
            bonus = salary * 0.05;
        }

        // Display bonus with two decimal places
        System.out.println("Your net bonus is: " + String.format("%.2f", bonus));

        // Close the Scanner
        scanner.close();
    }
}
