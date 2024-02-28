package classWork3;

import java.util.Scanner;

public class Questin4S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        switch (age >= 18 ? 1 : 0) {
            case 1 -> System.out.println("Eligible for vote");
            case 0 -> System.out.println("Not eligible");
            default -> System.out.println("Wrong input");
        }
    }
}
