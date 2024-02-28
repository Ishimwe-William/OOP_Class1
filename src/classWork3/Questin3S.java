package classWork3;

import java.util.Scanner;

public class Questin3S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'M' for male and 'F' for female: ");
        char gender=scanner.next().toLowerCase().charAt(0);
        switch (gender) {
            case 'm' -> System.out.println("Male");
            case 'f' -> System.out.println("Female");
            default -> System.out.println("Wrong input");
        }
    }
}
