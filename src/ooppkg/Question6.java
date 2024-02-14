package ooppkg;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = scanner.nextDouble();

        System.out.println("The circumference is: "+((radius*2)*pi));
        System.out.println("The area is: "+(radius*radius*pi));
    }
}
