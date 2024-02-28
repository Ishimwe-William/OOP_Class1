package classWork3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        double avg;

        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < 6; a++) {
            System.out.println("Enter Salary for Employee " + (a + 1));
            arr[a] = scanner.nextInt();
        }

        int sum = 0;
        for (int s = 0; s < 6; s++) {
            sum = sum + arr[s];
        }
        System.out.println(sum);
        avg = sum / 6;

        System.out.println("The average: " + avg);
        for (int i = 0; i < 6; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i] + " ");
            }
        }
        scanner.close();
    }

}
