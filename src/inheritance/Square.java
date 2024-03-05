/*
Overriding methods: allows changing the behavior of an inherited method
-to override a method, we keep the same signature but change body of the method

Overloading methods: is when we have multiple methods with exact same name within the same scope,
 but with different parameter lists
-to overload a method, we keep the same name but change the signature of the method
*/
package inheritance;

public class Square extends Rectangle {

    @Override //this is override annotation, which is encouraged, and lets java know that our intention
    // is to override this method that we inherited from superclass
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
