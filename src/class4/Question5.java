package class4;

import java.util.Scanner;

/**
 *A non-negative integer is called a palindrome if it reads forward and backward
 *  in the same way. For example, the numbers 5, 121, 3443, and 123454321 are
 *  palindromes. Write a method that takes as input a non-negative integer and
 *  returns true if the number is a palindrome; otherwise, it returns false. Also
 *  write a program to test your method.
 */

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println("Is you number even? "+ isPalindrome(number));
    }

    static boolean isPalindrome(int number){
//        int arr[] = new int[];
        return true;
    }
}
