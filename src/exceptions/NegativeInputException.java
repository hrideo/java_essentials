/*
this NegativeInputException class will extend exception
this is all that's required to make our own exception.
 */
package exceptions;

public class NegativeInputException extends Exception{

    //now we also create two constructors, a default one and one that accepts a custom message
    public NegativeInputException(){
        this("Input must be greater than or equal to 0");
    }

    public NegativeInputException(String message){
        super(message);
    }
}
