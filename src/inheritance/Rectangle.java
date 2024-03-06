/*
Limiting access in Inheritance:
-Constructors are not technically members of a class and therefore are not inherited
-All public and protected methods and fields in a superclass are inherited by its subclass
-Private methods and fields are not inherited
-Final methods are inherited but cannot be overridden
-During overriding methods, we can change the access modifier, but it needs to be less strict than original method
 e.g. protected method overridden to be public
 */
package inheritance;

public class Rectangle {

    protected double length;
    protected double width;
    protected int sides = 4;

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

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (2 * length + 2 * width);
    }

    public void print(){
        System.out.println("I am a rectangle");
    }
}
