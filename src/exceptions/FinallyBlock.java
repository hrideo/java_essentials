/*
finally block: is optionally be added below any catch blocks.
-finally block have a set of curly braces.
-Inside we place any code that we wish to execute, no matter what, if exceptions are thrown or if exceptions are not thrown.
 */
package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args){
        File file = new File("files/numbers.txt");
        Scanner fileReader = null;

        try{
            fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }
}
