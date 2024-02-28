package class4;

import java.util.Scanner;

/**
 * Write a value-returning method, isVowel that returns the value true
 * if a given character is a vowel, and otherwise returns false. In main()
 * method accept a string from user and count number of vowels in that string.
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char charEntered = scanner.next().charAt(0);

        scanner.close();

        System.out.println("The character is vowel? "+isVowel(charEntered));
    }

    static boolean isVowel(char c){
        c =Character.toLowerCase(c);
        boolean state = false;
         if (Character.isLetter(c)){
             state= c == 'a' || (c == 'i' || (c == 'o' || (c == 'u' || (c == 'e'))));
         }
        return state;
    }
}
