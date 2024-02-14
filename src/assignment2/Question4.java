package assignment2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * 4. Write an oop statement that prints true if x is an odd number and positive
 */

public class Question4 {
    static boolean isOdd(int number){
        if(number%2==1){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();

        System.out.println("Is the number odd? " +isOdd(number));
    }

}
