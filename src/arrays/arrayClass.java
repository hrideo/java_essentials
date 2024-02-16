/*
Arrays: are special  variables that act as containers which can hold multiple values

-all values must be of same data type
-the square bracket can appear after data type or array name
-once the length is declared it is fixed

 */
package arrays;

public class arrayClass {

    public static void main(String[] args){

        //declaring array of length 6
        String[] playersA = new String[6];

        //assigning values to array element by mentioning its index
        playersA[0] = "Bob";
        playersA[1] = "Luke";
        playersA[2] = "Dan";
        playersA[3] = "Chad";
        playersA[4] = "Henry";
        playersA[5] = "Joe";

        //reading value of element
        System.out.println("The third player is " + playersA[2]);
        //initializing the array while declaring it
        String[] playersB ={ "Alpha", "Beta"};

    }
}
