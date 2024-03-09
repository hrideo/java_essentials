/*
-the Rectangle class inherited an abstract method when it extended Shape class, and now it is responsible
 for implementation of that method.
- we can choose to implement the method or declare Rectangle as abstract class as well, if we choose the second
 option then we push the burden if implementing the abstract method to any class that extends Rectangle.
-but what if shape had 20 abstract methods, Rectangle could implement 5 methods, and then we declare rectangle
 as abstract. the remaining 15 methods would need be implemented by a subclass of rectangle, but we will have to use
 */
package abstraction;

public class Rectangle extends Shapes{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
