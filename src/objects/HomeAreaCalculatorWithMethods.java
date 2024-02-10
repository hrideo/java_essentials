package objects;

public class HomeAreaCalculatorWithMethods {

    public static void main (String[] args){
        Rectangle kitchen = new Rectangle(300, 700);
        Rectangle bathroom = new Rectangle(200, 400);
        double totalArea = calculateTotalArea(kitchen, bathroom);
        System.out.println(totalArea);
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
