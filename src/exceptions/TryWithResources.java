/*
A better approach to closing the resources in a finally block is to use try-with-resources
try-with-resources allows us to declare resources that should be automatically closed after execution of try block
To try-with-resources we use set of parentheses after the word try, and inside declare and initialize resources
 */
package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args){
        File inputFile = new File("files/numbers.txt");

        try(Scanner fileReader = new Scanner(inputFile)){

            while(fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
