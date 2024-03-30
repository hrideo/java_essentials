/*
A better approach to closing the resources in a finally block is to use try-with-resources
try-with-resources allows us to declare resources that should be automatically closed after execution of try block
To try-with-resources we use set of parentheses after the word try, and inside declare and initialize resources
We can also specify multiple resources to close, add a semicolon after first resource
These multiple resources will be closed in the reversed order that they were defined
 */
package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.PrintWriter;

public class TryWithResources {

    public static void main(String[] args){
        File inputFile = new File("files/numbers.txt");
        File outputFile = new File("files/output.txt");

        try(
                Scanner fileReader = new Scanner(inputFile);
                //PrintWriter to write output to file
                PrintWriter fileWriter = new PrintWriter(outputFile);
        ){

            while(fileReader.hasNext()){
                //changing System.out to fileWriter
                fileWriter.println(fileReader.nextDouble());
            }
        }catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
