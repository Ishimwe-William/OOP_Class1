package class4;

import java.util.Scanner;

/**
 * Write a program with a method named getTotal that accepts two integers as an
 * argument and return its sum. Call this method from main( ) and print the results.
 */

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        scanner.close();

        System.out.println("The sum is: "+getTotal(number1,number2));
    }

    static int getTotal(int a, int b){
        return a+b;
    }
}
