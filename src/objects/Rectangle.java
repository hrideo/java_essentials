package objects;

public class Rectangle {
    double length;
    double width;

    double calculatePerimeter(){
        return (2 * length) + (2 *  width);
    }
    double calculateArea(){
        return length * width;
    }

    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length = length;
    }

    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width = width;
    }
}
