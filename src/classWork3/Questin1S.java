package classWork3;

import java.util.Scanner;

public class Questin1S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark category: ");
        char letter=scanner.next().toLowerCase().charAt(0);
        switch (letter) {
            case 'a' -> System.out.println("80-100");
            case 'b' -> System.out.println("70-69");
            default -> System.out.println("0-69");
        }
    }
}
