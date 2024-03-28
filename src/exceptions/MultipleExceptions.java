package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args){

        File file = new File("files/numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);
            //we want to read every line from file, so we're going to use while loop to print the numbers
            while(fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }
        /*
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
         */
                //OR
        /*
catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
         */
    }
}
