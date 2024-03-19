/*
List is one of the most widely used collections.
-lists are ordered.
-a list can also contain duplicate elements.
-some implementations of lists are array lists, link lists, stack, and vector.
 */
package collections;

import java.util.List;
import java.util.ArrayList;

public class Lists {

    public static void main(String[] args){

        List fruits = new ArrayList();
//To add an item to a list, we use the add method.
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);
//we can access elements of a list by their position using the get method. within the parameters we pass in an index.
        System.out.println(fruits.get(2));

//we can replace an element in the list by calling the set method and passing in the index and then new element
        fruits.set(2,"grape");
        System.out.println(fruits);

        fruits.add("lemon");
        System.out.println(fruits);

//if we wanted the index of the first lemon, we can call index of.
        System.out.println("Index of first lemon: " + fruits.indexOf("lemon"));
//if we wanted the index of the last lemon, we can call last index of.
        System.out.println("Index of first lemon: " + fruits.lastIndexOf("lemon"));

//To remove an element from a list. we call the remove method.
//Remove has two overloaded methods for remove:
//    -other that lets us remove by object.(Be careful in this since list allows duplicates. If we removed by
//object, it will remove the first found instance of that object.)
//    -one that lets us remove by index
        fruits.remove(4);
        System.out.println(fruits);

//To create an immutable list, we call the of method. and then add all of the objects within one line.
        List moreFruits = List.of("cherry", "cranberry", "plum");
        System.out.println(moreFruits);
        moreFruits.add("pear");
    }
}
