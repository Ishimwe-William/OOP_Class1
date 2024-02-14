package assignment2;
/**
 * 5. Write an oop statement that prints true if both x and y are positive numbers
 */

public class Question5 {
    public static void main(String[] args) {
        int x=2,y=-4;
        if(x>0 && y > 0){
            System.out.println(true);
            return;
    }
        System.out.println("One number is not positive");
    }
}
