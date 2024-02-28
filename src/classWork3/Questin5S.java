package classWork3;

import java.util.Scanner;

public class Questin5S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        switch (firstNumber> secondNumber ? 'h' : 'l') {
            case 'h' -> System.out.println("first is higher");
            case 'l' -> System.out.println("second is higher or equal to first");
            default -> System.out.println("Wrong input");
        }
    }
}
