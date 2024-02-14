package assignment2;

/**
 * 6. Write an oop statement that prints true if x and y have the same sign (-/+
 */

public class Question6 {
    public static void main(String[] args) {
        int x=9, y=4;

        if((x>0 && y >0) || (x<0 && y<0)){
            System.out.println("Both have the same sign");
            return;
        }
        System.out.println("Both not having the same sign");
    }
}
