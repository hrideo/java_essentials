/*
Strings: are not primitive data type, and they are also not wrapper class
- string is an object that is sequence of characters
- we can access a string just like we would access an array of characters
 */
package text_processing;

public class TextProcessor {

    public static void main(String[] args){
        countWords("I love Java");
        reverseString("stop");
    }

    public static void countWords(String text){
        //String class contains convenience method split
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        //String class contains convenience method format
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text){
        for(int i = text.length() - 1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
