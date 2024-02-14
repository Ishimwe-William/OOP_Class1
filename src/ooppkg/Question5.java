package ooppkg;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Choose Operation: \n1. +\n2. -\n3. *\n4. /\n5. %");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1 -> System.out.println("Sum is: " + (number1 + number2));
            case 2 -> System.out.println("Difference is: " + (number1 - number2));
            case 3 -> System.out.println("Product is: " + (number1 * number2));
            case 4 -> System.out.println("Quotient is: " + (number1 / number2));
            case 5 -> System.out.println("Remainder is: " + (number1 % number2));
            default -> System.out.println("Wrong choice!");
        }
    }
}
