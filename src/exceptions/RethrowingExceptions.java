/*
When we write a method that contains code which could potentially throw a checked exception, we have two options:
    catch exception
    rethrow exception

Rethrowing an Exception: means our method will not handle the thrown exception and will pass the burden on to any method that calls this one.
-To rethrow the exception, within the method signature we add the word throws followed by the exception that we’re not catching
-Now, the compilation error has moved to the method that is calling this one. That method is now responsible for catching the exception or rethrowing it.
-If we run a program without catching the exception, the exception goes uncaught, and the program crashes.

Throwing Multiple Exceptions:
If we need to throw more than one exception, we can list them all in the method signature separated by commas.

Polymorphism in the Throws Clause:
Polymorphism also works in the throws clause of a method signature. For example, if we instantiate a class outside of a try block, we won’t get a compilation error even though the constructor throws an exception. That’s because the specific exception extends a more general one. So by declaring that this method throws the more general exception, that covers not just the general exception itself, but also any of its subclasses.

We now have multiple options for dealing with the exceptions that our methods may encounter.
 */
package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RethrowingExceptions {

    public static void main(String[] args) throws IOException {
        rethrowException();
    }

    public static void rethrowException() throws IOException {
        File file = new File("nonexistent/file.txt");
        file.createNewFile();

        Scanner fileReader = new Scanner(file);
    }
}