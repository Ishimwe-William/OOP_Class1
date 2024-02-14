package ooppkg;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char enChr = scanner.next().charAt(0);
        System.out.println("The ASCII value of " + enChr + " is: " + (int) enChr);
    }
}