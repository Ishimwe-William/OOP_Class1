package classWork3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student mark: ");
        double mark=scanner.nextDouble();

        if(mark>=80 && mark<=90){
            System.out.println("A");
            printRangeValues(80,90);
        }else if(mark>=70 && mark<80){
            System.out.println("B");
            printRangeValues(70,79);
        } else if (mark>=50 && mark<70) {
            System.out.println("C");
            printRangeValues(50,69);
        }else {
            System.out.println("S");
        }
    }
    static void printRangeValues(int start, int end){
        for(int i=start;i<=end;i++){
            System.out.print(i+" ");
        }
    }
}
