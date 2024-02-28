package classWork3;

import java.util.Scanner;

public class Questin6S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        switch (number%2==0 ? 0 : 1) {
            case 0 -> System.out.println("Even");
            case 1 -> System.out.println("odd");
            default -> System.out.println("Wrong input");
        }
    }
}
