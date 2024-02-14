package assignment2;

/**
 * 2. Suppose that score is a variable of type double. Write the oop statement that increases
 * the score by 5 marks if score is between 80 and 90
 */

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score;
        System.out.println("Enter the score/100: ");
        score = scanner.nextDouble();

        System.out.println("Score before updates: " +score);

        score = (score>=80 && score <=90? score+5: score);
        System.out.println("Score after updates: "+ score);

        scanner.close();
    }
}
