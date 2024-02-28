package class4;

import java.util.Scanner;

/**
 * write a program with method named getNetSalary
 * and taking 10% of the gross salary.
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter gross Salary: ");
        double grossSalary = scanner.nextDouble();

        System.out.println("Net salary is: "+getNetSalary(grossSalary));

        scanner.close();
    }

    static double getNetSalary(double grossSalary) {
        double ratio = 10;
        return grossSalary - (grossSalary * ratio / 100);
    }
}


