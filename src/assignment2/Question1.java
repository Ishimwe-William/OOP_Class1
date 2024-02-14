package assignment2;

import java.util.Scanner;

/**
 * 1. Write the java statement that assigns 1 to x if y is greater than 0
 */

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("Enter the value of y");
        y = scanner.nextInt();

        System.out.println("Enter the value of x");
        x = scanner.nextInt();

        System.out.println("Value before updating\n x= "+ x +"\n y= " +y);

        x = (y > 0) ? (x + 1) : x;
        System.out.println("Value after updating\n x= "+ x +"\n y= " +y);
        scanner.close();
    }


}
