/*
sometimes we may need to flag errors within the code we write. We can do this by throwing exceptions.
To throw an exception, we write the word throw followed by an instantiation of an existing exception:
    we can throw one of the exceptions provided by the Java language
                        OR
    we can even create a new exception class for our needs
*/
package exceptions;

public class ThrowingExceptions {

    //Because our method is throwing a checked exception(NegativeInputException), we are specifying that in the method signature
    public static double calculatePay (double hours, double payRate) throws NegativeInputException{
        //Here throwing IllegalArgumentException provided by Java
        if(hours > 40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
            //In this, we pass in a message that will be printed in the stack trace as well as returned by the exception's get message method.
            //Because illegal argument exception extends runtime exception, it is an unchecked exception so we do not need to declare that our method throws this exception.
        }
        //This time we're throwing a checked exception, which we'll create our own
        //So we are going to create a new class called NegativeInputException.java
        //this condition means if hours is less than zero, or if the pay rate is less than zero
        if(hours < 0 || payRate < 0){
            throw new NegativeInputException();
        }
        return hours * payRate;
    }
}
