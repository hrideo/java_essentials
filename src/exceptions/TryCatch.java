/*
try catch blocks:
-When there's a statement that throws a possible exception, we can place that statement inside a try block.

-We follow the try block with a catch block
 Inside of the catch parentheses, we have to specify the exception that we're going to catch.
 We specify that as the type and then we give this a variable name. By convention, people typically name this e.
 Inside of catch braces we could do anything like print a message or creating the directory that's needed and then re-executing the code
 */
package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args){
//using the File class from Java to create a File object
//we've given it a path that does not exist, so now we'll have compilation error stating there's an unhandled exception named IO exception.
        File file = new File("resources/nonexistent.txt");
        try{
            //createNewFile method will create the new file if given directory exists,
            //in case of an error, the createNewFile method will throw an IO exception.
            file.createNewFile();
        }catch(IOException e){
            System.out.println("Sorry, an error has occurred");
        }
    }
}
