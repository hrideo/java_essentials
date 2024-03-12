/*
Interface: is similar to abstract class, meaning it is a template of an abstract concept
But, Interfaces are meant to be purely abstract and thus do not have states, this means:
    -Interfaces do not have constructors
    -the values of their fields are final(cannot be changed)
    -other classes implement Interfaces, as opposed to extending them
e.g. using interface keyword in place of class

-Any field defined in interface must be constant (
    Constant meaning it is static and final
        static: can be accessed from any other class without an object instantiation
        final: value assigned at initialization and cannot be changed
    By convention, constants are written in all caps
    )
-Even if static and final modifiers are not explicitly written when declaring the fields it is still
 implicitly both static and final
-In interfaces, unless specified, the methods are implicitly public and abstract


Multiple inheritance: While a class can only extend one class, it can implement multiple interfaces.
-this is how to achieve multiple inheritance in java
-to implement multiple interfaces, the class header must specify a comma delimited list of names of all the
 interfaces that it would like to implement. also need to then implement all abstract methods from those interfaces
 e.g. public class ElectronicBook implements Product, DigitalFile {
 //implement all abstract methods from Product
 //implement all abstract methods from DigitalFile
 }
-If more than one of the interfaces being implemented contain a method with same signature, the implementing class
 can provide one overridden implementation, and that will fulfill the obligation with all the relevant interfaces
 */
package interfaces;

public class Docs {
}
