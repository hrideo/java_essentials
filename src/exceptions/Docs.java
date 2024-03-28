/*
Exception is an event that occurs at runtime due to an error.
An exception disrupts the normal flow of a program.

Exception handling gives us greater control over the user experience of our applications.
We can handle exceptions within our code so that, instead of allowing the program to crash we handle exception in a graceful manner.

There are two categories of exceptions-
1.Checked exceptions: are exceptions that are verified by the compiler before code is executed
-if a method throws checked exception it must declare that in its method signature
-methods use this when there's possibility of recovery
2.Unchecked exceptions: are exceptions that are not verified by the compiler before code is executed
-are used when there's not anything that can be done
-runtime exceptions and all of its subclasses are considered unchecked exceptions
-Unchecked exceptions can be thrown by a method but the method signature does not have to declare it will throw exception

Ways to handle Multiple Exceptions:
    1. Polymorphism - Handles a hierarchy of exceptions
                    when handling exceptions we can use a super class as a way to catch broader exceptions. All exceptions inherit from the exception class
    2. Series of catch blocks - Handles different exceptions in different ways
                    if the series of catch blocks contain related exceptions, the subclasses catch block must appear first
    3. Multiple catch block - Handles unrelated exceptions in same way
                    One block that catches multiple exceptions.
                    If we find the code within catch blocks will be the same, we can eliminate duplication by having one catch block handle multiple exceptions.
                    To do so we list all the exceptions and separate them with pipe
 */
package exceptions;

public class Docs {
}
