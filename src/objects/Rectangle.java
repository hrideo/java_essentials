package objects;

public class Rectangle {
    //encapsulation- private access modifiers to fields(data), public access modifiers to methods(functions)

    private double length;
    private double width;

    //in addition to using setter to assign values to fields, 'constructors' can also be used

    // default constructor- blank constructor that does nothing, even if not declared still it exists
    public Rectangle(){
        length = 0;
        width = 0;
    }

    //our declared constructor for creating Rectangle object with length width
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 *  width);
    }
    public double calculateArea(){
        return length * width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
