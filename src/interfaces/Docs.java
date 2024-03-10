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
 */
package interfaces;

public class Docs {
}
