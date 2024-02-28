package classWork3;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int x=scanner.nextInt();

        if(x<1000)
            for (int i = 10; i < 200; i++) {
                System.out.println(i+" ");
            }

    }
}
