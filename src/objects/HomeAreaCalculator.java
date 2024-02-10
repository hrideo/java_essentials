package objects;

public class HomeAreaCalculator {

    public static void main(String[] args){
        //objects use classes as their data types

        //calling default constructor Rectangle()
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        //calling our declared constructor Rectangle(length, width)
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        System.out.println(areaOfRoom1);
        System.out.println(areaOfRoom2);
    }
}
