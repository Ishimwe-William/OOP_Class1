package class5;

public class Rectangle {

    static int classVariable;
    int instanceVariable;

    double getPerimeter(double length, double width){
        int localVariable;
        return (length+width)*2;
    }

    double getArea(double length, double width){
        return length*width;
    }
}
