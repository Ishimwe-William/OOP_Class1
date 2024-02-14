package assignment2;

import java.util.Scanner;

/**
 * 10.Write a program to check whether an entered character is lowercase ( a to z ) or uppercase ( A to Z ).
 **/
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character: ");
        char letter = scanner.next().charAt(0);

        if (Character.isLowerCase(letter)) {
            System.out.println("It's lowercase letter");
        } else if (Character.isUpperCase(letter)) {
            System.out.println("It's uppercase letter");
        } else {
            System.out.println("Not either!");
        }
        scanner.close();
    }

}
