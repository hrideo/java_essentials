package abstraction;

public class ShapeTester {

    public static void main (String[] args) {

        //abstract classes cannot be instantiated, thus below we use new Rectangle for instantiate
        //but look the type of object is abstract ie. Shapes and it is allowed
        Shapes rectangle1 = new Rectangle(5, 7);
        System.out.println(rectangle1.calculateArea());

    }
}
