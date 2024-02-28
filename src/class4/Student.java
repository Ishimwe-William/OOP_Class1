package class4;

/**
 * Access modifiers: private, default, protected, public
 *
 * @Author: William Ishiwme
 * &#064;Version  1.0
 */

//public:   make accessible anywhere in the project
//private:  make not accessible anywhere
//default:  make accessible anywhere in the same package
//protected:make accessible anywhere in the same package and subpackages

public class Student {
    public static void main(String[] x) {
        //non-static method can not call static method
        getId(); //invoking the method
        getId(13); //
    }

    static void getId(){
        System.out.println("We are starting OOP!");
    }
    static void getId(int age){//parameterized method
        System.out.println("We are starting OOP! My Age is: "+age);
    }
}
