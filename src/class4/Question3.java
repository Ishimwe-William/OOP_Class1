package class4;

import java.util.Scanner;

/**
 * Write a method named isEven that accepts an int argument. The method
 * should return true if the argument is even, or false otherwise. Also
 * write a program to test your method.
 */

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();

        System.out.println("Is you number even? "+ isEven(number));

        scanner.close();

    }

    static boolean isEven(int number) {
        return (number % 2 == 0);
    }

}
